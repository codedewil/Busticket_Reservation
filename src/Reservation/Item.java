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
public class Item {
    String name;
    int age,no_of_seats;
    String id;
    public Item(String name,int age,int no_of_seats,String id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
        this.no_of_seats=no_of_seats;
    }
}
