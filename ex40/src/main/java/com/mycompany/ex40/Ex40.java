package com.mycompany.ex40;
import javax.swing.JOptionPane;

public class Ex40
{
    public static void main(String[] args) 
    {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
        int partInt = (int) num;
        JOptionPane.showMessageDialog(null, "Parte inteira: " + partInt);
        JOptionPane.showMessageDialog(null, "Parte fracionária: " + (num - partInt));
        JOptionPane.showMessageDialog(null, "Número arredondado: " + Math.round(num));
    }
}