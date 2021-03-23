import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 0);
    }

    @Test
    public void checkNumberOfPassengers() {
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void checkCapacity() {
        assertEquals(30, bus.maxCapacity());
    }

    @Test
    public void canRemovePassengers() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassengers(person);
        assertEquals(1, bus.numberOfPassengers());
    }

//    @Test
//    public void canAddPassengerIfLessThanCapacity() {
//        bus.passengers = 30;
//        bus.addPassenger(person);
//        assertEquals(30, bus.numberOfPassengers());
//    }

    @Test
     public void canPickUpPassengerFromBusStop() {
       bus.pickUpPassenger(busStop);
       assertEquals(1, bus.numberOfPassengers());
   }
}
