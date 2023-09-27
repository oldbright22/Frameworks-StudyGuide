package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test()
public class Test2 {

    @DataProvider
    public Object[][] data() {
        return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
    }

    @Test(dataProvider = "data")
    public void testcase_002(String d) {
        Assert.assertEquals("First Line\nSecond Line", "First Line\nSecond Line");
        System.out.println("TestCase_001: "+ d);
    }

}
