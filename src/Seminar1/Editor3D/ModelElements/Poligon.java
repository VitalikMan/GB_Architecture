package Seminar1.Editor3D.ModelElements;

import Seminar1.Editor3D.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {

    public List<Point3D> points = new ArrayList<>();

    public Poligon (Point3D point) {
        points.add(point);
    }
}
