package com.mycompany.ex73;
import javax.swing.JOptionPane;

public class Ex73
{
    public static void main(String[] args)
    {
        double h = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        var sexo = JOptionPane.showInputDialog("Digite o sexo (M/F): ");
        double peso;
        switch (sexo) {
            case "M", "m" -> {
                peso = (72.7 * h) - 58;
                JOptionPane.showMessageDialog(null, "Peso ideal: " + peso);
            }
            case "F", "f" -> {
                peso = (62.1 * h) - 44.7;
                JOptionPane.showMessageDialog(null, "Peso ideal: " + peso);
            }
            default -> JOptionPane.showMessageDialog(null, "Valor digitado inválido.");
        }
    }
}
