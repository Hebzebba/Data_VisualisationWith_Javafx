package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import sample.Fxmloader;

public class LoadPaneController {

    @FXML
    private BorderPane borderPane;

    @FXML
    void loadPieChart(ActionEvent event){
        Fxmloader loader = new Fxmloader();
        Pane view = loader.getPane("pieChart");
        borderPane.setCenter(view);
    }

    @FXML
    void loadBarChart(ActionEvent event){
        Fxmloader loader = new Fxmloader();
        Pane view = loader.getPane("barchart");
        borderPane.setCenter(view);
    }

    @FXML
    void loadScatterGraph(ActionEvent event){
        Fxmloader loader = new Fxmloader();
        Pane view = loader.getPane("scatterChart");
        borderPane.setCenter(view);
    }

    @FXML
    void loadBubbleChart(ActionEvent event){
        Fxmloader loader = new Fxmloader();
        Pane view = loader.getPane("bubbleChart");
        borderPane.setCenter(view);
    }

}
