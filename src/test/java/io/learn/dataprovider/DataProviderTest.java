package io.learn.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testMe(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {
        Object[][] objArray = new Object[][] {
                { 2, 4 },
                { 3, 6 },
                { 5, 7 },
                { 10, 7 },
                { 3, 2 }
        };

        return objArray;
    }

/*    public String getName() {
        return "Hello";
    }*/

    /*
    excel sheet

--> login flow of application

username 	password
username1	password1
username2	password2
username3	password3
username4	password4
username5	password5

Selenium script to login
     */
}
