import javax.swing.*;

import static javax.swing.JOptionPane.* ;
public class Booliskuttrykk {
    // Programmet skal ta brukerinput:alder
    // Programmet skal ta brukerinput: norsk statsborger (ja/nei)
    // Programmet skal gi output:
    // 1. Du kan stemme / du kan ikke stemme

    public static void main(String[] args) {
        String ageAsString = JOptionPane.showInputDialog("Skriv din alder:");
        int age = Integer.parseInt(ageAsString);
        System.out.println(age);
        String norwegianAsString = JOptionPane.showInputDialog("Er du norsk statsborger (ja/nei:");
        boolean norwegian = norwegianAsString.equals("ja");
        if (norwegian&&age>=18)
            System.out.println("Hurra! Du kan stemme!");
        else
            System.out.println("Du kan ikke stemme...");

    }
}
