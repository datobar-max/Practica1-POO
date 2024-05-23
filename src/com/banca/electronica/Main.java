package com.banca.electronica;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // Domicilios
        Domicilio domicilio1 = new Domicilio("Calle 1", 123, "Colonia 1", "Estado 1", 12345);
        Domicilio domicilio2 = new Domicilio("Calle 2", 456, "Colonia 2", "Estado 2", 67890);

        // Clientes
        Cliente cliente1 = new Cliente(1, "Cliente 1", domicilio1, "RFC1", "1234567890", "01/01/1980");
        Cliente cliente2 = new Cliente(2, "Cliente 2", domicilio2, "RFC2", "0987654321", "02/02/1990");

        // Cuentas
        Cuenta cuentaAhorro1 = new CuentaDeAhorro(1, 1000, 0.02);
        Cuenta cuentaCheque1 = new CuentaDeCheque(2, 2000, 50);
        Cuenta cuentaAhorro2 = new CuentaDeAhorro(3, 3000, 0.03);
        Cuenta cuentaCheque2 = new CuentaDeCheque(4, 4000, 60);

        // Se agregan cuentas a los clientes
        cliente1.agregarCuenta(cuentaAhorro1);
        cliente1.agregarCuenta(cuentaCheque1);
        cliente2.agregarCuenta(cuentaAhorro2);
        cliente2.agregarCuenta(cuentaCheque2);

        // Se agregan clientes al banco
        Domicilio bancoDomicilio = new Domicilio("Calle Principal", 789, "Centro", "Estado Principal", 54321);
        Banco banco = new Banco("BANCA ELECTRONICA", bancoDomicilio, "RFCBANCO", "1234567890");
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Información del banco y sus clientes
        System.out.println(banco);
        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
            for (Cuenta cuenta : cliente.getCuentas()) {
                System.out.println(cuenta);
            }
        }


        //Validar el funcionamiento de los métodos en la clase principal

        //Servicio Clientes
        System.out.println("\n---- Servicio Clientes ----");

        //Agregar Cliente
        Domicilio domicilio3 = new Domicilio("Calle 3", 789, "Colonia 3", "Estado 3", 54321);
        Cliente cliente3 = new Cliente(3, "Cliente 3", domicilio3, "RFC3", "0987654321", "03/03/2000");
        banco.agregarCliente(cliente3);
        System.out.println("Cliente agregado: " + cliente3);

        //Eliminar Cliente
        boolean clienteEliminado = banco.eliminarCliente(2);
        System.out.println("Cliente 2 eliminado: " + clienteEliminado);

        //Consultar Cliente
        Cliente clienteConsultado = banco.consultarCliente(1);
        System.out.println("Cliente 1 consultado: " + clienteConsultado);

        //Obtener Clientes
        Cliente[] clientes = banco.obtenerClientes();
        System.out.println("Todos los Clientes: ");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        //Buscar Cliente por RFC
        Cliente clientePorRFC = banco.buscarClientePorRFC("RFC3");
        System.out.println("Cliente con RFC3: " + clientePorRFC);


        //Servicio Cuentas
        System.out.println("\n---- Servicio Cuentas ----");


        //Agregar Cuenta
        Cuenta cuentaAhorro3 = new CuentaDeAhorro(5, 5000, 70);
        boolean cuentaAgregada = cliente3.agregarCuenta(cuentaAhorro3);
        System.out.println("Cuenta agregada: " + cuentaAgregada);

        //Cancelar Cuenta
        boolean cuentaCancelada = cliente3.cancelarCuenta(4);
        System.out.println("Cuenta 4 cancelada: " + cuentaCancelada);

        //Abonar Cuenta
        cliente3.abonarCuenta(1, 100);
        System.out.println("Se abona 500 a la cuenta 1. Nuevo saldo es: " + cuentaAhorro1.getSaldo());

        //Retirar de Cuenta
        cliente3.retirar(2, 100);
        System.out.println("Se retira 100 de la cuenta 2. Nuevo saldo es: " + cuentaCheque1.getSaldo());

        //Obtener Cuentas
        Cliente[] cuentasBanco = banco.obtenerClientes();
        System.out.println("Todas las Cuentas: ");
        for (Cliente cliente : cuentasBanco) {
            for (Cuenta cuenta : cliente.getCuentas()) {
                System.out.println("\n---- Cuenta: ----");
                System.out.println(cuenta);
            }
        }



    }
}
