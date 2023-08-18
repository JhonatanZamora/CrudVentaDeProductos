package com.example.javafxcrudventasmodel;

public class ProductoRefrigerado {

    private String codigoAprobacion="";
    private int temperaturaRefrigerado=0;
    public ProductoRefrigerado () {}

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public int getTemperaturaRefrigerado() {
        return temperaturaRefrigerado;
    }

    public void setTemperaturaRefrigerado(int temperaturaRefrigerado) { this.temperaturaRefrigerado = temperaturaRefrigerado; }
}
