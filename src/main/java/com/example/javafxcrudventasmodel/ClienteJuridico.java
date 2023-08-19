package com.example.javafxcrudventasmodel;

public class ClienteJuridico extends Cliente {
    String numeroNit="";
    public ClienteJuridico(){}

    public String getNumeroNit() {
        return numeroNit;
    }

    public void setNumeroNit(String numeroNit) {
        this.numeroNit = numeroNit;
    }

    public boolean validarNit ()
    {
        boolean centinela=false;
        return centinela;
    }
}
