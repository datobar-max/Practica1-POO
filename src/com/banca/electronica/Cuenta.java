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


}
