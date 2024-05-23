package com.banca.electronica;

import java.util.ArrayList;

public class Banco implements ServicioClientes{

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

    public boolean agregarCliente(Cliente cliente){
        return this.clientes.add(cliente);
    }

    @Override
    public boolean eliminarCliente(int numero) {
        return this.clientes.removeIf(cliente -> cliente.getNumero() == numero);
    }

    @Override
    public Cliente consultarCliente(int numero) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumero() == numero) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente[] obtenerClientes() {
        return clientes.toArray(new Cliente[0]);
    }

    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        for (Cliente cliente : clientes) {
            if (cliente.getRfc().equals(rfc)) {
                return cliente;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", rfc=" + rfc + ", telefono=" + telefono + ", clientes=" + clientes + '}';
    }




    //Getters & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
