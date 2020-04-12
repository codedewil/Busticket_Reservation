/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketreservation;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class Customer {
    private String name;
   private int age,no_of_seats;
 protected void getDetails()
  {   
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the name");
     name=s.nextLine();
     System.out.println("Enter age");
     age=s.nextInt();
     System.out.println("enter no of seats");
     no_of_seats=s.nextInt();
 }
public String getName()
{
    return name;
}
public int getAge()
{
    return age;
}
public int getSeats()
{
    return no_of_seats;
}
}
