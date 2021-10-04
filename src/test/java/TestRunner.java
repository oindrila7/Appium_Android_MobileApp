import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends BasePage {
    TestCase objTest;

    public TestRunner() throws IOException, InterruptedException {
    }

    @Test(enabled = true, groups= "smoke")
    public void runApp() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doSum();
        Assert.assertEquals(result,"12");
    }

    @Test(enabled = true,groups = "function")
    public void runApp2() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doSub();
        Assert.assertEquals(result,"2");
    }

    @Test(enabled = true,groups = "smoke")
    public void runApp3() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result= objTest.doMul();
        Assert.assertEquals(result,"35");
    }

    @Test(enabled = true,groups = "function")
    public void runApp4() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doDiv();
        Assert.assertEquals(result,"4");
    }

    @Test(enabled = true,groups = "smoke")
    public void runApp5() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doPercent();
        Assert.assertEquals(result,"180");
    }

    @Test(enabled = true,groups = "smoke")
    public void runApp6() throws IOException, InterruptedException {
        objTest=new TestCase();
        String result=objTest.doPY();
        Assert.assertEquals(result,"6.28318530");
    }
}
