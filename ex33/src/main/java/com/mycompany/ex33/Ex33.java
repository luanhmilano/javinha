package com.mycompany.ex33;
import javax.swing.JOptionPane;

public class Ex33 
{
    public static void main(String[] args) 
    {
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo gasto na viagem, em horas: "));
        int vm = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade: "));
        if (tempo < 0 || vm < 0)
            JOptionPane.showMessageDialog(null, "Valor(es) inválido(s).");
        else
        {
            double litros = (tempo * vm) / 12;
            JOptionPane.showMessageDialog(null, "Litros usados: " + litros);
        }
    }
}