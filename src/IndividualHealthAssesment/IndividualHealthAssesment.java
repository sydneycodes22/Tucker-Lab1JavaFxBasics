package IndividualHealthAssesment;

public class IndividualHealthAssesment {
    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();

        bmiCalculator.getWeightFromUser();
        bmiCalculator.getHeightFromUser();
        float bmi = bmiCalculator.calculateBMI();
        String bmiReport = bmiCalculator.getBMIReport(bmi);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your BMI category is: " + bmiReport);
    }
}
