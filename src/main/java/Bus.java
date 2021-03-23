import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = 30;
        this.passengers = new ArrayList<Person>();
    }

    public int numberOfPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        passengers.add(person);
    }

    public int maxCapacity() {
        return this.capacity;
    }

    public void removePassengers(Person person) {
        passengers.remove(person);
    }

   public void pickUpPassenger(BusStop busStop) {
       Person person = busStop.removePerson();
       this.passengers.add(person);
  }

//    public void atCapacity(Person person) {
//
//        if (this.passengers.size() < this.capacity) {
//            passengers.add(person);
//        }
//    }
}
