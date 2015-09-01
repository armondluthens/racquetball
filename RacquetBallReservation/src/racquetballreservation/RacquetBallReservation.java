/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racquetballreservation;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author armondluthens
 */
public class RacquetBallReservation {
    //ArrayList<Integer> courtReservationCheck = new ArrayList();
    static int[] courtReservationCheck = new int[15];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        for(int i=0; i<courtReservationCheck.length; i++){
            courtReservationCheck[i]=0;
        }
        
        
        System.out.println("Menu:");
        System.out.println("1. Reserve Court");
        System.out.println("2. Cancel Reservation");
        System.out.print("Choice: ");
        int selection = input.nextInt();
        
        choice(selection);
    }
    public void initializeArray(){
        for(int i=0; i<courtReservationCheck.length; i++){
            courtReservationCheck[i]=0;
        }
    }
    
    public static void choice(int selection){
        if(selection == 1){
            int timeSelection;
            Scanner input = new Scanner(System.in);
            
            System.out.println("Select Time:");
            System.out.println("1. 5:00AM - 6:00AM");
            System.out.println("2. 6:00AM - 7:00AM");
            System.out.println("3. 7:00AM - 8:00AM");
            System.out.println("4. 9:00AM - 10:00AM");
            System.out.println("5. 10:00AM - 11:00AM");
            System.out.println("6. 11:00AM - 12:00PM");
            System.out.println("7. 12:00PM - 1:00PM");
            System.out.println("8. 1:00PM - 2:00PM");
            System.out.println("9. 2:00PM - 3:00PM");
            System.out.println("10. 3:00PM - 4:00PM");
            System.out.println("11. 4:00PM - 5:00PM");
            System.out.println("12. 5:00PM - 6:00PM");
            System.out.println("13. 6:00PM - 7:00PM");
            System.out.println("14. 7:00PM - 8:00PM");
            System.out.println("15. 9:00PM - 10:00PM");
            System.out.print("Choice: ");
            timeSelection = input.nextInt();
            
            int timeCheck = timeSelection-1;
            timeCheck(timeCheck);
        }
        else{
            
        }
    }
    public static void timeCheck(int timeCheck){
        int cont;
        Scanner input = new Scanner(System.in);
        
        int reservationStatus = courtReservationCheck[timeCheck];
        if(reservationStatus == 0){
            courtReservationCheck[timeCheck] = 1;
            System.out.println("You have reserved a court");
        }
        else{
            System.out.println("Sorry, a court is already reserved at this time");
        }
        System.out.println("\n\nContinue Program?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choice: ");
        cont = input.nextInt();
        
        if(cont == 1){
            choice(1);
        }
        
    }
    
}
