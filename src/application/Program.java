package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNr = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());


            Reservation res = new Reservation(roomNr, checkin, checkout);
            System.out.println(res);

            System.out.println("\nEnter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            Date now = new Date();

            res.updateDates(checkin, checkout);
            System.out.println(res);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: "+e.getMessage());
        }
        catch (RuntimeException e ){
            System.out.println("Unexpected error");
        }



        sc.close();
    }
}
