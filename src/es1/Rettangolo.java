package es1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double perimetro() {
        return (altezza + larghezza) * 2;
    }

    public double area() {
        return (altezza * larghezza);
    }

    public void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.perimetro());
        System.out.println("L'area del rettangolo è: " + rettangolo.area());
    }

    public void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Primo rettangolo: ");
        stampaRettangolo(rettangolo1);

        System.out.println("Secondo rettangolo: ");
        stampaRettangolo(rettangolo2);

        System.out.println("\n");

        System.out.println("La somma dei perimetri dei due rettangoli è: ");
        double sommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro();
        System.out.println(sommaPerimetri);

        System.out.println("La somma delle aree dei due rettangoli è: ");
        double sommaAree = rettangolo1.area() + rettangolo2.area();
        System.out.println(sommaAree);
    }
}
