import java.lang.reflect.Array;
import java.util.ArrayList;

public class BusStop {

    private Bus bus;
    private ArrayList<Person> queue;

    public BusStop() {
        this.queue = new ArrayList<>();
    }

    public int personCount() {
        return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }

    public Person removePerson() {
        return this.queue.remove(0);
    }
}
