package testNG;

import org.testng.Assert;
import org.testng.annotations.*;


@Test()
public class Test1 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeGroups
    public void beforeGroup(){
        System.out.println("Before Group");
    }
    @AfterGroups
    public void afterGroup(){
        System.out.println("After Group");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @Test(groups = { "one" })

    @DataProvider  //supply data for the method
    public Object[][] data() {
        System.out.println("Supply data for method");
        return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
    }
    
    @Test(groups = { "one" }, dataProvider = "data")
    public void testcase_001(String d) {
        Assert.assertEquals("First Line\nSecond Line", "First Line\nSecond Line");
        System.out.println("TestCase_001: "+ d);

    }


}



/*
@BeforeSuite

 */