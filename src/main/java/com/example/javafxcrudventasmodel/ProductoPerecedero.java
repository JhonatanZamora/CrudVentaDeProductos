package com.example.javafxcrudventasmodel;

public class ProductoPerecedero extends Producto {
    private String fechaVencimiento="";
    public ProductoPerecedero (){}

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
