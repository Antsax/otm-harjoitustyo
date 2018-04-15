package swervinderwin.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import swervinderwin.miscellaneous.MainMenuButtons;

/**
 *
 * @author antsax
 */
public class MainMenu extends Application {

    int width = 1200;
    int height = 800;

    @Override
    public void start(Stage menu) {
        menu.setTitle("Swervin' Derwin!");
        Pane pane = new Pane();
        pane.setPrefSize(width, height);
        Scene main = new Scene(pane, width, height, Color.BLACK);
        pane.setStyle("-fx-background-color: #000000");

        //Derwin
        Image image = new Image("File:derwinStill.png");
        ImageView derwin = new ImageView(image);
        derwin.setFitHeight(height / 1.6);
        derwin.setFitWidth(width / 2);
        derwin.setTranslateX(width / 3.3);
        derwin.setTranslateY(height / 100);

        //title of the game
        Text title = new Text("Swervin' Derwin");
        title.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 70));
        title.setTranslateX(width / 9);
        title.setTranslateY(height / 5);
        title.setFill(Color.WHITE);

        //Start, Exit and High Scores -buttons
        VBox buttons = new MainMenuButtons(menu, width, height).getButtons();

        pane.getChildren().addAll(derwin, title, buttons);

        menu.setScene(main);
        menu.show();
    }

    public static void main(String[] args) {
        launch(MainMenu.class);
    }
}
