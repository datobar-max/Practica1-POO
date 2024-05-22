package com.banca.electronica;

public class Main {

    public static void main(String[] args) {


        // Domicilios
        Domicilio domicilio1 = new Domicilio("Calle 1", 123, "Colonia 1", "Estado 1", 12345);
        Domicilio domicilio2 = new Domicilio("Calle 2", 456, "Colonia 2", "Estado 2", 67890);

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Cliente 1", domicilio1, "RFC1", "1234567890", "01/01/1980");
        Cliente cliente2 = new Cliente(2, "Cliente 2", domicilio2, "RFC2", "0987654321", "02/02/1990");

        // Cuentas
        Cuenta cuentaAhorro1 = new CuentaDeAhorro(1, 1000, 0.02);
        Cuenta cuentaCheque1 = new CuentaDeCheque(2, 2000, 50);
        Cuenta cuentaAhorro2 = new CuentaDeAhorro(3, 3000, 0.03);
        Cuenta cuentaCheque2 = new CuentaDeCheque(4, 4000, 60);

        // Agregar cuentas a los clientes
        cliente1.agregarCuenta(cuentaAhorro1);
        cliente1.agregarCuenta(cuentaCheque1);
        cliente2.agregarCuenta(cuentaAhorro2);
        cliente2.agregarCuenta(cuentaCheque2);

        // Crear banco y agregar clientes
        Domicilio bancoDomicilio = new Domicilio("Calle Principal", 789, "Centro", "Estado Principal", 54321);
        Banco banco = new Banco("BANCA ELECTRONICA", bancoDomicilio, "RFCBANCO", "1234567890");
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Mostrar información del banco y sus clientes
        System.out.println(banco);
        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
            for (Cuenta cuenta : cliente.getCuentas()) {
                System.out.println(cuenta);
            }
        }



    }
}
