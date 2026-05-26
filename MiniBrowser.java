import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MiniBrowser extends Application{

    @Override
    public void start(Stage janela) {
        janela.setTitle("Mini Navegador Web");

        TextField campoUrl = new TextField();
        WebView navegador = new WebView();
        WebEngine motor = navegador.getEngine();

        // Carregar uma página da web quando o usupário pressionar Enter no campo de texto
        campoUrl.setOnAction(e -> motor.load(formatarUrl(campoUrl.getText())));

        VBox layout = new VBox(10, campoUrl, navegador);

        Scene cena = new Scene(layout, 800, 600);

        janela.setScene(cena);
        janela.show();
    }

    public String formatarUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            return "http://" + url;
        }
        return url;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
