package com.mycompany.ex06;
import javax.swing.JOptionPane;

public class Ex06 
{
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        int prod = n1 * n2;
        JOptionPane.showMessageDialog(null, n1 + " x " + n2 + " = " + prod);
    }
}