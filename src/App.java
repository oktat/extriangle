import controllers.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainController mainController = new MainController();
        primaryStage.setTitle("Háromszög");
        primaryStage.setScene(new Scene(mainController.getMainView()));
        primaryStage.show();
    }
}
