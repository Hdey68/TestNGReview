import org.testng.annotations.*;

public class TestNGAnnotations {


    // class base annotations
    @BeforeMethod
    public void before(){
        System.out.println ("Before method" );
    }
    @AfterMethod
    public void after() {
        System.out.println ( "After method" );
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println ("Before class" );
    }
    @AfterClass
    public void afterClass(){
        System.out.println ("After class" );
    }

    @Test(enabled = false,groups = "smoke",priority = 5)
    public void test1(){
        System.out.println ("I am test1" );

    }
    @Test(priority = 2)
    public void test2(){
        System.out.println ("I am test2" );
    }
    @Test(dependsOnMethods = "test2")
    public void test3(){
        System.out.println ("I am test3" );
    }
    @Test(groups = {"smoke","sprint10"},priority = 1)
    public void test4(){
        System.out.println ("I am test4" );
    }


    // xml base annotation
    @BeforeTest
    public void beforeTest(){
        System.out.println ( "Before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println ("After Test" );
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println ( "Before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println ("After suite" );
    }

}
