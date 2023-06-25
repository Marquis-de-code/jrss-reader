package code.de.marquis.jrss.viewer;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JrssViewerApplicationLauncher {
    public static void main(String[] args) {
        Application.launch(JrssViewerApplication.class, args);
    }
}
