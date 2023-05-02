package com.mycompany.banco;

public class ContaPoupanca extends ContaBancaria
{
    private int diaRendimento;
    
    public ContaPoupanca(int diaRendimento)
    {
       if (diaRendimento > 0)
           this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(float taxa)
    {
        float novoSaldo = super.getSaldo();
        double montante = novoSaldo + Math.pow((1 + taxa), diaRendimento);
        return montante;
    }
}
