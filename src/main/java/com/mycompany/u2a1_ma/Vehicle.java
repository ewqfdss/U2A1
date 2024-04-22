/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_ma;

/**
 *
 * @author 335156154
 */
public class Vehicle {
    
    private String licensePlate; //IV, can be used outside the class
    private int passengerNum ; //IV
    private double passengerFare, fuelEfficiency; //IV
    
    static double gasPrice, distance; //Class Fields
    
    //Constructor
    public Vehicle(String licensePlate, int passengerNum, double passengerFare, double fuelEfficiency){
        //initialize the instance fields
        this.licensePlate = licensePlate;
        this.passengerFare = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public static void calculateRevenue(int passengerNum, int passengerFare){
        int revenue = passengerNum*passengerFare;
    }
    
    public static void calculateTotalCost(int gasPrice, int distance){
        int totalCost = gasPrice*distance;
    }
    
//    public static void calculateProfit(){
//        int profit = totalCost - revenue;
//    }
    
    //compareTo() function
    
    //toString() function
    
    //Setters
    public void setLicensePlate(String licensePlate){ //1
        this.licensePlate = licensePlate;
    }
    
    public void setpassengerNum (int passengerNum){ //2
        this.passengerNum = passengerNum;
    }
    
    public void passengerFare (int passengerFare){ //3
        this.passengerFare = passengerFare;
    }
        
    public void fuelEfficiency (int fuelEfficiency){ //4
        this.fuelEfficiency = fuelEfficiency;
    }
    
    //Getters
    public String licensePlate(){ //1
        return this.licensePlate;
    }
    
    public int passengerNum(){ //2
        return this.passengerNum;
    }
        
    public double passengerFare(){ //3
        return this.passengerFare;
    }
            
    public double fuelEfficiency(){ //4
        return this.fuelEfficiency;
    }
    
    
    
    
    
    
}
