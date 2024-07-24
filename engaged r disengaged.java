import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        String x1=p.nextLine();
        String x2=p.nextLine();
        String x3=p.nextLine();
        if((x1.equals("engaged"))&&(x2.equals("engaged"))&&(x3.equals("engaged")))
        {
            System.out.println("Initiating Warp Drive!");
        }
        else if(((x1.equals("engaged"))||(x2.equals("engaged"))||(x3.equals("engaged")))&&((x1.equals("disengaged"))||(x2.equals("disengaged"))||(x3.equals("disengaged"))))
        {
            System.out.println("Hold On! Some Belts are Adrift.");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
