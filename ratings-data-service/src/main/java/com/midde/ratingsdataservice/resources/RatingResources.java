package com.midde.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midde.ratingsdataservice.model.Rating;
import com.midde.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingResources {

	@RequestMapping("/{ratingId}")
	UserRating getRatingInfo(String movieId) {
		List<Rating> userrating = Arrays.asList(new Rating("101", "4"), new Rating("102", "3"), new Rating("103", "5"));
		return new UserRating(userrating);
	}
}
