package com.mycompany.ex77;
import javax.swing.JOptionPane;

public class Ex77 
{
    public static void main(String[] args)
    {
        var nome = JOptionPane.showInputDialog("Digite o nome do município: ");
        int ele = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitores da cidade: "));
        int vot = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos do 1° colocado: "));
        if (ele < 20000)
            JOptionPane.showMessageDialog(null, "Menos de 20.000 eleitores, sem segundo turno.");
        else
        {
            if (vot > (ele * 0.50))
                JOptionPane.showMessageDialog(null, "Não haverá segundo turno.");
            else
                JOptionPane.showMessageDialog(null, "Haverá segundo turno.");
        }
    }
}