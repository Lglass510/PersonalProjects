package com.mav.rpgbuilder.GUI;

import com.mav.rpgbuilder.legends.Character;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class StartScreen extends Application {
    private MediaPlayer mediaPlayer;

    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Welcome to Heavens Arena");
        welcomeLabel.setStyle("-fx-font-size: 28px; -fx-font-weight: bold;");

        Label taglineLabel = new Label("Where legends are made");
        taglineLabel.setStyle("-fx-font-size: 16px; -fx-font-style: italic;");


        Media sound = new Media(getClass().getResource("/Mysterious-Magic.mp3").toExternalForm());
        mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();

        Button chooseChampionButton = new Button("Choose Your Champion");
        chooseChampionButton.setStyle("-fx-font-size: 14px; -fx-padding: 10 20 10 20;");
        chooseChampionButton.setOnAction(e -> showCharacterSelection(primaryStage));

        //Layout container
        VBox layout = new VBox(25); //spacing 25 px between elements
        layout.getChildren().addAll(welcomeLabel, taglineLabel, chooseChampionButton);
        layout.setStyle("-fx-alignment: center; -fx-padding: 80px;");

        //Scene setup
        Scene scene = new Scene(layout, 600,350);

        primaryStage.setTitle("Heavens Arena - Start Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
    }

    private void showCharacterSelection(Stage stage){
        //placeholder for character selection not built yet
        Label chooseLabel = new Label("Character Selection Screen");
        chooseLabel.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");

        Button backButton = new Button("Back to Start Screen");
        backButton.setOnAction(e -> start(stage));

        VBox characterLayout = new VBox(30, chooseLabel, backButton);
        characterLayout.setStyle("-fx-alignment: center; -fx-padding: 80px;");

        Scene characterScene = new Scene(characterLayout, 600,350);
        stage.setScene(characterScene);
        characterScene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
    }
    public static void main(String[] args) {
        launch(args);
    }

}
