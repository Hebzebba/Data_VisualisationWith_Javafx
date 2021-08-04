package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.net.URL;

public class Fxmloader {
    private Pane pane;

    public  Pane getPane(String fileName){
        try {
            URL fileUrl = Main.class.getResource("view/"+fileName+".fxml");
            if(fileUrl.equals(null)){
                throw new java.io.FileNotFoundException("File does not exist");
            }
            pane = new FXMLLoader().load(fileUrl);
        }catch(Exception ex){
            System.out.println(ex);
        }
        return  pane;
    }

}
