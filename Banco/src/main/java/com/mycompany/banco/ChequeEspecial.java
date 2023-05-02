package com.mycompany.banco;

public class ChequeEspecial extends ContaBancaria
{
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
