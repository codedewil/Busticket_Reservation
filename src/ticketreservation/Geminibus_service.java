/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketreservation;

import java.util.ArrayList;

/**
 *
 * @author ELCOT
 */
public class Geminibus_service extends Bus_service{
     static int filled_seats=0,value=0;
    final int total_seats=50;
    final double amount=25;
    static double bank_amount=0;
    double user_amount;
    ArrayList<String> names=new ArrayList<>();
    ArrayList<Integer> ages=new ArrayList<>();
    ArrayList<Integer> seat=new ArrayList<>();
    ArrayList<String> ids=new ArrayList<>();
    void book(String name,int age,int no_of_seats)
    {
      int seats=no_of_seats+filled_seats;
      String id;
      if(seats<=total_seats)
      {
          id=name+age+no_of_seats+value;
         names.add(name);
         ages.add(age);
         seat.add(no_of_seats);
         ids.add(id);
          value++;
          user_amount=no_of_seats*amount;
          bank_amount+=user_amount;
          filled_seats=seats;
          System.out.println("Successfully reserved");
          System.out.println("The amount to be paid is Rs."+user_amount);
          System.out.println("your id is:"+id);
      }
      else
          System.out.println("seats not available");
  
    }
    void display() {
        Boolean status=names.isEmpty();
       if(status==true)
           System.out.println("No reservation has made");
       else
       {
       System.out.println("Person details who has reserved bus tickets");
       for(int itr=0;itr<names.size();itr++)
       {
           System.out.println("name: "+names.get(itr));
           System.out.println(" age: "+ages.get(itr));
           System.out.println(" seats: "+seat.get(itr));
           System.out.println(" id: "+ids.get(itr));
           System.out.println();
       }
       }
    }
    void cancel(String id_Num)
    {
       int position=ids.indexOf(id_Num);
       if(position==-1)
       {
           System.out.println("user id not exist please enter correct id");
       }
       else
       {
       int reserved_seats=seat.get(position);
       bank_amount-=reserved_seats*25;
       filled_seats-=reserved_seats;
       names.remove(position);
       ages.remove(position);
       ids.remove(position);
       seat.remove(position);
       System.out.println("Registration canceled successfully");
    }
    }
    
}
