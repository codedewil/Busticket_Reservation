/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class Index {
     public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int loop=1,choice;
        Bus bus=new Bus();
        Gandibanbus gandiban=new Gandibanbus();
        while(loop==1)
        {
           System.out.println("Welcome to priya bus reservation service");
           System.out.println("enter 1 for genimi bus service");
           System.out.println("enter 2 for gandiban bus service");
           System.out.println("enter 3.exit");
           choice=s.nextInt();
           switch(choice)
           {
               
               case 1: 
                  int flag=1;
                  while(flag==1)
                {
                 System.out.println("Welcome to Gemini bus service");
                 System.out.println("enter 1.book");
                 System.out.println("enter 2.display");
                 System.out.println("enter 3.cancel");
                 System.out.println("enter 4.exit");
                 int ch=s.nextInt();
                 switch(ch)
                {
                 case 1:
                    bus.getDetails();
                    bus.book();
                    break;
                case 2:
                    bus.display1();
                    break;
                case 3:
                    bus.cancel();
                    break;
                case 4:
                    System.out.println("enter 1 to continue or 0 to exit");
                    flag=s.nextInt();
         }
        
        }
                  break;
              case 2:
                   int flag1=1;
                  while(flag1==1)
                {
                 System.out.println("Welcome to Gemini bus service");
                 System.out.println("enter 1.book");
                 System.out.println("enter 2.display");
                 System.out.println("enter 3.cancel");
                 System.out.println("enter 4.exit");
                 int ch=s.nextInt();
                 switch(ch)
                {
                 case 1:
                    gandiban.getDetails();
                    gandiban.book();
                    break;
                case 2:
                    gandiban.display1();
                    break;
                case 3:
                    gandiban.cancel();
                    break;
                case 4:
                    System.out.println("enter 1 to continue or 0 to exit");
                    flag1=s.nextInt();
         }
        
        }
                  break;
              case 3:
                  System.out.println("enter 1 to continue or 0 to exit");
                  loop=s.nextInt();
    }
}
}
}