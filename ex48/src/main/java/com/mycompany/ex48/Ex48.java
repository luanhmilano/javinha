package com.mycompany.ex48;
import javax.swing.JOptionPane;

public class Ex48
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
        if (num < 100 || num > 999)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            int a = num / 100;
            int b = (num % 100) / 10;
            int c = (num % 100) % 10;
            a = (a + c) * 1;
            b = (b + b) * 2;
            c = a * 3;
            int soma = a + b + c;
            JOptionPane.showMessageDialog(null, "Dígito verificador: " + soma % 10);
        }
    }
}