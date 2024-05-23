package com.banca.electronica;

import java.util.ArrayList;

public class Cliente implements ServicioCuentas{

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

    public boolean agregarCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        this.cuentas.removeIf(cuenta ->
                cuenta.getNumero() == numero
        );
        return false;
    }

    @Override
    public void abonarCuenta(int numero, double abono) {
        for (Cuenta cuenta : cuentas){
            if (cuenta.getNumero() == numero){
                cuenta.setSaldo(cuenta.getSaldo() + abono);
            }
        }
    }

    @Override
    public void retirar(int numero, double retiro) {
        for (Cuenta cuenta : cuentas){
            if (cuenta.getNumero() == numero){
                cuenta.setSaldo(cuenta.getSaldo() - retiro);
            }
        }
    }

    @Override
    public Cuenta[] obtenerCuentas() {
        return cuentas.toArray(new Cuenta[0]);
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

    //Getters & Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

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

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
