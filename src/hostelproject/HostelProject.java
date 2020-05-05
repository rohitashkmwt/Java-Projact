package hostelproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

public class HostelProject extends Application
{
    static Scene scene;
    static Statement statement;

    @Override
    public void start(Stage stage) throws SQLException, IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        scene = new Scene(root);
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        Image ico=new Image(" ");
        stage.setTitle("Sabari Hall of Residence");
        stage.getIcons().add(ico);
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }    
}