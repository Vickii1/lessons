import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;

public class Balltest extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage){
		stage.setTitle("ballTest");
		Pane pane=new Pane();
		Scene scene=new Scene(pane);
		stage.setScene(scene);

		Canvas canvas=new Canvas(1280,960);
		GraphicsContext gc=canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);

		BreakoutThread breakoutthread=new BreakoutThread(gc);
		breakoutthread.start();

		stage.show();
	}
}
class BreakoutThread extends AnimationTimer{
	private GraphicsContext gc;
	private Ball ball;
	public  BreakoutThread(GraphicsContext gc){
		this.gc=gc;
		ball=new Ball();
	}
	@Override
	public void handle(long time){
		gc.clearRect(0,0,1280,960);
		ball.draw(gc);

		ball.move();
	}
}
class Ball{
	private double x;
	private double y;
	private double xs;
	private double ys;
	public Ball(){
		this.x=20;this.y=20;
		this.xs=5;this.ys=5;
	}
	public void draw(GraphicsContext gc){
		gc.setFill(Color.RED);
		gc.fillOval(x,y,20,20);
	}
	public void move(){
		this.x+=this.xs;this.y+=this.ys;
		if ()
	}
}