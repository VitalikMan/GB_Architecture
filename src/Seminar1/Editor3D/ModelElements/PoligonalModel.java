package Seminar1.Editor3D.ModelElements;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {

    public List<Texture> textures;
    public List<Polygon> polygons;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.polygons = new ArrayList<>();
    }



}
