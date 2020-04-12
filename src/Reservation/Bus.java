/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus extends Customer{
    Scanner scan=new Scanner(System.in);
    static int filled_seats=0,value=0;
    final int total_seats=50;
    final double amount=25;
    static double bank_amount=0;
    double user_amount;
    ArrayList<String> items=new ArrayList<>();
    ArrayList<Integer> ages=new ArrayList<>();
    ArrayList<Integer> seat=new ArrayList<>();
    ArrayList<String> ids=new ArrayList<>();
   // ArrayList<Double> amounts=new ArrayList<>();
    public void book()
    {
      int seats=no_of_seats+filled_seats;
      String id;
      if(seats<=total_seats)
      {
          id=name+age+no_of_seats+value;
         // items.add(new Item(name,age,no_of_seats,id));
         items.add(name);
         ages.add(age);
         seat.add(no_of_seats);
         ids.add(id);
          value++;
          user_amount=no_of_seats*amount;
          bank_amount+=user_amount;
          filled_seats=seats;
          System.out.println("Successfully reserved");
          System.out.println("The amount to be paid is Rs."+user_amount);
          System.out.println("no of seats filled: "+filled_seats);
          System.out.println("your id is:"+id);
      }
      else
          System.out.println("seats not available");
  
    }
    void display1() {
       for(int itr=0;itr<items.size();itr++)
       {
           System.out.println("name: "+items.get(itr));
           System.out.println(" age: "+ages.get(itr));
           System.out.println(" seats: "+seat.get(itr));
           System.out.println(" id: "+ids.get(itr));
           System.out.println();
       }
    }
    void cancel()
    {
        String id_Num;
        System.out.println("enter user id");
        id_Num=scan.next();
       int position=ids.indexOf(id_Num);
       //System.out.println("position:"+position);
       if(position==-1)
       {
           System.out.println("user id not exist please enter correct id");
       }
       else
       {
       int reserved_seats=seat.get(position);
        System.out.println("bank amount filled before cancellation"+bank_amount);
       bank_amount-=reserved_seats*25;
        System.out.println("bank amount filled after cancellation"+bank_amount);
       //System.out.println("no of seats filled before cancellation"+filled_seats);
      
       filled_seats-=reserved_seats;
       items.remove(position);
       ages.remove(position);
       ids.remove(position);
       seat.remove(position);
      // System.out.println("no of seats filled after cancellation"+filled_seats);
       System.out.println("Registration canceled successfully");
    }
    }
}
