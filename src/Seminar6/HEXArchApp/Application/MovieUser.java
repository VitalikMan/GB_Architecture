package Seminar6.HEXArchApp.Application;

import Seminar6.HEXArchApp.Domain.MovieSearchRequest;
import Seminar6.HEXArchApp.Ports.iUserInput;

public class MovieUser {
    private iUserInput userInputDriverPort;

    public MovieUser(iUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
