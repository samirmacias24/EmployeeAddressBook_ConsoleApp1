/**
 * Tests the AddressEntry Class
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {
    /**
     * Creates a quick check to see if any AddressEntry that uses
     * toString() is formatted correctly
     */
    @Test
    void testToString() {
        // creating a generic AddressEntry
        AddressEntry obj1 = new AddressEntry("Bob", "Bob", "street1", "city1",
                "state1",12345, "123-456-7890"
                ,"bob@gmail.com");
        // Compare to see if "output" is formatted as it should
        String output = obj1.toString();
        String expectedOutput = "Bob" + " " + "Bob" + " \n" + "street1" + " " + "city1" + " \n" + "state1" + " "
                + 12345 + " \n" + "123-456-7890" + " \n" + "bob@gmail.com" + "\n";
        assertEquals(expectedOutput, output);
    }

}