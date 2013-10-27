/*
 * ID:Simon
 * Prog:Ride
 * Lang:java
 */

import java.util.*;
import java.io.*;

public class ride{

    public static void main(String [] args) throws FileNotFoundException{

            File theFile = new File("ride.in");
            Scanner x = new Scanner(theFile);
            PrintWriter p = new PrintWriter("ride.out");
            String group = x.nextLine();
            int num1 = 1;
            for (byte b : group.getBytes()){
                num1 = (b-64)*num1;
            }
            String comet = x.nextLine();
            int num2 = 1;
            for (byte a: comet.getBytes()){
                num2 = (a-64)*num2;
            }
            if((num1%47) == (num2%47)){
                p.println("Go");
            }else{
                p.println("Stay");
            }
            p.close();



    }







}
