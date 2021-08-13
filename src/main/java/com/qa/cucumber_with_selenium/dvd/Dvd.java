package com.qa.cucumber_with_selenium.dvd;

public class Dvd {

	private int id;
	private String title;
	private int year;
	private String actor;

	public Dvd() { }
	
	public Dvd(int id, String title, int year, String actor) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.actor = actor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return id + " - " + title + " - " + year + " - " + actor;
	}

}
