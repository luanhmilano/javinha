package com.mycompany.ex35;
import javax.swing.JOptionPane;

public class Ex35 
{
    public static void main(String[] args)
    {
        var a = JOptionPane.showInputDialog("Digite o valor de A: ");
        var b = JOptionPane.showInputDialog("Digite o valor de B: ");
        JOptionPane.showMessageDialog(null, "Valor A: " + a);
        JOptionPane.showMessageDialog(null, "Valor B: " + b);
        var c = a;
        a = b;
        b = c;
        JOptionPane.showMessageDialog(null, "Valor A: " + a);
        JOptionPane.showMessageDialog(null, "Valor B: " + b);
    }
}