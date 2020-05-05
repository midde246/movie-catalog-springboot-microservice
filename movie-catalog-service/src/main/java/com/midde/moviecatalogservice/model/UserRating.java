package com.midde.moviecatalogservice.model;

import java.util.List;

public class UserRating {
	private List<Rating> usereRating;

	public UserRating() {
		
	}
	
	public UserRating(List<Rating> userRating) {
		this.usereRating = userRating;
	}
	public List<Rating> getUsereRating() {
		return usereRating;
	}

	public void setUsereRating(List<Rating> usereRating) {
		this.usereRating = usereRating;
	}
	
}
