package com.mycompany.ex41;
import javax.swing.JOptionPane;

public class Ex41
{
    public static void main(String[] args) 
    {
        double min = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo: "));
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário da pessoa: "));
        if (min <= 0)
        {
            JOptionPane.showMessageDialog(null, "Valor de salário mínimo inválido.");
        }
        else
        {
            double x = sal / min;
            JOptionPane.showMessageDialog(null, String.format("Essa pessoa recebe %.2f salários mínimos.", x));
        }
    }
}