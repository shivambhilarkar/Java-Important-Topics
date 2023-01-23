package JavaThread;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadBasics {

    public static class Car implements Runnable{

        String name;
        Car(String name){
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("[ "+this.name + " is running ]");
        }
    }

    public static void main(String[] args) {

        Car tata = new Car("Nexon");
        Car mahindra = new Car("Scorpio");

        Thread thread1 = new Thread(tata);
        Thread thread2 = new Thread(mahindra);

        //Executor
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(5);
        service.scheduleAtFixedRate(tata, 5000, 10000, TimeUnit.MILLISECONDS);


    }


}
