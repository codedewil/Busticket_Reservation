/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketreservation;

import Reservation.Bus;
import Reservation.Gandibanbus;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class MainClass extends Customer{
    
 public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int loop=1,choice;
       MainClass main=new MainClass();
       Gandibanbus_service gandiban=new Gandibanbus_service();
       Geminibus_service gemini=new Geminibus_service();
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
                    main.getDetails();
                    String name=main.getName();
                    int age=main.getAge();
                    int seats=main.getSeats();
                    gemini.book(name,age,seats);
                    break;
                case 2:
                    gemini.display();
                    break;
                case 3:
                    System.out.println("enter user id");
                    String id=s.next();
                    gemini.cancel(id);
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
                    main.getDetails();
                    String name=main.getName();
                    int age=main.getAge();
                    int seats=main.getSeats();
                    gandiban.book(name,age,seats);
                    break;
                case 2:
                    gandiban.display();
                    break;
                case 3:
                    System.out.println("enter user id");
                    String id=s.next();
                    gandiban.cancel(id);
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