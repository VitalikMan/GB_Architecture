package Seminar8.MVCApp.Controller.Interfaces;

import java.util.List;

import Seminar8.MVCApp.Model.Domain.Student;

public interface iGetView {
    public void printAllStudent(List<Student> students);
}
