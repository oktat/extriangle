package views;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class InputPanel extends HBox {
    Label label;
    TextField field;
    public InputPanel() {
        this.generateComponent();
        this.setComponent();
        this.addComponentToPanel();
    }
    public InputPanel(String labelText) {
        this.setComponent();
        this.label.setText(labelText);
    }
    private void generateComponent() {
        this.label = new Label();
        this.field = new TextField();
    }
    private void setComponent() {
        HBox.setMargin(this.label, new Insets(10, 10, 10, 10));
        HBox.setMargin(this.field, new Insets(10, 10, 10, 10));
        this.label.setMinHeight(25);
        this.label.setMinWidth(100);
    }
    private void addComponentToPanel() {
        this.getChildren().add(this.label);
        this.getChildren().add(this.field);
    }
    public void setText(String text) {
        this.label.setText(text);
    }
    public String getText() {
        return this.label.getText();
    }
    public void setValue(String value) {
        this.field.setText(value);
    }
    public String getValue() {
        return this.field.getText();
    }
}
