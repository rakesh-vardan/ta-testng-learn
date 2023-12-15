package io.learn.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    //reads the variables from testng-parameters.xml file
    @Test
    @Parameters({ "var1", "var2" })
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " +sum);
    }

/*    @Test
    @Parameters("browser")
    public void add(String browser) {
        if browser == chrome {
            //do some logic
        }

        if browser == firefox
                //do some logiv
    }*/

   /* @Test
    public void add() {
        int a = 4;
        int b = 6;
        int sum = a + b;
        System.out.println("Sum is: " +sum);
    }*/
}
