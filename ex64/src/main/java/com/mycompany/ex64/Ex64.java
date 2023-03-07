package com.mycompany.ex64;
import javax.swing.JOptionPane;

public class Ex64
{
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        if (n1 > n2)
        {
            JOptionPane.showMessageDialog(null, "Quadrado do menor: " + Math.pow(n2, 2));
            JOptionPane.showMessageDialog(null, "Raiz quadrada do maior: " + Math.sqrt(n1));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Quadrado do menor: " + Math.pow(n1, 2));
            JOptionPane.showMessageDialog(null, "Raiz quadrada do maior: " + Math.sqrt(n2));
        }
    }
}