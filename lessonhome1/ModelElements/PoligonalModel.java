package lessonhome1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        poligons = new ArrayList<>();
        List<Point3D> result = new ArrayList<>();
        poligons.add(new Poligon(result));
    }

}
