package CurrencyConverterProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> usdList = new ArrayList<>();


        System.out.println("Welcome To Currency Converter");

            System.out.println("Please Choose an option (1/2):");
            System.out.println("1. Dollars To Shekels");
            System.out.println("2. Shekels To Dollars");
            Scanner choose = new Scanner(System.in);
            int number = choose.nextInt();
            System.out.println("Number iss: " + number);
            while (number != 1 && number != 2) {
                System.out.println("Invalid choice. Choose Again");

                System.out.println("Please Choose an option (1/2):");
                System.out.println("1. Dollars To Shekels");
                System.out.println("2. Shekels To Dollars");

                //choose = new Scanner(System.in);
                number = choose.nextInt();
                System.out.println("Number is: " + number);
            }

            firstouterwhile:
            while (number == 1) {

                //ArrayList<Double> usdList = new ArrayList<>();
                System.out.println("Please Enter An Amount To Convert");
                //Scanner input = new Scanner(System.in);
                double amount = choose.nextDouble();
                double calUSD = new ClassUSD().calculate(amount);
                System.out.println("first print" + calUSD);
                usdList.add(calUSD);
                for (int i = 0; i < usdList.size(); i++) {
                    System.out.println(usdList.get(i));
                }


                //System.out.println(usdList);
                System.out.println("Would you like to continue? Y/N");
                //Scanner yesno = new Scanner(System.in);
                String choice = choose.next();
                System.out.println(choice);

                if (choice.equals("N") || choice.equals("n")) {
                    System.out.println("Thanks For Using Our Currency Converter");
                    break;
                }
                if(choice.equals("Y") || choice.equals("y")){
                    System.out.println("Please Choose an option (1/2):");
                    System.out.println("1. Dollars To Shekels");
                    System.out.println("2. Shekels To Dollars");

                    //choose = new Scanner(System.in);
                    number = choose.nextInt();
                    System.out.println("Number is: " + number);
                   // continue;
                }

                    while (!(choice.equals("Y") || choice.equals("y"))) {

                        System.out.println("Invalid Choice Please Try Again");

                        System.out.println("Start Over Y/N?");
                        choice = choose.next();

                        if(choice.equals("Y") || choice.equals("y")){
                            System.out.println("Please Choose an option (1/2):");
                            System.out.println("1. Dollars To Shekels");
                            System.out.println("2. Shekels To Dollars");

                            //choose = new Scanner(System.in);
                            number = choose.nextInt();
                            System.out.println("Number is: " + number);
                            // continue;
                        }


                        if (choice.equals("N") || choice.equals("n")) {
                            System.out.println("Thanks For Using Our Currency Converter");
                            break firstouterwhile;

                        }


                }//usdList.add(calUSD);
//            for ( int i = 0; i<usdList.size(); i++ ){
//                System.out.println(usdList.get(i));
//            }

            }

            outerwhile:
            while (number == 2) {
                System.out.println("Please Enter An Amount To Convert");
                //Scanner input = new Scanner(System.in);
                double amount = choose.nextDouble();
                double calILS = new ClassILS().calculate(amount);
                System.out.println(calILS);
                usdList.add(calILS);
                for (int i = 0; i < usdList.size(); i++) {
                    System.out.println(usdList.get(i));
                }

                System.out.println("Would you like to continue? Y/N");
                //Scanner yesno = new Scanner(System.in);
                String choice = choose.next();
                System.out.println(choice);
                if(choice.equals("Y") || choice.equals("y")){
                    System.out.println("Please Choose an option (1/2):");
                    System.out.println("1. Dollars To Shekels");
                    System.out.println("2. Shekels To Dollars");

                    //choose = new Scanner(System.in);
                    number = choose.nextInt();
                    System.out.println("Number is: " + number);
                    // continue;
                }
                if (choice.equals("N") || choice.equals("n")) {
                    System.out.println("Thanks For Using Our Currency Converter");
                    break;
                }

                while (!(choice.equals("Y") || choice.equals("y"))) {

                    System.out.println("Invalid Choice Please Try Again");

                    System.out.println("Start Over Y/N?");
                    choice = choose.next();

                    if(choice.equals("Y") || choice.equals("y")){
                        System.out.println("Please Choose an option (1/2):");
                        System.out.println("1. Dollars To Shekels");
                        System.out.println("2. Shekels To Dollars");

                        //choose = new Scanner(System.in);
                        number = choose.nextInt();
                        System.out.println("Number is: " + number);
                        // continue;
                    }
                    if (choice.equals("N") || choice.equals("n")) {
                        System.out.println("Thanks For Using Our Currency Converter");
                        break outerwhile;
                    }
                }
            }


        }

}
