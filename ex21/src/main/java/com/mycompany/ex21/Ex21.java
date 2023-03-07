package com.mycompany.ex21;
import javax.swing.JOptionPane;

public class Ex21
{
    public static void main(String[] args) 
    {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
        if (lado <= 0)
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        else
        {
            int perimetro = lado * 4;
            int area = lado * lado;
            double diagonal = lado * Math.sqrt(2);
            JOptionPane.showMessageDialog(null, String.format("Perímetro: %d %nÁrea: %d %nDiagonal: %.2f", perimetro, area, diagonal));
        }
    }
}