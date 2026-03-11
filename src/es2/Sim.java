package es2;

import java.util.Arrays;

public class Sim {
    private long numeroDiTelefono;
    private double creditoDisponibile;
    private Chiamata[] chiamata;

    public Sim(long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.creditoDisponibile = 0;
        this.chiamata = new Chiamata[5];
    }

    public void stampaDatiSim() {

    }

    @Override
    public String toString() {
        return "Sim{" +
                "numeroDiTelefono=" + numeroDiTelefono +
                ", creditoDisponibile=" + creditoDisponibile +
                ", chiamata=" + Arrays.toString(chiamata) +
                '}';
    }
}

