package testng.basicoftestng;

import org.testng.annotations.*;

public class TestNGAnnotationSecondExample {

    @AfterSuite
    public void afterSuiteExample(){
        System.out.println("After Suite Example");
    }

    @BeforeSuite
    public void beforeSuiteExample(){
        System.out.println("Before Suite Example");
        System.out.println("Hello All");
    }

    @AfterTest
    public void demoForAfterTest() {
        System.out.println("After Test");
    }

    @BeforeTest
    public void demoForBeforeTest() {
        System.out.println("Before Test");
    }


    @BeforeClass
    public void demoForBeforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void demoForAfterClass() {
        System.out.println("After Class");
    }


    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @Test(groups = "smoke")
    public void testCase_1() {
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase_2() {
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase_3() {
        System.out.println("Test Case 3");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }
}
