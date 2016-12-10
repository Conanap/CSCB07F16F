import static org.junit.assert.*;
import org.junit.Before; // if you need
import org.junit.Test;
import org.junit.After; //if you need

// import other necessary stuff
public class TestStudent {
    prviate Student al;
    @Before
    public void setUp() {
        al = new Student("Albion", 123456789, 150);
    }

    @Test
    public void testGetName() {
        temp = al.getName();
        assertEquals("Albion", temp);
        temp = al.askForName();
        // comment out following line for test case to pass
        assertEquals("Albion", temp);
        // optionally, assertEqual(String message, value, value);
    }

    @Test
    public void testGetIQ() {
        temp = al.getIQ();
        assertEquals("IQ should be higher", 150, temp);
        temp = al.askForIQ();
        // comment out following code for test case to pass
        assertEquals("IQ not right...", 150, temp);
    }

    @Test
    public void testGetSNumber() {
        temp = al.getSNumber();
        assertEquals(123456789, temp);
        temp = al.askForSNumber();
        // comment out following line to pass
        assertEquals(123456789, temp);
    }
}