import javafx.application.Application;
　  import javafx.animation.TranslateTransition;
    import javafx.application.Application;
    import javaf x.stage.Stage;
    import javafx.scene.Scene;
　  import javafx.scene.Group;
　  import javafx.scene.paint.Color;
　  import javafx.scene.shape.Circle;
　  
　  public class Test extends Application {
　    public static void main ( String[] args ) {
　      launch( args );
　    }
　    
　    @Override
　    public void start( Stage stage ) throws Exception {
　      
　      Group root = new Group();
　      Scene scene = new Scene( root, 500, 400 );
　      
　  
　      Circle circle = new Circle( 200, 200, 80 );
　 
　      circle.setFill( Color.RED );
　      
　     
　      root.getChildren().add( circle );
　      
　    
　      stage.setScene( scene );
　      stage.show();
　    }
　  }



　  public class Test extends Application {
　    public static void main( String[] args ) {
　      launch( args );
　    }
　    
　    @Override
　    public void start( Stage stage ) throws Exception {
　      View v = new View();			// View は Group を継承している
　      Scene scene = new Scene( v, 500, 400 );
　      stage.setScene( scene );
　      stage.show();
　    }
　  }
　  
　  
　  
　  class View extends Group {
　    public View() {
　     
　      Circle circle = new Circle( 200, 200, 30 );
　      circle.setFill( Color.BLUE );
　      
　     
　      TranslateTransition animation = new TranslateTransition( Duration.senconds(2), circle );
　      
　      
　      animation.setFromX(50);
　      animation.setFromY(400);
　      animation.setToX(400);
　      animation.setToY(100);
　      
　    
　      animation.setCycleCount( Animation.INDEFINITE );
　      
　     
　      animation.play();
　      getChildren().add( circle );
　    }
　  }