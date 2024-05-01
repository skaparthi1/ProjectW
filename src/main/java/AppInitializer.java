import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Perform initialization tasks here
        System.out.println("Application initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Perform cleanup tasks here
        System.out.println("Application destroyed");
    }
}
