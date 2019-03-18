import java.util.*;

public class Zad1 {
    public static double[] generuj(double[] tablica){
        List <Double> values = Arrays.asList(2.0, 3.0, 3.5, 4.0, 4.5, 5.0);
        Random rand = new Random();

        System.out.print("Wylosowane wartości: ");
        for(int i = 0; i < tablica.length; i++){
            tablica[i] = values.get(rand.nextInt(values.size()));
            System.out.print(tablica[i] + ", ");
        }

        return tablica;
    }

    public static double policz(double[] tablica) {
        double suma = 0, srednia, max = 2.0, min = 5.0;
        for(int i = 0; i < tablica.length; i++){
            suma += tablica[i];

            if(tablica[i] > max) {
                max = tablica[i];
            }

            if(tablica[i] < min) {
                min = tablica[i];
            }
        }
        srednia = suma / tablica.length;

        System.out.print("\nŚrednia: ");
        System.out.format("%.2f%n", srednia);
        System.out.println("Wartość minimalna: " + min);
        System.out.println("Wartość maksymalna: " + max);
        return srednia;
    }

    public static void nadSrednia(double[] tablica, double srednia) {
        System.out.print("Wartości wyższe od średniej: ");

        for(int i = 0; i < tablica.length; i++) {
            if(tablica[i] > srednia) {
                System.out.print(tablica[i] + ", ");
            }
        }
    }

    public static void podSrednia(double[] tablica, double srednia) {
        System.out.print("\nWartości niższe od średniej: ");

        for(int i = 0; i < tablica.length; i++) {
            if(tablica[i] < srednia) {
                System.out.print(tablica[i] + ", ");
            }
        }
    }

    public static void odchylenie(double[] tablica, double srednia) {
        double licznik = 0, odchylenie;

        for(int i = 0; i < tablica.length; i++) {
            licznik += Math.pow(tablica[i] - srednia, 2);
        }

        odchylenie = Math.sqrt(licznik / tablica.length);
        System.out.print("\nOdchylenie standardowe: ");
        System.out.format("%.2f%n", odchylenie);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość tablicy: ");
        int dlugosc = scanner.nextInt();
        scanner.close();

        double[] tablica = new double[dlugosc];

        tablica = generuj(tablica);
        double srednia = policz(tablica);
        nadSrednia(tablica, srednia);
        podSrednia(tablica, srednia);
        odchylenie(tablica, srednia);
    }
}
