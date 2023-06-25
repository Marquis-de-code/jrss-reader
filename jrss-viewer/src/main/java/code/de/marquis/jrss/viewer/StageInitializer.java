package code.de.marquis.jrss.viewer;

import code.de.marquis.jrss.client.JrssClient;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<JrssViewerApplication.StageReadyEvent> {
    @Autowired
    private JrssClient jrssClient;

    @Override
    public void onApplicationEvent(JrssViewerApplication.StageReadyEvent event) {
        Stage stage = event.getStage();
        stage.setTitle("JRSS Viewer");
        Label label = new Label(jrssClient.getHelloWorldText());
        Scene scene = new Scene(label, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
