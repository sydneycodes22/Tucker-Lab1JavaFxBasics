package IndividualHealthAssesment;

import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;


public class Controller {

    @FXML
    private TextField weightField;
    @FXML
    private TextField heightField;
    @FXML
    private Label BMICalcLabel;
    @FXML
    private Label BMIMessageLabel;

    

    private BMICalculator bmiCalculator;

    public void initialize() {
        bmiCalculator = new BMICalculator();
    }

    @FXML
    private void calculateBMI() {
        try {   
            float weight = Float.parseFloat(weightField.getText());
            float height = Float.parseFloat(heightField.getText());

            bmiCalculator.setWeight(weight);
            bmiCalculator.setHeight(height);

            float bmi = bmiCalculator.calculateBMI();
            String bmiReport = bmiCalculator.getBMIReport(bmi);

            BMICalcLabel.setText(String.format("%.2f", bmi));
            BMIMessageLabel.setText("The patient is " + bmiReport);
           
            if (bmi < 18.5 || bmi >= 35.0) {
                Alert warningAlert = new Alert(AlertType.WARNING);
                warningAlert.setTitle("Health Advisory");
                warningAlert.setHeaderText("Medical Attention Recommended");
                warningAlert.setContentText("Patient is " + bmiReport + " and should consult with Doctor");
                warningAlert.showAndWait();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Please enter valid numbers for weight and height.");
            alert.showAndWait();
        }
    }
}