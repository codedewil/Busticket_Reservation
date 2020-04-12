/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketreservation;


abstract class Bus_service {
    abstract void book(String name,int age,int seat);
    abstract void cancel(String id);
    abstract void display();
}

