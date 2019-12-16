package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;



public class ShanghaiSovellus extends Application {

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna) {
        NumberAxis xAkseli = new NumberAxis(2005, 2020, 1);
        NumberAxis yAkseli = new NumberAxis();
        
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");

    // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
    // ja se käyttää aiemmin luotuja x- ja y-akseleita
    LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
    viivakaavio.setTitle("Helsingin Yliopisto, Shanghai-ranking");

    // luodaan viivakaavioon lisättävä datajoukko
    XYChart.Series shanghaiData = new XYChart.Series();
    shanghaiData.setName("Shanghai");
    // lisätään datajoukkoon yksittäisiä pisteitä
    shanghaiData.getData().add(new XYChart.Data(2007, 73));
    shanghaiData.getData().add(new XYChart.Data(2008, 68));
    shanghaiData.getData().add(new XYChart.Data(2009, 72));
    shanghaiData.getData().add(new XYChart.Data(2010, 72));
    shanghaiData.getData().add(new XYChart.Data(2011, 74));
    shanghaiData.getData().add(new XYChart.Data(2012, 73));
    shanghaiData.getData().add(new XYChart.Data(2013, 76));
    shanghaiData.getData().add(new XYChart.Data(2014, 73));
    shanghaiData.getData().add(new XYChart.Data(2015, 67));
    shanghaiData.getData().add(new XYChart.Data(2016, 56));
    shanghaiData.getData().add(new XYChart.Data(2017, 56));

    // lisätään datajoukko viivakaavioon
    viivakaavio.getData().add(shanghaiData);

    // näytetään viivakaavio
    Scene nakyma = new Scene(viivakaavio, 640, 480);
    ikkuna.setScene(nakyma);
    ikkuna.show();
}
}

