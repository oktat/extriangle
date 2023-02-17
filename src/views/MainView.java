package views;

import javafx.scene.layout.VBox;

public class MainView extends VBox {
    LabelPanel labelPanel;
    InputPanel baseInputPanel;
    InputPanel heightInputPanel;
    ButtonPanel buttonPanel;
    InputPanel areaInputPanel;

    public MainView() {        
        this.initComponent();
        this.setComponent();
        this.addComponent();
    }
    private void initComponent() {
        this.labelPanel = new LabelPanel();
        this.baseInputPanel = new InputPanel();
        this.heightInputPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.areaInputPanel = new InputPanel();
    }
    private void setComponent() {
        this.baseInputPanel.setText("Alap");
        this.heightInputPanel.setText("Magasság");
        this.areaInputPanel.setText("Terület");
    }
    private void addComponent() {
        this.getChildren().add(this.labelPanel);
        this.getChildren().add(this.baseInputPanel);
        this.getChildren().add(this.heightInputPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.areaInputPanel);
    }
    public ButtonPanel getButtonPanel() {
        return this.buttonPanel;
    }
    public LabelPanel getLabelPanel() {
        return labelPanel;
    }
    public InputPanel getBaseInputPanel() {
        return baseInputPanel;
    }
    public InputPanel getHeightInputPanel() {
        return heightInputPanel;
    }
    public InputPanel getAreaInputPanel() {
        return areaInputPanel;
    }
    
}
