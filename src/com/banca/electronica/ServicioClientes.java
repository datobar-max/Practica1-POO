package com.banca.electronica;

public interface ServicioClientes {

    public boolean agregarCliente(Cliente cliente);
    public boolean eliminarCliente(int numero);
    public Cliente consultarCliente(int numero);
    public Cliente[] obtenerClientes();
    public Cliente buscarClientePorRFC(String rfc);

}
