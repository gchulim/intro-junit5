package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before - I am only called once !!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Gabriel"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after Each...");

    }

    @AfterAll
    static void afterClass() {
        System.out.println("After!!! **** - I am only called once !!!");

    }
}