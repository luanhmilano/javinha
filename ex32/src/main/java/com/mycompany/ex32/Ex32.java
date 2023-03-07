package com.mycompany.ex32;
import javax.swing.JOptionPane;

public class Ex32 
{
    public static void main(String[] args) 
    {
        double r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da lata: "));
        double alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da lata: "));
        if (r < 0 || alt < 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            double volume = 3.14159 * Math.pow(r, 2) * alt;
            JOptionPane.showMessageDialog(null, String.format("Volume da lata de óleo: %.2f", volume));
        }
    }
}