import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop();
        person = new Person();
    }

    @Test
    public void addPersonToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.personCount());
    }

    @Test
    public void canRemovePerson() {
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.personCount());
    }

}
