public class Car {
    public double miles;
    public double odometer;
    public String name;
    public double maxMiles;

    public Car(String name,double miles){
        this.miles = miles;
        odometer = 0;
        this.name = name;
        this.maxMiles = miles;
    }

    public void move(double miles){
        /* TODO
move should subtract  'miles' from the miles left to travel and add 'miles' to the odometer. The miles to travel cannot be less than zero. */
        if (miles < this.miles) {
            this.odometer += miles;
            this.miles -= miles;
        } else {
            this.odometer += this.miles;
            this.miles = 0;
        }
    }

    public void charge(){
        this.miles = maxMiles;
    }

    public String toString(){
        return name+": odo:"+odometer+" - miles left:"+miles;
    }
}
