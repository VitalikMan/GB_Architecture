package Seminar6.HEXArchApp.Ports;

import java.util.List;

import Seminar6.HEXArchApp.Domain.MovieReview;
import Seminar6.HEXArchApp.Domain.MovieSearchRequest;

public interface iFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
