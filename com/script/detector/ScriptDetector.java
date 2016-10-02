package com.script.detector;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.Vector;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ScriptDetector {
	@SuppressWarnings("resource")
	public String getData() throws JsonParseException, JsonMappingException, IOException {
	   
		System.out.println("Copy paste your code here");
		Scanner input; 
		String accept ;      
        Vector<String> list = new Vector<String>();
        String theString;
        
        do {
            input = new Scanner(System.in);            
            accept = input.nextLine();
            if (accept.length() > 0) {  //if not empty input, add to Vector
                list.add(accept);
            } else {                    //if empty input, exit do-while loop
                break;
            }
        } while (true);                 //run forever
        {theString = list.toString();}
        
   	   String sample_Text = URLEncoder.encode(theString.toString(), "UTF-8");  
   	     	    
   	URL jsonUrl = new URL("https://searchcode.com/api/codesearch_I/?q="+sample_Text );
	 
	    @SuppressWarnings("unused")
		Object_model user = null;
	    
	    ObjectMapper mapper = new ObjectMapper();
	try{
		    // IMPORTANT
		    // without this option set adding new fields breaks old code
		    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		    JsonNode rootNode = mapper.readTree(jsonUrl);
	        JsonNode firstResult = rootNode.get("language_filters").get(0);
	        String language = firstResult.get("language").toString();
	        
		    user = mapper.readValue(jsonUrl, Object_model.class);
		    
		    return language;	
		  }
	catch(Exception e){
		return e.getMessage();
	}
	}
	public static void main(String[] args) {
		
	}
}
