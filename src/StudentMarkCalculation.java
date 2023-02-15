import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMarkCalculation {
    private JButton calculateButton;
    private JTextField nepaliMark;
    private JTextField englishMark;
    private JTextField studentName;
    private JTextField computeMark;
    private JTextField mathMark;
    private JTextField totalMark;
    private JTextField avgMark;
    private JTextField percentageMark;
    private JPanel main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentMarkCalculation");
        frame.setContentPane(new StudentMarkCalculation().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentMarkCalculation() {
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int computer, english, nepali, math , total ;
            double avg;

            english = Integer.parseInt(englishMark.getText());
            nepali = Integer.parseInt(nepaliMark.getText());
            computer = Integer.parseInt(computeMark.getText());
            math = Integer.parseInt(mathMark.getText());

            total = english + nepali + math +computer ;
            totalMark.setText(String.valueOf(total));

            //for avg
            avg = total/4;
            avgMark.setText(String.valueOf(avg));

            //for percentage
            if(english>=32 && nepali>=32 && math>=32 && computer>=32){
                percentageMark.setText("Passed");
            }else{
                percentageMark.setText("Failed");
            }

        }
    });
}
}
