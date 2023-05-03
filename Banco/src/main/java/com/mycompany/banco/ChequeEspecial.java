package com.mycompany.banco;

import javax.swing.JOptionPane;

public class ChequeEspecial extends ContaBancaria
{
    private float limite;

    public float getLimite()
    {
        return limite;
    }

    public void setLimite(float limite)
    {
        this.limite = limite;
    }

    @Override
    public float sacar(float s)
    {
        if (s < (getSaldo() + limite))
            setSaldo(getSaldo() - s);
        else
            JOptionPane.showMessageDialog(null, "Valor de saque maior que o autorizado.");
        return super.getSaldo();
    }
}
