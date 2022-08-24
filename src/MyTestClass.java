import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
// This is an annotation for assigning point values to tests
import com.gradescope.jh61b.grader.GradedTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// Import anything else you need to run the tests, such as the students' classes

public class MyTestClass {


    @Test
    @GradedTest(name="Test SpeedLight", max_score=10)
    public void testSpeedLight() {
        PrintStream stdOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        SpeedLight.main(null);
        assertEquals(bos.toString().trim(),"The distance is 1700.0 meters");
        System.setOut(stdOut);
    }

    // ignored test cases below
    // left as samples

    @Ignore
    @Test
    @GradedTest(name="Test 1+1", max_score=1)
    public void test_1p1() {
        int x = 1 + 1;
        System.out.println("Tested 1+1, got " + x);
        assertEquals(x, 2);
    }

    @Ignore
    @Test
    @GradedTest(name="Test 1+1*2", max_score=1, visibility="after_published")
    public void test_1p1t2() {
        int x = 1 + 1 * 2;
        System.out.println("Tested 1+1*2, got " + x);
        assertEquals(x, 3);
    }

    @Ignore
    @Test
    @GradedTest(name="Test FtoC", max_score=2)
    public void test_ftoc() {

        System.out.println("Testing 32f");
        Assert.assertEquals(StudentFile.fToC(32),0,0);

        System.out.println("Testing 212f");
        assertEquals(StudentFile.fToC(212),100.0,0);
    }

    @Ignore
    @Test
    @GradedTest(name="Testing Hello World", max_score=1)
    public void test_hello() {
        PrintStream stdOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        StudentFile2.main(null);
        assertEquals(bos.toString().trim(),"hello world!");
        System.setOut(stdOut);
    }

    @Ignore
    @Test
    @GradedTest(name="Testing main method", max_score = 1)
    public void test_main() {
        StudentFile2.main(null);
    }


}
