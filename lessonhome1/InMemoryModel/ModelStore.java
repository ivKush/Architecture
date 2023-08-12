package lessonhome1.InMemoryModel;

import java.util.List;

import lessonhome1.ModelElements.Camera;
import lessonhome1.ModelElements.Flash;
import lessonhome1.ModelElements.PoligonalModel;
import lessonhome1.ModelElements.Scene;

public class ModelStore implements IModelChanger, IModelChangedObserver {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changeObservers;

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras,
            List<IModelChangedObserver> changeObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changeObservers = changeObservers;
    }

    public List<Scene> getScena(int arg) {
        return scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
    }

    @Override
    public void applyUpdateModel() {
    }
}
