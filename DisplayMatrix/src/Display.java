import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Display extends Application {

    private static int HEIGHT = 400;
    private static int WIDTH = 400;
    public void start(Stage primaryStage) {


        GridPane pane = new GridPane();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField text = new TextField(Integer.toString((int)(Math.random() * 2)));
                text.setMinWidth(WIDTH / 10.0);
                text.setMaxWidth(WIDTH / 10.0);
                text.setMinHeight(HEIGHT / 10.0);
                text.setMaxHeight(HEIGHT / 10.0);
                pane.add(text, j, i);
            }
        }
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(WIDTH);
        primaryStage.setMinHeight(HEIGHT);
        primaryStage.setTitle("Display Matrix");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}