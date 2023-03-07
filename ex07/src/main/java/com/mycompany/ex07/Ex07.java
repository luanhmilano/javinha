package com.mycompany.ex07;
import javax.swing.JOptionPane;

public class Ex07 
{
    public static void main(String[] args) 
    {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        JOptionPane.showMessageDialog(null, "A terça parte de " + num + " é: " + (num / 3));
    }
}