package com.mycompany.empregado;

public class Horista extends Empregado
{
    private double precoHora;
    private double horasTrabalhadas;
    
    public double vencimento()
    {
        double valor = precoHora * horasTrabalhadas;
        return valor;
    }
}
