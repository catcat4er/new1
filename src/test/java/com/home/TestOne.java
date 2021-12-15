    package com.home;

    import org.junit.jupiter.api.*;


    @DisplayName("First Simple test")
    public class TestOne {

        @BeforeAll
        static void beforeAll () {
            System.out.println("@BeforeAll method!");
        }

        @BeforeEach
        void beforeEach () {
            System.out.println("    @BeforeEach method!");
        }

        @AfterEach
         void afterEach () {
            System.out.println("    @AfterEach method!");
        }

        @AfterAll
        static void afterAll () {
            System.out.println("@AfterAll method!");
        }

        @DisplayName("First mini test")
        @Test
        void firstTest () {
            System.out.println("        @First mini test");
            Assertions.assertTrue(8 > 7);
        }
        @DisplayName("Second mini test")
        @Test
        void secondTest () {
            System.out.println("        Second mini test");
            Assertions.assertEquals(1, 1);
        }
    }
