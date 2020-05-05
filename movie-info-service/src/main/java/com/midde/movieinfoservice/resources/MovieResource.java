package com.midde.movieinfoservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midde.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@RequestMapping("/{movieId}")
	Movie getMovieInfo(String movieId) {
		return new Movie("101", "Boyomkesh Fire Elo");
	}
}
