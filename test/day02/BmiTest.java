package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BmiTest {

    @Test
    void calculateNormalBmi() {
        double heightInCentimeters = 1.70;
        double weightInKilograms = 70;

        String Bmi_Result = Bmi.calculateBmi(heightInCentimeters, weightInKilograms);
        assertEquals("Normal", Bmi_Result);

    }

    //Underweight
    void calculateUnderweightBmi() {
        double heightInCentimeters = 1.80;
        double weightInKilograms = 40;

        String Bmi_Result = Bmi.calculateBmi(heightInCentimeters, weightInKilograms);
        assertEquals("Underweight", Bmi_Result);
    }

    //Overweight
    void calculateOverweightBmi() {
        double heightInCentimeters = 1.60;
        double weightInKilograms = 80;

        String Bmi_Result = Bmi.calculateBmi(heightInCentimeters, weightInKilograms);
        assertEquals("Overweight", Bmi_Result);
    }

    //Obese
    void calculateObese() {
        double heightInCentimeters = 1.50;
        double weightInKilograms = 100;

        String Bmi_Result = Bmi.calculateBmi(heightInCentimeters, weightInKilograms);
        assertEquals("Obese", Bmi_Result);
    }

    @Test
    void main() {
    }
}