package ReviewFXBasics;
import java.util.List;
import java.util.Scanner;

public class BMICalculator {
    private float weight;
    private float height;
    private List<String> bmiReport;

    public BMIcalculator() {
        // Default constructor
        bmiReport = new ArrayList<>();
        bmiReport.add("Seriously Underweight");
        bmiReport.add("Underweight");
        bmiReport.add("Normal Weight");
        bmiReport.add("Obese");
    }

    public void getHeightFromUser() {
        // Implementation to get height from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        height = scanner.nextFloat();
        scanner.close();
    }

    public void getWeightFromUser() {
        // Implementation to get weight from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        weight = scanner.nextFloat();
        scanner.close();
    }

    public float calculateBMI() {
        // BMI calculation logic
        return weight / (height * height);
    }  

}
