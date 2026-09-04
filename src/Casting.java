import javax.swing.*;
import static javax.swing.JOptionPane.* ;
public class Casting {
    public static void main(String[] args) {
        //Ta inn to heltall
        String integerAsString= JOptionPane.showInputDialog("Skriv inn et heltall");
        int number1=Integer.parseInt(integerAsString);
        System.out.println(number1);

        String integerAsString2= JOptionPane.showInputDialog("Skriv inn et heltall til");
        int number2=Integer.parseInt(integerAsString2);
        System.out.print(number1);
        System.out.println(number2);
        int sum = number1 + number2;
        System.out.println("Summen er: "+ sum);

        double average = sum / 2;
        System.out. println("Snittet er: " + average);

        //Skriv ut
        //Sum,
        //
    }
}
