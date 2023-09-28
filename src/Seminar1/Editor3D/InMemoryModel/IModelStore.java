package Seminar1.Editor3D.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import Seminar1.Editor3D.ModelElements.Camera;
import Seminar1.Editor3D.ModelElements.Flash;
import Seminar1.Editor3D.ModelElements.PoligonalModel;
import Seminar1.Editor3D.ModelElements.Scene;
import Seminar1.Editor3D.ModelElements.Texture;

public class IModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;

    public IModelStore(IModelChangedObserver[] changedObservers) throws Exception {

        this.changedObservers = changedObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    public Scene getScena (int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }

        }
        return null;
    }

    // Регистрирует изменения модели
    @Override
    public void notifyChange (IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");

    }


}
