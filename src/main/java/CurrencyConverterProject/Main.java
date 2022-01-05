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
        ArrayList<Double> usdList = new ArrayList<>();

        String myResult = ("Result.txt");
        File resultFile = new File(myResult);
        if (resultFile.exists()) {
            resultFile.delete();
        }
        resultFile.createNewFile();

        System.out.println("Welcome To Currency Converter");

        System.out.println("Please Choose an option (1/2):");
        System.out.println("1. Dollars To Shekels");
        System.out.println("2. Shekels To Dollars");
        Scanner choose = new Scanner(System.in);
        String number = choose.next();
        System.out.println("Number iss: " + number);
        while (!(number.equals("1") || number.equals("2"))) {
            System.out.println("Invalid choice. Choose Again");

            System.out.println("Please Choose an option (1/2):");
            System.out.println("1. Dollars To Shekels");
            System.out.println("2. Shekels To Dollars");

            number = choose.next();
            System.out.println("Number is: " + number);
        }
        mainwhile:
        while (number.equals("1") || number.equals("2")) {
            firstouterwhile:
            while (number.equals("1")) {

                System.out.println("Please Enter An Amount To Convert");

                String amountString = choose.next();
                try {
                    double amount = Double.valueOf(amountString);
                    double calUSD = new ClassUSD().calculate(amount);
                    System.out.println("first print" + calUSD);
                    usdList.add(calUSD);
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
                    System.out.println("Number is: " + number);


                    while (!(number.equals("1") || number.equals("2"))) {
                        System.out.println("Invalid choice. Choose Again");

                        System.out.println("Please Choose an option (1/2):");
                        System.out.println("1. Dollars To Shekels");
                        System.out.println("2. Shekels To Dollars");


                        number = choose.next();
                        System.out.println("Number is: " + number);
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
                        System.out.println("Number is: " + number);


                        while (!(number.equals("1") || number.equals("2"))) {
                            System.out.println("Invalid choice. Choose Again");

                            System.out.println("Please Choose an option (1/2):");
                            System.out.println("1. Dollars To Shekels");
                            System.out.println("2. Shekels To Dollars");


                            number = choose.next();
                            System.out.println("Number is: " + number);
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

            outerwhile:
            while (number.equals("2")) {
                System.out.println("Please Enter An Amount To Convert");

                String amountString = choose.next();
                try {
                    double amount = Double.valueOf(amountString);
                    double calILS = new ClassILS().calculate(amount);
                    System.out.println("first print" + calILS);
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
                    System.out.println("Number is: " + number);

                    while (!(number.equals("1") || number.equals("2"))) {
                        System.out.println("Invalid choice. Choose Again");

                        System.out.println("Please Choose an option (1/2):");
                        System.out.println("1. Dollars To Shekels");
                        System.out.println("2. Shekels To Dollars");

                        number = choose.next();
                        System.out.println("Number is: " + number);
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
                        System.out.println("Number is: " + number);

                        while (!(number.equals("1") || number.equals("2"))) {
                            System.out.println("Invalid choice. Choose Again");

                            System.out.println("Please Choose an option (1/2):");
                            System.out.println("1. Dollars To Shekels");
                            System.out.println("2. Shekels To Dollars");

                            number = choose.next();
                            System.out.println("Number is: " + number);
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
