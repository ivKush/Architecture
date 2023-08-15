package lessonhome1.ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        if (models.size() > 0) {
            this.models = models;
        } else
            throw new Exception("Должна быть хотя бы одна модель");
        this.flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else
            throw new Exception("Должна быть хотя бы одна камера");
        this.id = id;
    }

    public <T> T metood1(T arg) {
        return arg;
    }

    public <T, E> T metood1(T arg1, E arg2) {
        return arg1;
    }
}
