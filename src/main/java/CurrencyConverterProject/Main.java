package CurrencyConverterProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Main {

    public static void main(String[] args) throws  IOException {
        ArrayList<Double> usdList = new ArrayList<>();//creates a new array

        String myResult = ("Result.txt");//defines a name from the text file
        File resultFile = new File(myResult);
        if (resultFile.exists()) {//if text file exists , it will delete it
            resultFile.delete();
        }
        resultFile.createNewFile();//will crate a new text file

        System.out.println("Welcome To Currency Converter");//first screen

        System.out.println("Please Choose an option (1/2):");
        System.out.println("1. Dollars To Shekels");
        System.out.println("2. Shekels To Dollars");
        Scanner choose = new Scanner(System.in);//takes input from user
        String number = choose.next();
        //System.out.println("Number is: " + number);
        while (!(number.equals("1") || number.equals("2"))) {//if user's input is not 1 or 2
            //the while loop will ask the user to choose again from 1 or 2
            System.out.println("Invalid choice. Choose Again");

            System.out.println("Please Choose an option (1/2):");
            System.out.println("1. Dollars To Shekels");
            System.out.println("2. Shekels To Dollars");

            number = choose.next();
            //System.out.println("Number is: " + number);
        }
        mainwhile:
        while (number.equals("1") || number.equals("2")) {//main while loop, covers all the rest of the code

            firstouterwhile:
            while (number.equals("1")) {//if user chose option 1

                System.out.println("Please Enter An Amount To Convert");//second screen

                String amountString = choose.next();
                try {//inside try and catch: calculates the user's input and adds it to the array list
                    double amount = Double.valueOf(amountString);
                    double calUSD = new ClassUSD().calculate(amount);//will calculate from classUSD
                    //which converts Dollars to Shekels
                    //System.out.println("first print" + calUSD);
                    usdList.add(calUSD);//adds calculate result to the array list
                } catch (Exception e) {
                    System.out.println("Please enter a valid number");//if user's input is not valid,
                    //will ask the user to add a valid number to calculate
                    continue;
                }

                System.out.println("Would you like to continue? Y/N");//asks user if they want to continue
                //and takes user back to choose between option 1 and 2

                String choice = choose.next();
                System.out.println(choice);

                if (choice.equals("N") || choice.equals("n")) {//if user press on 'n' it will
                    //show them the result from an array list, will put the result inside a text file,
                    //will open up the text file for the user to read and will end the program completely
                    System.out.println("Thanks For Using Our Currency Converter");
                    System.out.println("Here are the results:");
                    for (int i = 0; i < usdList.size(); i++) {
                        System.out.println(usdList.get(i));
                        Files.writeString(Paths.get(myResult), usdList.get(i).toString(), StandardOpenOption.APPEND);
                        Files.writeString(Paths.get(myResult), "\n", StandardOpenOption.APPEND);
                    }
                    java.awt.Desktop.getDesktop().edit(resultFile);

                    break mainwhile;
                }
                if (choice.equals("Y") || choice.equals("y")) {//if user choose 'y', it will ask the user
                    //again to choose between option 1 or 2, and by the user's input it will take them
                    //to the right direction with the while loop
                    System.out.println("Please Choose an option (1/2):");
                    System.out.println("1. Dollars To Shekels");
                    System.out.println("2. Shekels To Dollars");


                    number = choose.next();
                    //System.out.println("Number is: " + number);


                    while (!(number.equals("1") || number.equals("2"))) {//incase user
                        //chose anything else that is not 1 or 2, it will tell the user it's an invalid choice
                        //and will ask again
                        System.out.println("Invalid choice. Choose Again");

                        System.out.println("Please Choose an option (1/2):");
                        System.out.println("1. Dollars To Shekels");
                        System.out.println("2. Shekels To Dollars");


                        number = choose.next();
                        //System.out.println("Number is: " + number);
                    }
                }

                while (!(choice.equals("Y") || choice.equals("y"))) {//if user choose anything else than 'y'
                    //or 'Y', will tell the user it's invalid and will ask to start over

                    System.out.println("Invalid Choice Please Try Again");

                    System.out.println("Start Over Y/N?");
                    choice = choose.next();

                    if (choice.equals("Y") || choice.equals("y")) {//if user's input is 'y',
                        //it means the user wants to continue and the progmram will ask them
                        //to choose between option 1 or 2 again
                        System.out.println("Please Choose an option (1/2):");
                        System.out.println("1. Dollars To Shekels");
                        System.out.println("2. Shekels To Dollars");


                        number = choose.next();
                        //System.out.println("Number is: " + number);


                        while (!(number.equals("1") || number.equals("2"))) {//incase user chooses different
                            //option other than 1 or 2, program will tell user it's an invalid choice and
                            //let them choose again
                            System.out.println("Invalid choice. Choose Again");

                            System.out.println("Please Choose an option (1/2):");
                            System.out.println("1. Dollars To Shekels");
                            System.out.println("2. Shekels To Dollars");


                            number = choose.next();
                            System.out.println("Number is: " + number);
                        }
                    }

                    if (choice.equals("N") || choice.equals("n")) {//again, if user wants to quit the program.
                        //only this time this if is inside the second while of option 1
                        System.out.println("Thanks For Using Our Currency Converter");
                        System.out.println("Here are the results:");
                        for (int i = 0; i < usdList.size(); i++) {
                            System.out.println(usdList.get(i));
                            Files.writeString(Paths.get(myResult), usdList.get(i).toString(), StandardOpenOption.APPEND);
                            Files.writeString(Paths.get(myResult), "\n", StandardOpenOption.APPEND);
                        }
                        java.awt.Desktop.getDesktop().edit(resultFile);
                        break mainwhile;
                    }
                }
            }

            outerwhile:
            while (number.equals("2")) {
                //option number 2 is basically the same as option 1
                //only difference is that it converts Shekels to Dollars
                System.out.println("Please Enter An Amount To Convert");

                String amountString = choose.next();
                try {
                    double amount = Double.valueOf(amountString);
                    double calILS = new ClassILS().calculate(amount);
                    //System.out.println("first print" + calILS);
                    usdList.add(calILS);
                } catch (Exception e) {
                    System.out.println("Please enter a valid number");
                    continue;
                }
                System.out.println("Would you like to continue? Y/N");
                String choice = choose.next();
                System.out.println(choice);

                if (choice.equals("N") || choice.equals("n")) {
                    System.out.println("Thanks For Using Our Currency Converter");
                    System.out.println("Here are the results:");
                    for (int i = 0; i < usdList.size(); i++) {
                        System.out.println(usdList.get(i));
                        Files.writeString(Paths.get(myResult), usdList.get(i).toString(), StandardOpenOption.APPEND);
                        Files.writeString(Paths.get(myResult), "\n", StandardOpenOption.APPEND);
                    }
                    java.awt.Desktop.getDesktop().edit(resultFile);

                    break mainwhile;
                }
                if (choice.equals("Y") || choice.equals("y")) {
                    System.out.println("Please Choose an option (1/2):");
                    System.out.println("1. Dollars To Shekels");
                    System.out.println("2. Shekels To Dollars");

                    number = choose.next();
                    //System.out.println("Number is: " + number);

                    while (!(number.equals("1") || number.equals("2"))) {
                        System.out.println("Invalid choice. Choose Again");

                        System.out.println("Please Choose an option (1/2):");
                        System.out.println("1. Dollars To Shekels");
                        System.out.println("2. Shekels To Dollars");

                        number = choose.next();
                        //System.out.println("Number is: " + number);
                    }
                }

                while (!(choice.equals("Y") || choice.equals("y"))) {

                    System.out.println("Invalid Choice Please Try Again");

                    System.out.println("Start Over Y/N?");
                    choice = choose.next();

                    if (choice.equals("Y") || choice.equals("y")) {
                        System.out.println("Please Choose an option (1/2):");
                        System.out.println("1. Dollars To Shekels");
                        System.out.println("2. Shekels To Dollars");

                        number = choose.next();
                        //System.out.println("Number is: " + number);

                        while (!(number.equals("1") || number.equals("2"))) {
                            System.out.println("Invalid choice. Choose Again");

                            System.out.println("Please Choose an option (1/2):");
                            System.out.println("1. Dollars To Shekels");
                            System.out.println("2. Shekels To Dollars");

                            number = choose.next();
                            //System.out.println("Number is: " + number);
                        }
                    }


                    if (choice.equals("N") || choice.equals("n")) {
                        System.out.println("Thanks For Using Our Currency Converter");
                        System.out.println("Here are the results:");
                        for (int i = 0; i < usdList.size(); i++) {
                            System.out.println(usdList.get(i));
                            Files.writeString(Paths.get(myResult), usdList.get(i).toString(), StandardOpenOption.APPEND);
                            Files.writeString(Paths.get(myResult), "\n", StandardOpenOption.APPEND);
                        }
                        java.awt.Desktop.getDesktop().edit(resultFile);

                        break mainwhile;
                    }
                }
            }
        }
    }
}
