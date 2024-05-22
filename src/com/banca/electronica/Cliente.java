package com.banca.electronica;

import java.util.ArrayList;

public class Cliente {

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;


    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getCuentas(){
        return this.cuentas;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre=" + nombre +
                ", domicilio=" + domicilio +
                ", rfc=" + rfc +
                ", telefono=" + telefono +
                ", cuentas=" + cuentas +
                ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
