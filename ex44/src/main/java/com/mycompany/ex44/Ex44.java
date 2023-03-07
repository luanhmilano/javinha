package com.mycompany.ex44;
import javax.swing.JOptionPane;

public class Ex44
{
    public static void main(String[] args)
    {
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número: "));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: "));
        double qd = Math.pow((x1 - x2), 2);
        double dq = Math.pow(x1, 2) - Math.pow(x2, 2);
        JOptionPane.showMessageDialog(null, "O quadrado da diferença: " + qd);
        JOptionPane.showMessageDialog(null, "A diferença dos quadrados: " + dq);
    }
}