package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {




    public static void main(String[] args) {

        Application.launch(args);
    }


    public void start(Stage args) throws Exception {
        Stage stage1=new Stage();

        Parent parent=FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene=new Scene(parent);
        stage1.setScene(scene);
        stage1.show();
    }
}
