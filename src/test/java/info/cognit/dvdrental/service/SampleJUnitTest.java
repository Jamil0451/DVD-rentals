package info.cognit.dvdrental.service;

import org.junit.jupiter.api.*;

class SampleJUnitTest {

    // We test one unit at a time for Unit testing.
    // We test multiple for Integration testing (The whole thing).
    // Only runs once before all tests
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll()");
    }
    // Will run before each test
    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach()");
    }
    @Test
    public void test1() {
        System.out.println("test1()");
    }
    @Test
    public void test2() {
        System.out.println("test2()");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("afterEach()");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll()");
    }

}