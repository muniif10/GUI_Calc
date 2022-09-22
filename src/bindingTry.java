import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class bindingTry{
    public GridPane getTheUI(){
        GridPane thePane = new GridPane();
        thePane.setHgap(8);
        thePane.setVgap(8);
        thePane.setPadding(new Insets(5));

        ColumnConstraints cons1 = new ColumnConstraints();
        cons1.setHgrow(Priority.NEVER);

        return thePane;
    }

}