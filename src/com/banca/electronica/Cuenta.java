package com.banca.electronica;

public abstract class Cuenta {

    protected int numero;
    protected String fechaApertura;
    protected double saldo;
    protected String fechaCancelacion;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public abstract void calcularInteres();

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura=" + fechaApertura +
                ", saldo=" + saldo +
                ", fechaCancelacion=" + fechaCancelacion + '}';
    }

    //Getters & Setter


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }
}
