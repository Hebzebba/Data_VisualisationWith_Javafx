package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Piechart implements Initializable {
    @FXML
    PieChart pie_chart;

    void drawPieChart (){
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30));
        pie_chart.setData(pieChartData);
        pie_chart.setTitle("Imported fruits");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        drawPieChart();
    }
}
