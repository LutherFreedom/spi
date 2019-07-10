package com.luther;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);

        for (Driver driver : loader){
            System.out.println(driver.connection());
        }
    }
}
