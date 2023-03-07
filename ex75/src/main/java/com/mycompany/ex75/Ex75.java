package com.mycompany.ex75;
import javax.swing.JOptionPane;

public class Ex75
{
    public static void main(String[] args)
    {
        var nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
        if (idade > 0 && idade <= 10)
            JOptionPane.showMessageDialog(null, nome + " deverá pagar 30 reais.");
        else if (idade > 10 && idade <= 29)
            JOptionPane.showMessageDialog(null, nome + " deverá pagar 60 reais.");
        else if (idade > 29 && idade <= 45)
            JOptionPane.showMessageDialog(null, nome + " deverá pagar 120 reais.");
        else if (idade > 45 && idade <= 59)
            JOptionPane.showMessageDialog(null, nome + " deverá pagar 150 reais.");
        else if (idade > 59 && idade <= 65)
            JOptionPane.showMessageDialog(null, nome + " deverá pagar 250 reais.");
        else if (idade > 65)
            JOptionPane.showMessageDialog(null, nome + " deverá pagar 400 reais.");
        else
            JOptionPane.showMessageDialog(null, "Valor de idade inválido.");
    }
}