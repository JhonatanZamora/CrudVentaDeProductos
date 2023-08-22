package com.example.modelo;

import java.util.ArrayList;

public class Almacen {
    private String nombre;



    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Almacen(String nombre) {
        this.nombre = nombre;
        inicializarDatos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientesNaturales(ArrayList<ClienteNatural> listaClientesNaturales) {
        this.listaClientes = listaClientes;
    }
    private  void inicializarDatos(){
        Cliente cliente = new Cliente();

        cliente.setNombre("Jhonatan");
        cliente.setApellido("Zamora");
        cliente.setIdentificacion("1089");
        cliente.setDireccion("Ocaso");
        cliente.setTelefono("310739");
        cliente.setTipoCliente(TipoCliente.NATURAL);

        getListaClientes().add(cliente);

    }
}
