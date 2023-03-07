package com.mycompany.ex53;
import javax.swing.JOptionPane;

public class Ex53 
{
    public static void main(String[] args)
    {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
        int pla = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               Digite um número de 1 a 6 para escolher o planeta: 
                                                               1 - Mercúrio
                                                               2 - Vênus
                                                               3 - Marte
                                                               4 - Júpiter
                                                               5 - Saturno
                                                               6 - Urano"""));
        double pesopla;
        switch (pla)
        {
            case 1: 
                pesopla = 0.37 * (peso / 10);
                JOptionPane.showMessageDialog(null, String.format("Peso no planeta escolhido: %.2f", pesopla));
            break;
            case 2:
                pesopla = 0.88 * (peso / 10);
                JOptionPane.showMessageDialog(null, String.format("Peso no planeta escolhido: %.2f", pesopla));
            break;
            case 3:
                pesopla = 0.38 * (peso / 10);
                JOptionPane.showMessageDialog(null, String.format("Peso no planeta escolhido: %.2f", pesopla));
            break;
            case 4:
                pesopla = 2.64 * (peso / 10);
                JOptionPane.showMessageDialog(null, String.format("Peso no planeta escolhido: %.2f", pesopla));
            break;
            case 5:
                pesopla = 1.15 * (peso / 10);
                JOptionPane.showMessageDialog(null, String.format("Peso no planeta escolhido: %.2f", pesopla));
            break;
            case 6:
                pesopla = 1.17 * (peso / 10);
                JOptionPane.showMessageDialog(null, String.format("Peso no planeta escolhido: %.2f", pesopla));
            break;
            default:
                JOptionPane.showMessageDialog(null, "Número digitado é inválido.");
        }       
    }
}