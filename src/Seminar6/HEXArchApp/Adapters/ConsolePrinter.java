package Seminar6.HEXArchApp.Adapters;

import java.util.List;

import Seminar6.HEXArchApp.Domain.MovieReview;
import Seminar6.HEXArchApp.Ports.iPrintMovieReviews;

public class ConsolePrinter implements iPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}