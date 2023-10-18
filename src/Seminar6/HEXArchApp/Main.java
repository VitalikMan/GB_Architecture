package Seminar6.HEXArchApp;

import Seminar6.HEXArchApp.Adapters.ConsolePrinter;
import Seminar6.HEXArchApp.Adapters.MovieReviewsRepo;
import Seminar6.HEXArchApp.Adapters.UserCommand;
import Seminar6.HEXArchApp.Application.MovieUser;
import Seminar6.HEXArchApp.Domain.MovieSearchRequest;
import Seminar6.HEXArchApp.Ports.iFetchMovieReviews;
import Seminar6.HEXArchApp.Ports.iPrintMovieReviews;
import Seminar6.HEXArchApp.Ports.iUserInput;

public class Main {
    public static void main(String[] args) throws Exception {

        iFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        iPrintMovieReviews printMovieReviews = new ConsolePrinter();

        iUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        MovieUser movieUser = new MovieUser(userCommand);

        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);

        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);
        // System.out.println("Hello, World!");
    }
}
