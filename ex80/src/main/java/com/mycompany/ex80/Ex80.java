package com.mycompany.ex80;
import javax.swing.JOptionPane;

public class Ex80
{
    public static void main(String[] args)
    {
        var carro = JOptionPane.showInputDialog("Digite o tipo de carro (A, B, C): ");
        int km = Integer.parseInt(JOptionPane.showInputDialog("Digite o total do percurso: "));
        if (km <= 0)
            JOptionPane.showMessageDialog(null, "Valor inválido de percurso.");
        else
        {
            switch (carro)
            {
                case "A", "a" -> JOptionPane.showMessageDialog(null, "Consumo estimado em litros: " + (km / 8));
                case "B", "b" -> JOptionPane.showMessageDialog(null, "Consumo estimado em litros: " + (km / 9));
                case "C", "c" -> JOptionPane.showMessageDialog(null, "Consumo estimado em litros: " + (km / 12));
                default -> JOptionPane.showMessageDialog(null, "Valor inválido para o tipo de carro.");
            }
        }
    }
}