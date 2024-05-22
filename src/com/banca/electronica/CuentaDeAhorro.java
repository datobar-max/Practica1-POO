package com.banca.electronica;

public class CuentaDeAhorro extends Cuenta {

    private double tasaDeInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaDeInteresMensual) {
        super(numero, saldo);
        this.tasaDeInteresMensual = tasaDeInteresMensual;
    }

    public void calcularInteres(){
        this.saldo += this.saldo * this.tasaDeInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "numero=" + numero +
                ", fechaApertura=" + fechaApertura +
                ", saldo=" + saldo +
                ", fechaCancelacion=" + fechaCancelacion +
                ", tasaDeInteres=" + tasaDeInteresMensual + '}';
    }
}
