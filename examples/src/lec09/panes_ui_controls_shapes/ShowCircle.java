package lec09.panes_ui_controls_shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.AQUAMARINE);
    
    //String myStyle = "-fx-stroke: black; -fx-fill: aquamarine;";
    //circle.setStyle(myStyle);
    
    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().add(circle);
    
    Button bt1 = new Button("OK");
    pane.getChildren().add(bt1);
    
    //bt1.setLayoutX(100);
    //bt1.setLayoutY(100);
    
    
    //pane.getChildren().add(new Button("OK 2"));
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("ShowCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    Application.launch(args);
  }
}