import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzTest(){
        assertEquals("Fizz not found : ", FizzBuzz.evaluate(3), "Fizz");
    }

    @Test
    public void buzzTest(){
        assertEquals("Buzz not found : ", FizzBuzz.evaluate(5), "Buzz");
    }

    @Test
    public void fizzBuzzTest(){
        assertEquals("FizzBuzz not found : ", FizzBuzz.evaluate(15), "FizzBuzz" );
    }

}