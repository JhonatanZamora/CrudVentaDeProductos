package com.example.javafxcrudventasmodel;

public class Venta {
    private  double totalCompra=0;
    private double iva=0;
    private String detallesDeLaCompra="";
    public Venta (){}
    public double calcularIvaAplicado (){
        double centinela=0;
        return centinela;
    }
    public double calcularTotalCompra ()
    {
        double centinela=0;
        return centinela;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDetallesDeLaCompra() {
        return detallesDeLaCompra;
    }

    public void setDetallesDeLaCompra(String detallesDeLaCompra) {
        this.detallesDeLaCompra = detallesDeLaCompra;
    }
}
