package code.de.marquis.jrss.viewer;

import code.de.marquis.jrss.client.JrssClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JrssViewerConfig {

    @Bean
    public JrssClient jrssClient() {
        return new JrssClient();
    }
}
