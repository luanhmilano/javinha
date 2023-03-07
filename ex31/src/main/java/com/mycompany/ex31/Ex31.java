package com.mycompany.ex31;
import javax.swing.JOptionPane;

public class Ex31 
{
    public static void main(String[] args) 
    {
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        double f = (9 * c + 160) / 5;
        JOptionPane.showMessageDialog(null, "Valor em Fahrenheit: " + f);
    }
}