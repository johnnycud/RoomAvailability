package guest;

import java.util.ArrayList;

public class Guest
{
 // instance variables that will hold your data
 // private indicates they belong to this class exclusively
 private int maxGuests;
 private String hotel;
 private ArrayList<String> guests;
 private ArrayList<String> newGuest;
 String name;

 
 //Constructor
 public Guest(int maxGuests, String hotel)
 {
    System.out.println("Maximum number of guests: " + maxGuests + "\n  Guest list for this hotel" + hotel +" .\n");
    this.guests = new ArrayList<String>();
    this.newGuest = new ArrayList<String>();
    this.maxGuests = maxGuests;
    this.hotel = hotel;
 }
 Guest(String newName) {
     name = newName;
 }
 //getter
 // define type of data to be returned
 public String getHotel()
 {
    System.out.println("Setting host to: " + hotel);
    return hotel;
 }

 //setter
 // setters have type void b/c they return nothing
 public void setHotel(String host)
 {
    System.out.println("Setting host to: " + hotel);
    this.hotel = hotel;
 }

 //*************************************
 //Method to add to guest list
 public void addGuest(String guest)
 {

    if (guests.size() < maxGuests)
    {
        System.out.println("Guest: " + guest + "\n");
        this.guests.add(guest);
    }

    else
    {
        newGuest.add(guest);
        System.out.println("     Guest cannot be added. Guest list is full. \n");
    }//end if

 }//end method

 //*************************************
 //Method to print list of guest
 public void printGuestList()
 {
      System.out.println("****************************************************\n");
    System.out.println("Guest list for " +
    this.hotel + "'s guest list is: \n\n" +
    this.guests + ".\n");

    System.out.println(newGuest+"weren't added to the list because the hotel is full");

 } // end Print Party method

}//end class guest