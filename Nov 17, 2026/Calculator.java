import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        String[] courses = {"BSIT", "BSCYB", "BSCS", "BSNETAD"};
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Student Information", JOptionPane.QUESTION_MESSAGE);
        String course = (String) JOptionPane.showInputDialog(null, "Select your course:", "Course Selection", JOptionPane.QUESTION_MESSAGE, null, courses, courses[0]);

        //Grade input
        double g1 = Double.parseDouble(JOptionPane.showInputDialog("Enter grade 1:"));
        double g2 = Double.parseDouble(JOptionPane.showInputDialog("Enter grade 2:"));
        double g3 = Double.parseDouble(JOptionPane.showInputDialog("Enter grade 3:"));
        double g4 = Double.parseDouble(JOptionPane.showInputDialog("Enter grade 4:"));

        double average = (g1 + g2 +g3 + g4) / 4;

        if (average >= 75){
            String result = "Student: " + name + "\n" +  "Course: " + course +'\n' + "Average: " + String.format("%.2f", average) + "\n" + "Status: PASSED";
            JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);  
        }
        else if (average <= 74){
            String result = "Student: " + name + "\n" + "Course: " + course +'\n' + "Average: " + String.format("%.2f", average) + "\n" + "Status: FAILED";
            JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "You closed the dialog."); 
        }


    }
}
