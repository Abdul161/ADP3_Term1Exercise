package za.ac.cput;

// Student Name - Shina
//Student Number - 219333181

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

public class Rectangular_Test {

    Rectangular firstShape = null;
    Rectangular secondShape = null;

    public Rectangular_Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        double len = 5;
        double wid = 5;
        double height = 5;

        firstShape = new Rectangular(len, wid, height);
        secondShape = new Rectangular(10, 10, 10);

        firstShape = secondShape;
    }


    @Test
    public void surface() {
        double result;
        result = firstShape.calculateSurface();
        assertEquals(200, result);
    }

    @Test
    public void volume() {
        double result;
        result = firstShape.calculateVolume();
        assertEquals(150, result);
    }

    @Test
    public void testingEquality() {
        assertEquals(firstShape, secondShape);
    }

    @AfterEach
    public void tearDown() {
    }


    @Test
    public void isObjectIdentical() {
        assertSame(firstShape, secondShape);
    }


    @Test
    public void failingTest() {
        double result = 20;
        assertEquals(result, 10);
    }

    @Test
    @Timeout(value = 1200)
    public void testTimeOut() {
        System.out.println("checks the runtime of this particular method");
    }

    @Test
    @Disabled
    public void disablingTest() {
        double result;
        result = firstShape.calculateVolume();
        assertEquals(200, result);
    }

}
