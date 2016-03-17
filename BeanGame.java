//U10416020 

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class BeanGame extends Application{
	//Override the start method in the application class
	@Override
	public void start(Stage primaryStage){
		//Create and set a scene
		Scene scene = new Scene(new AllPane(), 500, 500);
		
		//Set stage
		primaryStage.setTitle("U10416020");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//Inner class
	class AllPane extends Pane{
		//Constructor
		AllPane(){	
			//Create and set all line for bean game
			Line lineH = new Line(90, 400, 410, 400);		
			lineH.setStrokeWidth(3);
		
			Line lineV1 = new Line(90, 400, 90, 320);		
			lineV1.setStrokeWidth(3);
		
			Line lineV2 = new Line(130, 400, 130, 320);		
			lineV2.setStrokeWidth(3);
		
			Line lineV3 = new Line(170, 400, 170, 320);		
			lineV3.setStrokeWidth(3);
		
			Line lineV4 = new Line(210, 400, 210, 320);		
			lineV4.setStrokeWidth(3);
		
			Line lineV5 = new Line(250, 400, 250, 320);		
			lineV5.setStrokeWidth(3);
		
			Line lineV6 = new Line(290, 400, 290, 320);		
			lineV6.setStrokeWidth(3);
		
			Line lineV7 = new Line(330, 400, 330, 320);		
			lineV7.setStrokeWidth(3);
		
			Line lineV8 = new Line(370, 400, 370, 320);		
			lineV8.setStrokeWidth(3);
		
			Line lineV9 = new Line(410, 400, 410, 320);		
			lineV9.setStrokeWidth(3);

			Line lineS1 = new Line(90, 320, 230, 100);
			lineS1.setStrokeWidth(3);
		
			Line lineS2 = new Line(410, 320, 270, 100);
			lineS2.setStrokeWidth(3);
		
			Line lineV10 = new Line(230, 100, 230, 70);
			lineV10.setStrokeWidth(3);
		
			Line lineV11 = new Line(270, 100, 270, 70);
			lineV11.setStrokeWidth(3);
		
			//Add all line to the pane
			getChildren().addAll(lineH, lineV1, lineV2, lineV3, lineV4, lineV5, 
			lineV6, lineV7, lineV8, lineV9, lineS1, lineS2, lineV10, lineV11);
		}
	}		
}
