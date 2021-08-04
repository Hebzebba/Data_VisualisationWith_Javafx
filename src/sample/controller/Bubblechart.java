package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Bubblechart implements Initializable {
    @FXML
    private BubbleChart<?, ?> bubble_chart;
    @FXML
    private NumberAxis bubble_x;
    @FXML
    private NumberAxis bubble_y;

    void drawBubbleChart(){
        bubble_chart.setTitle("Budget Monitoring");
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Product 1");
        series1.getData().add(new XYChart.Data(3, 35));
        series1.getData().add(new XYChart.Data(12, 60));
        series1.getData().add(new XYChart.Data(15, 15));
        series1.getData().add(new XYChart.Data(22, 30));
        series1.getData().add(new XYChart.Data(28, 20));
        series1.getData().add(new XYChart.Data(35, 41));
        series1.getData().add(new XYChart.Data(42, 17));
        series1.getData().add(new XYChart.Data(49, 30));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Product 2");
        series2.getData().add(new XYChart.Data(8, 15));
        series2.getData().add(new XYChart.Data(13, 23));
        series2.getData().add(new XYChart.Data(15, 45));
        series2.getData().add(new XYChart.Data(24, 30));
        series2.getData().add(new XYChart.Data(38, 78));
        series2.getData().add(new XYChart.Data(40, 41));
        series2.getData().add(new XYChart.Data(45, 57));
        series2.getData().add(new XYChart.Data(47, 23));

        bubble_chart.getData().addAll(series1,series2);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    drawBubbleChart();
    }
}
