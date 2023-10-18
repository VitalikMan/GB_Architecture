package Seminar6.HEXArchApp.Adapters;

import Seminar6.HEXArchApp.Application.MovieApp;
import Seminar6.HEXArchApp.Domain.Model;
import Seminar6.HEXArchApp.Domain.MovieSearchRequest;
import Seminar6.HEXArchApp.Ports.iFetchMovieReviews;
import Seminar6.HEXArchApp.Ports.iPrintMovieReviews;
import Seminar6.HEXArchApp.Ports.iUserInput;

public class UserCommand implements iUserInput {
    private Model model;

    public UserCommand(iFetchMovieReviews fetchMovieReviews, iPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
