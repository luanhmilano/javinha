package com.mycompany.ex72;
import javax.swing.JOptionPane;

public class Ex72 
{
    public static void main(String[] args)
    {
        double real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais: "));
        var x = JOptionPane.showInputDialog(String.format("Digite uma das letras para converter para a moeda: %nf - Franco suíço %nl - Libra %nd - Dólar %nm - Marco alemão"));
        double cota;
        double convert;
        switch (x)
        {
            case "f" -> {
                cota = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação da moeda: "));
                convert = real * cota;
                JOptionPane.showMessageDialog(null, String.format("%.2f reais equivalem a %.2f francos suíços.", real, convert));
            }
            case "l" -> {
                cota = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação da moeda: "));
                convert = real * cota;
                JOptionPane.showMessageDialog(null, String.format("%.2f reais equivalem a %.2f libras.", real, convert));
            }
            case "d" -> {
                cota = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação da moeda: "));
                convert = real * cota;
                JOptionPane.showMessageDialog(null, String.format("%.2f reais equivalem a %.2f dólares.", real, convert));
            }
            case "m" -> {
                cota = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação da moeda: "));
                convert = real * cota;
                JOptionPane.showMessageDialog(null, String.format("%.2f reais equivalem a %.2f marcos alemães.", real, convert));
            }
            default -> JOptionPane.showMessageDialog(null, "Valor inválido.");
        }
    }
}