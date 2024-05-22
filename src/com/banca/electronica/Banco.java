package com.banca.electronica;

import java.util.ArrayList;

public class Banco {

    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", rfc=" + rfc + ", telefono=" + telefono + ", clientes=" + clientes + '}';
    }


}
