package views;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class LabelPanel extends HBox {
    Label label;
    public LabelPanel() {
        this.initComponent();
    }
    private void initComponent() {
        this.label = new Label("A háromszög területének számítása");
        HBox.setMargin(this.label, new Insets(10, 10, 10, 10));
        this.getChildren().add(this.label);
    }
    
}
