package com.script.detector;

public class Object_model {

	private String total;

	private Language_filters[] language_filters;

	private String nextpage;

	private String page;

	private String query;

	private String searchterm;

	private String matchterm;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Language_filters[] getLanguage_filters() {
		return language_filters;
	}

	public void setLanguage_filters(Language_filters[] language_filters) {
		this.language_filters = language_filters;
	}

	public String getNextpage() {
		return nextpage;
	}

	public void setNextpage(String nextpage) {
		this.nextpage = nextpage;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSearchterm() {
		return searchterm;
	}

	public void setSearchterm(String searchterm) {
		this.searchterm = searchterm;
	}

	public String getMatchterm() {
		return matchterm;
	}

	public void setMatchterm(String matchterm) {
		this.matchterm = matchterm;
	}

	@Override
	public String toString() {
		return "ClassPojo [total = " + total + ", language_filters = "
				+ language_filters + ", nextpage = " + nextpage + ", page = "
				+ page + ", query = " + query + ", searchterm = " + searchterm
				+ ", matchterm = " + matchterm + "]";
	}
}