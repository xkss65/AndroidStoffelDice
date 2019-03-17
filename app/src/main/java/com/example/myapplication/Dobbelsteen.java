package com.example.myapplication;

import java.util.*;

public class Dobbelsteen
{
    public static void main(String[] args)
    {
        String again = "y";  // To control the loop
        int geworpen;

        dice dobbelsteenObj = new dice(16.66,16.66,16.66,16.66,16.66,16.66);

        Scanner keyboard = new Scanner(System.in);
        String readString = keyboard.nextLine();
//        while (again.equalsIgnoreCase("y"))
        while (again!=null)
        {
            geworpen = Worp.vulRij(dobbelsteenObj);
            dobbelsteenObj.setLaatstGegooid(geworpen);

            System.out.print("Geworpen: " + geworpen + "\n");

            bepaalNieuwPerc.doeDan(dobbelsteenObj);

            System.out.print("Roll them again (y = yes)? ");
            again = keyboard.nextLine();
        }
    }
}