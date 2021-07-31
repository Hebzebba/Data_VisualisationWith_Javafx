package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    PieChart pie_chart;
    @FXML
    BarChart<?,?> bar_chart;
    @FXML
    CategoryAxis xAxis;
    @FXML
    NumberAxis yAxis;
    @FXML
    private BubbleChart<?, ?> bubble_chart;
    @FXML
    private NumberAxis bubble_x;
    @FXML
    private NumberAxis bubble_y;
    @FXML
    private ScatterChart<?, ?> scatter_chat;
    @FXML
    private CategoryAxis scatter_x;
    @FXML
    private NumberAxis scatter_y;


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

    void drawBarChart (){
            String austria = "Austria";
            String brazil = "Brazil";
            String france = "France";
            String italy = "Italy";
            String usa = "USA";

            bar_chart.setTitle("Country Summary");
            XYChart.Series series1 = new XYChart.Series();
            series1.setName("2003");
            series1.getData().add(new XYChart.Data(austria, 25601.34));
            series1.getData().add(new XYChart.Data(brazil, 20148.82));
            series1.getData().add(new XYChart.Data(france, 10000));
            series1.getData().add(new XYChart.Data(italy, 35407.15));
            series1.getData().add(new XYChart.Data(usa, 12000));

            XYChart.Series series2 = new XYChart.Series();
            series2.setName("2004");
            series2.getData().add(new XYChart.Data(austria, 57401.85));
            series2.getData().add(new XYChart.Data(brazil, 41941.19));
            series2.getData().add(new XYChart.Data(france, 45263.37));
            series2.getData().add(new XYChart.Data(italy, 117320.16));
            series2.getData().add(new XYChart.Data(usa, 14845.27));

            XYChart.Series series3 = new XYChart.Series();
            series3.setName("2005");
            series3.getData().add(new XYChart.Data(austria, 45000.65));
            series3.getData().add(new XYChart.Data(brazil, 44835.76));
            series3.getData().add(new XYChart.Data(france, 18722.18));
            series3.getData().add(new XYChart.Data(italy, 17557.31));
            series3.getData().add(new XYChart.Data(usa, 92633.68));


            bar_chart.getData().addAll(series1,series2,series3);
    }

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

    void drawScatterChart(){
        scatter_chat.setTitle("Investment Overview");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Equities");
        series1.getData().add(new XYChart.Data("4.2", 193.2));
        series1.getData().add(new XYChart.Data("2.8", 33.6));
        series1.getData().add(new XYChart.Data("6.2", 24.8));
        series1.getData().add(new XYChart.Data("1", 14));
        series1.getData().add(new XYChart.Data("1.2", 26.4));
        series1.getData().add(new XYChart.Data("4.4", 114.4));
        series1.getData().add(new XYChart.Data("8.5", 323));
        series1.getData().add(new XYChart.Data("6.9", 289.8));
        series1.getData().add(new XYChart.Data("9.9", 287.1));
        series1.getData().add(new XYChart.Data("0.9", -9));
        series1.getData().add(new XYChart.Data("3.2", 150.8));
        series1.getData().add(new XYChart.Data("4.8", 20.8));
        series1.getData().add(new XYChart.Data("7.3", -42.3));
        series1.getData().add(new XYChart.Data("1.8", 81.4));
        series1.getData().add(new XYChart.Data("7.3", 110.3));
        series1.getData().add(new XYChart.Data("2.7", 41.2));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Mutual funds");
        series2.getData().add(new XYChart.Data("5.2", 229.2));
        series2.getData().add(new XYChart.Data("2.4", 37.6));
        series2.getData().add(new XYChart.Data("3.2", 49.8));
        series2.getData().add(new XYChart.Data("1.8", 134));
        series2.getData().add(new XYChart.Data("3.2", 236.2));
        series2.getData().add(new XYChart.Data("7.4", 114.1));
        series2.getData().add(new XYChart.Data("3.5", 323));
        series2.getData().add(new XYChart.Data("9.3", 29.9));
        series2.getData().add(new XYChart.Data("8.1", 287.4));

        scatter_chat.getData().addAll(series1,series2);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        drawPieChart();
        drawBarChart();
        drawBubbleChart();
        drawScatterChart();
    }
}
