package com.mycompany.ex11;
import javax.swing.JOptionPane;

public class Ex11 
{
    public static void main(String[] args) 
    {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um ângulo: "));
        double rad = Math.toRadians(x);
        double seno = Math.sin(rad); 
        double cosseno = Math.cos(rad); 
        double tangente = Math.tan(rad); 
        double secante = 1 / cosseno; 
        double cossecante = 1 / seno; 
        double cotangente = 1 / tangente;
        JOptionPane.showMessageDialog(null, String.format("Seno: %.3f %n Cosseno: %.3f %n "
                + "Tangente: %.3f %n Secante: %.3f %n Cossecante: %.3f %n Cotangente: %.3f", seno, cosseno, tangente, secante, cossecante, cotangente));
    }
}