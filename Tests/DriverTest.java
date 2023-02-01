import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    Driver Driver1 = new Driver("Tom Banks", 1);

    @Test
    public void testGetName() {
        assertEquals("Tom Banks", Driver1.getDriverName());
    }

    @Test
    public void TestGetNumber()
    {
        assertEquals(1, Driver1.getDriverNum());
    }


}