package Seminar6.HEXArchApp.Adapters;


import java.util.*;

import Seminar6.HEXArchApp.Domain.MovieReview;
import Seminar6.HEXArchApp.Domain.MovieSearchRequest;
import Seminar6.HEXArchApp.Ports.iFetchMovieReviews;

public class MovieReviewsRepo implements iFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewsRepo() {
        initialize();
    }

    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}