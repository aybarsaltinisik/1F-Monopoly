import controllers.scenecontrollers.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;
import storage.filemanager.DataManager;

import static storage.filemanager.DataManager.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
        SceneManager.getInstance().setStage(stage);
        SceneManager.getInstance().showMainMenuScene();
    }
}
