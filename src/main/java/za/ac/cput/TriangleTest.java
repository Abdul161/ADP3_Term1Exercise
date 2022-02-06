package za.ac.cput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

public class TriangleTest {

    private Triangle triangleOne;
    private Triangle triangleTwo;
    private Triangle triangleThree;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        triangleOne = new Triangle();
        triangleTwo = new Triangle();
        triangleThree = triangleOne;
    }

    @Test
    public void testEquality() {
        assertEquals(triangleOne, triangleOne);
    }

    @Test
    public void testIdentity() {
        assertSame(triangleOne, triangleThree);
    }

    @Test
    public void testFail() {
        assertTrue(false);
    }

    @Test
    @Timeout(50)
    public void testTimeout() {
        System.out.println("Timeed out");
    }

    @Disabled
    @Test
    public void testDisabled() {
        System.out.println("This method has been disabled");
    }
}

