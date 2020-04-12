/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;
import java.util.Scanner;
public class Customer {
    String name;
    int age,no_of_seats;
public void getDetails()
  {   
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the name");
     name=s.nextLine();
     System.out.println("Enter age");
     age=s.nextInt();
     System.out.println("enter no of seats");
     no_of_seats=s.nextInt();
 }
}
