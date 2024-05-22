package com.banca.electronica;

public class Domicilio {

    private String calle;
    private int numero;
    private String colonia;
    private String estado;
    private int codigoPostal;

    public Domicilio(String calle, int numero, String colonia, String estado, int codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle=" + calle +
                ", numero=" + numero +
                ", colonia=" + colonia +
                ", estado=" + estado +
                ", codigoPostal=" + codigoPostal + '}';
    }
}
