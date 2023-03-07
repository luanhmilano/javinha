package com.mycompany.ex59;
import javax.swing.JOptionPane;

public class Ex59
{
    public static void main(String[] args)
    {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        int partInt = (int) num;
        double deci = (num - partInt) * 1000;
        int x = (int) deci / 100;
        if (x % 2 == 0)
            JOptionPane.showMessageDialog(null, "O número da centena é PAR.");
        else
            JOptionPane.showMessageDialog(null, "O número da centena é ÍMPAR.");
    }
}