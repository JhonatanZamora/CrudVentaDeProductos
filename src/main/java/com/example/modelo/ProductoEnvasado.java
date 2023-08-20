package com.example.modelo;

public class ProductoEnvasado extends Producto {
    private String fechaEnvasado="";
    private double pesoEnvase=0;
    private String paisOrigen="";
    public ProductoEnvasado (){}
    public boolean validarPais (String pais)
    {
        boolean centinela=false;
        if (pais.equals("colombia") || pais.equals("argentina"))
        {
            centinela=true;
        }
        return centinela;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
