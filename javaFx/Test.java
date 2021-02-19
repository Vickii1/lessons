   import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Stage;
   import javafx.scene.layut.Boderpane;
   import javafx.scene.control.Label;

   public class Test04 extends Application {
     public static void main( String[] args ) {
       launch( args );
     }
     
     @Override
     public void start( Stage stage ) throws Exception {
       String msg = "hello java";
       String name = "satomi";
       String c1 = "IG12";
      
       Label h01 = new Label(msg);
       Label h02 = new Label(name);
       Label h03 = new Label(c1);
      
      BorderPane pa = new BorderPne();
      pa.setTop(h01);
      pa.setCenter(h02);
      pa.setBottom(h03);
      
      Scene scene = new Scene(pane,300,200);
       stage.setScene(scene);
       stage.show();
     }
   }



