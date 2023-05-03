package com.mycompany.banco;

public class ContaPoupanca extends ContaBancaria
{
    private int diaRendimento;

    public int getDiaRendimento()
    {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento)
    {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxa)
    {
        setSaldo(getSaldo() + (diaRendimento * taxa * getSaldo())/100);
    }
}
