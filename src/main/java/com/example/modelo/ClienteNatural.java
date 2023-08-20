package com.example.modelo;

public class ClienteNatural extends Cliente {
    private String email ="";
    private String fechaNacimiento="";

    public ClienteNatural() {}

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
