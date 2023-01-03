package application;

import accountPack.Account;
import model.entites.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //*** PRIMEIRO RODEO COM AS EXCEPTIONS ***//
        /*
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position  - "+e);
        } catch (InputMismatchException e){
            System.out.println("Invalid Input - "+e);
        }

        System.out.println("End of program");*/
        //** Solucão ruim do Reservation **//
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);

        } catch(ParseException e){
            System.out.println("Invalid date format");
        } catch (DomainException e){
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error");
        }*/
        //** Exercicio de fixação para o chapter de Exceptions **//

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number,holder,balance,withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println("New balance: "+String.format("%.2f",acc.getBalance()));
        } catch (DomainException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Unexpected error: "+e);
        }



        ///
        sc.close();
    }
}
