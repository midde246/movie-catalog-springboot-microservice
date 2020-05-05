package com.midde.moviecatalogservice.model;

public class Rating {

	private String movieId;
	private String ratings;
	
	public Rating() {
		// TODO Auto-generated constructor stub
	}
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
