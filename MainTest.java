import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MainTest 
{
    @Test
    public void testIsPrimeTrue() 
    {
        //Arrange
        //Act
        boolean output = Main.isPrime(5);

        //Assert
        assertTrue(output);
    }

    @Test 
    public void testIsPrimeFalse()
    {
        boolean output = Main.isPrime(1);

        assertFalse(output);
    }

    @Test(expected = NullPointerException.class)
    public void NullPointerException()
    {
        Main.Special(2023);
    }


}
