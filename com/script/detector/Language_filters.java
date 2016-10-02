package com.script.detector;

public class Language_filters {

	private String id;

	private String count;

	private String language;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", count = " + count + ", language = "
				+ language + "]";
	}

}
