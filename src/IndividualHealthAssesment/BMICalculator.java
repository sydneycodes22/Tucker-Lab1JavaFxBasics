package IndividualHealthAssesment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BMICalculator {
    private float weight;
    private float height;
    private List<String> bmiReport;

    public BMICalculator() {
        // Default constructor
        bmiReport = new ArrayList<>();
        bmiReport.add("Seriously Underweight");
        bmiReport.add("Underweight");
        bmiReport.add("Normal Weight");
        bmiReport.add("Overweight");
        bmiReport.add("Obese");
    }

    public void getHeightFromUser() {
        // Implementation to get height from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        height = scanner.nextFloat();
        scanner.close();
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void getWeightFromUser() {
        // Implementation to get weight from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        weight = scanner.nextFloat();
        scanner.close();
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float calculateBMI() {
        // BMI calculation 
        return weight / (height * height);
    }  

    public String getBMIReport(float bmi) {
        if (bmi < 18.0) {
            return bmiReport.get(0); // Seriously Underweight
        } else if (bmi < 18.5 && bmi >= 18.0) {
            return bmiReport.get(1); // Underweight
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return bmiReport.get(2); // Normal Weight
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return bmiReport.get(3); // Overweight
        } else if (bmi >= 30.0 && bmi <= 39.9) {
            return bmiReport.get(4); // Obese
        } else {
            return "Invalid BMI value";
        }
    }

}
