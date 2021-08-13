package com.qa.cucumber_with_selenium.dvd;

import java.util.ArrayList;
import java.util.List;

public class DvdStore {

	private List<Dvd> dvdCatalog;
	
	public DvdStore() {
		this.dvdCatalog = new ArrayList<>();
	}
	
	public void add(Dvd dvd) {
		this.dvdCatalog.add(dvd);
	}

	public List<Dvd> getDvdCatalog() {
		return this.dvdCatalog;
	}

	public void remove(Dvd dvd) {
		this.dvdCatalog.remove(dvd);
	}

	public void update(int index, String newTitle) {
		this.dvdCatalog.get(index).setTitle(newTitle);
	}

}
