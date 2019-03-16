import java.util.*;

public class Zad1 {
	public static int dlugosc;
	public static double[] tablica = new double[100];
    public static double suma, srednia, max = 2.0, min = 5.0;
    
    public static void generuj(){
    	List <Double> values = Arrays.asList(2.0, 3.0, 3.5, 4.0, 4.5, 5.0);
        Random rand = new Random();
        
        System.out.print("Wylosowane wartości: ");
        for(int i = 0; i < dlugosc; i++){
            tablica[i] = values.get(rand.nextInt(values.size()));
            System.out.print(tablica[i] + ", ");
        }
    }
    
    public static void policz() {
    	for(int i = 0; i < dlugosc; i++){
    		suma += tablica[i];
    		
    		if(tablica[i] > max) {
    			max = tablica[i];
    		}
    		
    		if(tablica[i] < min) {
    			min = tablica[i];
    		}
    	}
    	srednia = suma / dlugosc;
    	
    	System.out.print("\nŚrednia: ");
    	System.out.format("%.2f%n", srednia);
        System.out.println("Wartość minimalna: " + min);
        System.out.println("Wartość maksymalna: " + max);
    }
    
    public static void nadSrednia() {
    	System.out.print("Wartości wyższe od średniej: ");
    	
    	for(int i = 0; i < dlugosc; i++) {
    		if(tablica[i] > srednia) {
    			System.out.print(tablica[i] + ", ");
    		}
    	}
    }
    
    public static void podSrednia() {
    	System.out.print("\nWartości niższe od średniej: ");
    	
    	for(int i = 0; i < dlugosc; i++) {
    		if(tablica[i] < srednia) {
    			System.out.print(tablica[i] + ", ");
    		}
    	}
    }
    
    public static void odchylenie() {
    	double licznik = 0, odchylenie;
    	
    	for(int i = 0; i < dlugosc; i++) {
    		licznik += Math.pow(tablica[i] - srednia, 2);
    	}
    	
    	odchylenie = Math.sqrt(licznik / dlugosc);
    	System.out.print("\nOdchylenie standardowe: ");
    	System.out.format("%.2f%n", odchylenie);
    }
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość tablicy (maks. 100): ");
        dlugosc = scanner.nextInt();
        scanner.close();
        
        generuj();   
        policz();
        nadSrednia();
        podSrednia();
        odchylenie();
    }
}
