import javax.swing.JOptionPane;


public class Temperature {
    public static void main(String[] args) {
        double Celsius = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in Celsius: "));
        
        //Calcuation
        double KelvinCal = Celsius + 273.15;
        double FahrenheitCal = (Celsius * 2 / 5) + 32;

        String result = "Celsius: " + String.format("%.2f", Celsius) + "\n" + "Fahrenheit: " + String.format("%.2f", FahrenheitCal) + "\n" + "Kelvin: " + String.format("%.2f", KelvinCal);
        JOptionPane.showMessageDialog(null, result);
    }
}
