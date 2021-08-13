package com.qa.cucumber_with_selenium.dvd;

public class DvdBuilder {

	private Dvd dvdStoreBuild;
	
	public DvdBuilder() {
		this.dvdStoreBuild = new Dvd();
	}
	
	public Dvd build() {
		return this.dvdStoreBuild;
	}
	
	public DvdBuilder id(int id) {
		dvdStoreBuild.setId(id);
		return this;
	}
	
	public DvdBuilder title(String title) {
		dvdStoreBuild.setTitle(title);
		return this;
	}
	
	public DvdBuilder year(int year) {
		dvdStoreBuild.setYear(year);
		return this;
	}
	
	public DvdBuilder actor(String actor) {
		dvdStoreBuild.setActor(actor);
		return this;
	}
}
