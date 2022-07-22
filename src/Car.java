import java.util.concurrent.Semaphore;

public class Car implements Runnable{

    private String name;
    private String direction;
    private Semaphore sem;

    public Car() {
    }

    public Car(String name, String direction, Semaphore sem) {
        this.name = name;
        this.direction = direction;
        this.sem = sem;
        Thread thread = new Thread(this);
        thread.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Semaphore getSem() {
        return sem;
    }

    public void setSem(Semaphore sem) {
        this.sem = sem;
    }

    @Override
    public void run(){
        try {
            this.sem.acquire();
            System.out.println(this.getName() + "," + this.getDirection());
            this.sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void go(){
        System.out.println(this.getName() + "," + this.getDirection());
    }


}
