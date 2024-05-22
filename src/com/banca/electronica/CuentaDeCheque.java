package com.banca.electronica;

public class CuentaDeCheque extends Cuenta{

    private double costoManejoMensual;

    public CuentaDeCheque(int numero, double saldo, double costoManejoMensual) {
        super(numero, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }

    public void calcularInteres(){
        this.saldo -= this.costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" +
                "numero=" + numero +
                ", fechaApertura=" + fechaApertura +
                ", saldo=" + saldo +
                ", fechaCancelacion=" + fechaCancelacion +
                ", costoManejoMensual=" + costoManejoMensual + '}';
    }


}
