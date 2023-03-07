package com.mycompany.ex15;
import javax.swing.JOptionPane;

public class Ex15 
{
    public static void main(String[] args) 
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saldo da aplicação: "));
        if (valor < 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            double reajuste = valor * 1.01;
            JOptionPane.showMessageDialog(null, "Valor da aplicação com reajuste: " + reajuste);
        }
    }
}