package Seminar6.HEXArchApp.Ports;

import java.util.List;

import Seminar6.HEXArchApp.Domain.MovieReview;

public interface iPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
