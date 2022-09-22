
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;



public class entrypoint extends Application {

    @Override
    public void start(Stage stage) {
        bindingTry s = new bindingTry();
        s.toString();
        initUI(stage);

    }

    private void initUI(Stage stage) {

        GridPane root = new GridPane();
        root.setHgap(8);
        root.setVgap(8);
        root.setPadding(new Insets(5));

        ColumnConstraints cons1 = new ColumnConstraints();
        cons1.setHgrow(Priority.NEVER);
        root.getColumnConstraints().add(cons1);

        ColumnConstraints cons2 = new ColumnConstraints();
        cons2.setHgrow(Priority.ALWAYS);

        root.getColumnConstraints().addAll(cons1, cons2);

        RowConstraints rcons1 = new RowConstraints();
        rcons1.setVgrow(Priority.ALWAYS);

        RowConstraints rcons2 = new RowConstraints();
        rcons2.setVgrow(Priority.ALWAYS);

        root.getRowConstraints().addAll(rcons1, rcons2);

        Label lbl = new Label("Name:");
        TextField field = new TextField();
        ObservableList<String> listing = FXCollections.observableArrayList();
        ListView view = new ListView<String>(listing);
        Button okBtn = new Button("Insert");
        Button delBtn = new Button("Delete Selected");

        delBtn.setOnAction(e->{
            try {
                if (view.getSelectionModel().getSelectedIndex() == -1){
                    throw new Exception("Nothing selected");
                }
                listing.remove(view.getSelectionModel().getSelectedIndex());
            }
            catch(Exception v){
                System.out.println(v.getMessage());
            }
        });
        okBtn.setOnAction(e->{
            String content = field.getText();
            listing.add(content);
            field.clear();

        });
        Button closeBtn = new Button("Close");
        closeBtn.setOnAction(e ->{

            System.out.println("Closing...");
            stage.close();
        });

        GridPane.setHalignment(okBtn, HPos.RIGHT);

        root.add(lbl, 0, 0);
        root.add(field, 1, 0, 3, 1);
        root.add(view, 0, 1, 4, 2);
        root.add(delBtn,1,3);
        root.add(okBtn, 2, 3);
        root.add(closeBtn, 3, 3);


        Scene scene = new Scene(root, 280, 300);

        stage.setTitle("GridPane column row test");
        stage.setScene(scene);
        stage.getIcons().add(new Image("dun.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}