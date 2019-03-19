import java.util.*;

public class Zad2 {

    public static int[][] generuj(int[][] macierz, int wymiar) {
        Random rand = new Random();

        for(int i = 0; i < wymiar; i++) {
            for(int j = 0; j < wymiar; j++)
                macierz[i][j] = rand.nextInt(21) - 10;
        }

        return macierz;
    }

    public static void wypisz(int[][] macierz, int wymiar) {
    	
        for (int i = 0; i < wymiar; i++) {
            for (int j = 0; j < wymiar; j++)
                System.out.print(macierz[i][j] + " ");
            
            System.out.println();
        }
    }

    public static void dodaj(int[][] macierzA, int[][] macierzB, int wymiar) {
        int[][] macierzSumy = new int[wymiar][wymiar];
        System.out.println("\nMacierz sumy (A + B):");
        
        for(int i = 0; i < wymiar; i++) {
            for(int j = 0; j < wymiar; j++) {
                macierzSumy[i][j] = macierzA[i][j] + macierzB[i][j];
                System.out.print(macierzSumy[i][j] + " ");
            }
            
            System.out.println();
        }
    }

    public static void odejmij(int[][] macierzA, int[][] macierzB, int wymiar) {
        int[][] macierzRoznicy = new int[wymiar][wymiar];
        System.out.println("\nMacierz różnicy (A - B):");
        
        for(int i = 0; i < wymiar; i++) {
            for(int j = 0; j < wymiar; j++) {
                macierzRoznicy[i][j] = macierzA[i][j] - macierzB[i][j];
                System.out.print(macierzRoznicy[i][j] + " ");
            }
            
            System.out.println();
        }
    }

    public static void pomnoz(int[][] macierzA, int[][] macierzB, int wymiar) {
        int[][] macierzIloczynu = new int[wymiar][wymiar];
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
        System.out.print("Podaj wymiar macierzy: ");
        
        int wymiar = scanner.nextInt();
        scanner.close();

        int[][] macierzA = new int[wymiar][wymiar];
        int[][] macierzB = new int[wymiar][wymiar];

        macierzA = generuj(macierzA, wymiar);
        macierzB = generuj(macierzB, wymiar);

        System.out.println("\nMacierz A: ");
        wypisz(macierzA, wymiar);
        
        System.out.println("\nMacierz B: ");
        wypisz(macierzB, wymiar);

        dodaj(macierzA, macierzB, wymiar);
        odejmij(macierzA, macierzB, wymiar);
        pomnoz(macierzA, macierzB, wymiar);
    }
}
