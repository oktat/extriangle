package controllers;

import javafx.scene.control.Button;
import models.Triangle;
import views.MainView;

public class MainController {
    MainView mainView;
    public MainController() {
        this.mainView = new MainView();
        this.handleEvent();
    }
    public MainView getMainView() {
        return this.mainView;
    }
    public void handleEvent() {
        Button calcButton = this.mainView.getButtonPanel().getCalcButton();
        calcButton.setOnAction(event -> {
            onClickCalcButton();
        });
    }
    private void onClickCalcButton() {
        double base = Double.parseDouble(this.mainView.getBaseInputPanel().getValue());
        double height = Double.parseDouble(this.mainView.getHeightInputPanel().getValue());
        Double area = Triangle.calcArea(base, height);
        this.mainView.getAreaInputPanel().setValue(area.toString());
    }
}
