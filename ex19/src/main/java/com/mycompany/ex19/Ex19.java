package com.mycompany.ex19;
import javax.swing.JOptionPane;

public class Ex19 
{
    public static void main(String[] args)
    {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do retângulo."));
        int alt = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do retângulo."));
        if (base <= 0 || alt <= 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            int perimetro = 2 * (base + alt);
            double area = base * alt;
            double diago = Math.pow(base, 2) + Math.pow(alt, 2);
            JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
            JOptionPane.showMessageDialog(null, "Área: " + area);
            JOptionPane.showMessageDialog(null, String.format("Diagonal: %.2f", Math.sqrt(diago)));
        }
    }
}