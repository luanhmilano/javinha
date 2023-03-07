package com.mycompany.ex05;
import javax.swing.JOptionPane;

public class Ex05
{
    public static void main(String[] args) 
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        int soma = n1 + n2;
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}