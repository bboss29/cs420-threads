import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Handler;

public class Task {
    public static ExecutorService service;
    public static void main(String[] args){
        Car c1 = new Car("Kona",250);
        Car c2 = new Car("Ioniq",220);

        Runnable racer1 = new Racer(c1);
        Runnable racer2 = new Racer(c2);

        initExecutorService();

        /* TODO
Submit both runnables to the ExecutorService and then request the ExecutorService to shutdown */
        service.execute(racer1);
        service.execute(racer2);
        service.shutdown();
    }

  /* TODO
Implement the initExecutorService method. This has to initialize service to a new FixedThreadPool with a minimum of 3 threads */
    public static void initExecutorService(){
        service = Executors.newFixedThreadPool(3);
    }
}