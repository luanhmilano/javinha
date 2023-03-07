package com.mycompany.ex38;
import javax.swing.JOptionPane;

public class Ex38 
{
    public static void main(String[] args)
    {
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora atual: "));
        int min = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos atuais: "));
        if (hora < 0 || hora > 23)
            JOptionPane.showMessageDialog(null, "Valor de hora inválido.");
        if (min < 0 || min > 59)
            JOptionPane.showMessageDialog(null, "Valor de minutos inválido.");
        else
        {
            int total = (hora * 60) + min;
            JOptionPane.showMessageDialog(null, "Se passaram " + total + " minutos desde o início do dia.");
        }
    }
}