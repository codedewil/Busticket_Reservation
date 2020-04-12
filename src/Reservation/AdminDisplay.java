/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

/**
 *
 * @author ELCOT
 */
public class AdminDisplay extends Admin{
    public static void main(String[] args)
    {
        Admin admin=new AdminDisplay();
        admin.display();
    }

    @Override
    void display() {
        //To change body of generated methods, choose Tools | Templates.
       for(int i=0;i<items.size();i++)
       {
           System.out.print("name: "+items.get(i));
           System.out.print(" age: "+ages.get(i));
           System.out.println();
       }
    }
}
