package Seminar8.MVCApp.View;

import java.util.List;

import Seminar8.MVCApp.Controller.Interfaces.iGetView;
import Seminar8.MVCApp.Model.Domain.Student;

public class View implements iGetView {

    public void printAllStudent(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}