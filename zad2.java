import java.util.*;

public class Zad2 {
	public static int[][] macierzA = new int[100][100];
	public static int[][] macierzB = new int[100][100];
	public static int[][] macierzSumy = new int[100][100];
	public static int[][] macierzRoznicy = new int[100][100];
	public static int[][] macierzIloczynu = new int[100][100];
	public static int wymiar;
	
	public static void generuj() {
		Random rand = new Random();
		
		System.out.println("\nMacierz A:");
		for(int i = 0; i < wymiar; i++) {
			
			for(int j = 0; j < wymiar; j++) {
				macierzA[i][j] = rand.nextInt(21) - 10;
				System.out.print(macierzA[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\nMacierz B:");
		for(int i = 0; i < wymiar; i++) {
			
			for(int j = 0; j < wymiar; j++) {
				macierzB[i][j] = rand.nextInt(21) - 10;
				System.out.print(macierzB[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void dodaj() {
		System.out.println("\nMacierz sumy (A + B):");
		for(int i = 0; i < wymiar; i++) {
			
			for(int j = 0; j < wymiar; j++) {
				macierzSumy[i][j] = macierzA[i][j] + macierzB[i][j];
				System.out.print(macierzSumy[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void odejmij() {
		System.out.println("\nMacierz różnicy (A - B):");
		for(int i = 0; i < wymiar; i++) {
			
			for(int j = 0; j < wymiar; j++) {
				macierzRoznicy[i][j] = macierzA[i][j] - macierzB[i][j];
				System.out.print(macierzRoznicy[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void pomnoz() {
		System.out.println("\nMacierz iloczynu (A x B):");
		for(int i = 0; i < wymiar; i++) {
			
			for(int j = 0; j < wymiar; j++) {
				int sumaIloczynow = 0;
				
				for(int k = 0; k < wymiar; k++) {
					sumaIloczynow += macierzA[i][k] * macierzB[k][j];
				}
				
				macierzIloczynu[i][j] = sumaIloczynow;
				System.out.print(macierzIloczynu[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Podaj wymiar macierzy (maks. 100): ");
		wymiar = scanner.nextInt();
		scanner.close();
		
		generuj();
		dodaj();
		odejmij();
		pomnoz();
	}
}
