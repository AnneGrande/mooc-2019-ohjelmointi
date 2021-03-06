package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class NappiJaTekstikenttaSovellus extends Application {


    public void start(Stage ikkuna) {
        Button nappikomponentti = new Button("Tämä on nappi");
        TextField tekstikomponentti = new TextField ("Tämä on tekstikenttä");

        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappikomponentti);
        komponenttiryhma.getChildren().add(tekstikomponentti);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }
}
