package Seminar8.MVCApp.Model;

import java.util.List;

import Seminar8.MVCApp.Controller.Interfaces.iGetModel;
import Seminar8.MVCApp.Model.Domain.Student;

public class Model implements iGetModel {

    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}