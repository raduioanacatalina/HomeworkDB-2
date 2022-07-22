import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Intersection {
    private ArrayList<Car> cars = new ArrayList<>();

    private Semaphore NorthSouthSemaphore;
    private Semaphore WestEstSemaphore;
    Boolean north;

    public Intersection(int noCars){
        this.NorthSouthSemaphore = new Semaphore(noCars);
        this.WestEstSemaphore = new Semaphore(noCars);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars){
        this.cars = cars;
    }

    public void crossIntersection(){
        Car car1 = new Car("Audi", "nord-sud", NorthSouthSemaphore);
        Car car2 = new Car("Mercedes", "nord-sud", NorthSouthSemaphore);
        Car car3 = new Car("BMW", "west-est", WestEstSemaphore);
        this.cars.add(car1);
        this.cars.add(car2);
        this.cars.add(car3);




    }

}
