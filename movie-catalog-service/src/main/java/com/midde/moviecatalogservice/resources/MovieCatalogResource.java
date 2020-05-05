package com.midde.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.midde.moviecatalogservice.model.CatalogItem;
import com.midde.moviecatalogservice.model.Movie;
import com.midde.moviecatalogservice.model.Rating;
import com.midde.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId) {
		//Getting Movie Ratings....
		UserRating userRating = restTemplate.getForObject("http://localhost:8083/ratings/101", UserRating.class);
		return userRating.getUsereRating().stream().map(rating -> {
			//Getting Movie Info....
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/101", Movie.class);
			//Put All Togeather....
			return new CatalogItem (movie.getName(), "Thirrler Movie", rating.getRatings());
		}).collect(Collectors.toList());
	}
}
