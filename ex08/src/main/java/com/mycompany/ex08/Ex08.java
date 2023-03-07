package com.mycompany.ex08;
import javax.swing.JOptionPane;

public class Ex08 
{
    public static void main(String[] args) 
    {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: "));
        double media = (n1 + n2) / 2;
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}