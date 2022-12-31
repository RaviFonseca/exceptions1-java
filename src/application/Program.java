package application;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
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




        sc.close();
    }
}
