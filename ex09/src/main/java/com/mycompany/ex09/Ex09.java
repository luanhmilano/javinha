package com.mycompany.ex09;
import javax.swing.JOptionPane;

public class Ex09 
{
    public static void main(String[] args) 
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        if (n2 == 0)
            JOptionPane.showMessageDialog(null, "Valor do 2° número inválido.");
        else
        {
            int quo = n1 / n2;
            int resto = n1 % n2;
            JOptionPane.showMessageDialog(null, "Dividendo: " + n1 + " Divisor: " + n2);
            JOptionPane.showMessageDialog(null, "Quociente: " + quo + " Resto: " + resto);
        }
    }
}