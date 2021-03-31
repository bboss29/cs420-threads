public class Racer implements Runnable {
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    /* TODO
Create a constructor that receives a Car object and initializes c.*/
    public Racer(Car c){
        this.c = c;
    }

    @Override
    /* TODO
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
    public void run() {
        while (c.odometer < this.distance) {
            // As long as the car's odometer has not reached the distance this racer is supposed to race, the car will move 1 mile.
            if (c.miles != 0) {
                c.move(1);
            } else {
                // If the car runs out of fuel (i.e. 0 miles left in the tank), the car needs to charge before moving.
                // When the car charges, it needs to print "Charging" and the current thread should sleep as many milliseconds as miles were charged.
                try {
                    System.out.println("Charging");
                    Thread.sleep((long)(c.maxMiles - c.miles));
                    c.charge();
                } catch (InterruptedException e ){
                    return;
                }

            }

        }
    }
}
