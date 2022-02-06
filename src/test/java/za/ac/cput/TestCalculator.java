package za.ac.cput;

//Student Name - Shuaib Allie
// Student Number - 217148867

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;


public class TestCalculator {

    private Calculator calculate;
    private Calculator add, subtract;

    @BeforeEach
    public void setUp() {
        this.calculate = new Calculator();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void TestEquality() {
        int result = calculate.add(1,4);
        assertEquals(5, result);
    }

    @Test
    public void TestIdentity() {
        assertSame(add,subtract);
    }

    @Test
    public void FailingTest() {
        assertFalse(false);
    }

    @Test
    @Timeout(value = 150, unit = TimeUnit.MILLISECONDS)
    public void TimeoutTest() {
        //It will fail if the execution time exceeds 150 milliseconds
    }

    @Test
    @Disabled("This test will unfortunately not run")
    public void Fail() {
        // This test will therefore be skipped
    }

}
