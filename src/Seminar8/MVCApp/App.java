package Seminar8.MVCApp;

import java.util.ArrayList;
import java.util.List;

import Seminar8.MVCApp.Controller.Controller;
import Seminar8.MVCApp.Controller.Interfaces.iGetModel;
import Seminar8.MVCApp.Controller.Interfaces.iGetView;
import Seminar8.MVCApp.Model.Model;
import Seminar8.MVCApp.Model.Domain.Student;
import Seminar8.MVCApp.View.View;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        iGetModel mod = new Model(students);
        iGetView viw = new View();

        Controller cntrl = new Controller(mod, viw);
        cntrl.update();

    }
}