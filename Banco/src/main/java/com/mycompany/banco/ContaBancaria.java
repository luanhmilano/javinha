package com.mycompany.banco;

import javax.swing.JOptionPane;

public class ContaBancaria
{
    private String cliente;
    private int numeroConta;
    private float saldo;

    public String getCliente()
    {
        return cliente;
    }

    public void setCliente(String cliente) 
    {
        this.cliente = cliente;
    }

    public int getNumeroConta() 
    {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    
    public float sacar(float s)
    {
        if (s < saldo)
            saldo = saldo - s;
        else
            JOptionPane.showMessageDialog(null, "Valor maior que o saldo!");
        return saldo;
    }
    public float depositar(float d)
    {
        if (d > 0.0)
            saldo = saldo + d;
        return saldo;
    }
}
