package es1;

public class Main {
    static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(6.0, 8.0);

        System.out.println("Rettangolo: ");
        rettangolo.stampaRettangolo(rettangolo);


        Rettangolo rettangolo1 = new Rettangolo(5.0, 4.0);
        Rettangolo rettangolo2 = new Rettangolo(8.0, 9.0);

        System.out.println("\n");

        rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }


}
