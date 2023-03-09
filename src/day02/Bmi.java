package day02;

import java.util.Scanner;

public class Bmi {

    public static String calculateBmi(double heightInCentimeters, double weightInKilograms) {
        double BMI = weightInKilograms / (heightInCentimeters * heightInCentimeters);

        if(BMI < 18.5)
            return "Underweight";
        else if (BMI <25)
            return "Normal";
        else if(BMI < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double weightInKilograms;
        double heightInCentimeters;
        String BMI_Result;
        System.out.println("Please enter the weight in kg: ");
        weightInKilograms = scan.nextDouble();
        System.out.println("Please enter your height in cm: ");
        heightInCentimeters = scan.nextDouble();

        BMI_Result = calculateBmi(heightInCentimeters, weightInKilograms);
        System.out.println(BMI_Result);
        scan.close();

        /*System.out.println("Please insert your height in cm: ");
        int cm = scan.nextInt();
        System.out.println("Please insert your weight in kg: ");
        int kg = scan.nextInt();

        int calculate = (kg/cm * cm);
        int bmiResult = calculate;

        if(bmiResult < 18.5) {
            System.out.println("You're underweight with a score of " + bmiResult);
        } else if ((bmiResult >= 18.5) || (bmiResult <= 25)) {
            System.out.println("You're weight is considered normal with a score of " + bmiResult);
        } else if((bmiResult >= 25) || (bmiResult== 30)) {
            System.out.println("You're overweight with a score of " + bmiResult);
        } else if(bmiResult > 30) {
            System.out.println("You're very overweight with a score of " + bmiResult);
        }*/
    }
}
