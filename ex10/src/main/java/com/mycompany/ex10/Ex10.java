package com.mycompany.ex10;
import javax.swing.JOptionPane;

public class Ex10 
{
    public static void main(String[] args)
    {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° valor (peso 1): "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° valor (peso 2): "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3° valor (peso 3): "));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 4° valor (peso 4): "));
        if (n1 <= 0 || n2 <= 0 || n3 <= 0 || n4 <= 0)
            JOptionPane.showMessageDialog(null, "Valor(es) negativo(s) inválido(s).");
        else
        {
            double mp = (n1 + (n2 * 2) + (n3 * 3) + (n4 * 4)) / 10;
            JOptionPane.showMessageDialog(null, "Média ponderada: " + mp);
        }
 
    }
}