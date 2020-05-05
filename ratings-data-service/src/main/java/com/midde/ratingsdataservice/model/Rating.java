package com.midde.ratingsdataservice.model;

public class Rating {

	private String movieId;
	private String ratings;
	
	public Rating(String movieId, String ratings) {
		super();
		this.movieId = movieId;
		this.ratings = ratings;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
}
