import javafx.application.Application;
import javafx.stage.Stage;


public class entrypoint extends Application {
    @Override
    public void start(Stage stage) {
        initUI(stage, new Calculator());

    }

    private void initUI(Stage primaryStage, Calculator calculator) {


        //AnchorPane paneMain = new AnchorPane();
        //Scene calculator = new Scene(paneMain);
        //primaryStage.setScene(calculator);
        //primaryStage.show();
        primaryStage.close();
    }


}