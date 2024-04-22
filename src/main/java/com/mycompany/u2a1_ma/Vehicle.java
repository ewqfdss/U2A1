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
    
    
    public Vehicle(String liscencePlate, int passengerNum, double passengerFare, double fuelEfficiency){
        //initialize the instance fields
        this.licensePlate = liscencePlate;
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
    
    
    
    
    
}
