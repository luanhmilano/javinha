package com.mycompany.ex52;
import javax.swing.JOptionPane;

public class Ex52
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if (num > 0)
            JOptionPane.showMessageDialog(null, "O número é positivo");
        else if (num < 0) 
            JOptionPane.showMessageDialog(null, "O número é negativo.");
        else
            JOptionPane.showMessageDialog(null, "O número é nulo.");
    }
}