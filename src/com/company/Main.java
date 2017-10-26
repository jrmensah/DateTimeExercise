package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Get the current time
        LocalDateTime rightNow= LocalDateTime.now();
        //Date from the user
        LocalDate userDate=null;

        //Set up formatter so that you can use them later
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Time formatter (time only)
        DateTimeFormatter hr24 = DateTimeFormatter.ofPattern("kk:mm");



        //Output today's date in formats that have been preset


            do{
                System.out.println("Enter a date in the past(dd/mm/yyyy)");
                try {

                    userDate = LocalDate.parse(keyboard.nextLine(), dTF);
                    if (userDate.isAfter(LocalDate.now()) && userDate != null) {
                        System.out.println("The date must be in the past");

                        System.out.println("Unable to convert the string you entered to date. Please try again!");

                    }


                }catch(Exception e)
                {

                System.out.println("This is the current date in dTF:" +userDate.format(dTF));
                System.out.println("This is the current date in short format: "+userDate.format(shortMonthFormat));
                System.out.println("This is the current date in long format: "+userDate.format(longFormat));
                System.out.println("This is the current date and time unformatted: "+userDate);

                //Output the current time in formats that have been preset
                System.out.println("This is the current system time: "+ LocalTime.now());
                System.out.println("This is the current system time (24 h format): "+LocalTime.now().format(hr24));



            }while(userDate!=null);

        }while(userDate == null);
        //Display the date entered
        System.out.println(userDate.format(shortMonthFormat));

    }
    }

