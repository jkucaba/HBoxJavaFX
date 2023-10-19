package com.jakubku.hbox.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setFillWidth(true);
        TextArea textArea = new TextArea();
        VBox.setVgrow(textArea, Priority.ALWAYS);
        VBox.setMargin(textArea, new Insets(0,10,0,10));
        vbox.getChildren().add(textArea);
        Scene scene = new Scene(vbox, 500, 450);
        stage.setScene(scene);
        stage.setTitle("VBox Layout Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
