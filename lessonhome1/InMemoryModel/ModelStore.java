package lessonhome1.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import lessonhome1.ModelElements.Camera;
import lessonhome1.ModelElements.Flash;
import lessonhome1.ModelElements.PoligonalModel;
import lessonhome1.ModelElements.Scene;

public class ModelStore implements IModelChanger {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changeObserver;

    public ModelStore(List<IModelChangedObserver> changedObserver)
            throws Exception {
        this.changeObserver = changedObserver;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    public Scene getScena(int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if(scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
    }

}
