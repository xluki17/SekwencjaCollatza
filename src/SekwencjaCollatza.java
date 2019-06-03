import java.util.Scanner;

public class SekwencjaCollatza {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną: ");
        int n = s.nextInt();

        while (n < 0) {
            System.out.print("Podaj liczbę większą od 0: ");
            n = s.nextInt();
        }
        System.out.print(n + " ");

        int iloscPowtorzen = 1;
        int max = 0;

        while (n != 1) {
            iloscPowtorzen++;
            if (max < n) {
                max = n;
            }
            if (n % 2 == 0) {
                if ((iloscPowtorzen % 10) == 0) {
                    System.out.println((n / 2) + " ");
                    n = n / 2;
                } else {
                    System.out.print((n / 2) + " ");
                    n = n / 2;
                }

            } else {
                if ((iloscPowtorzen % 10) == 0) {
                    System.out.println(((n * 3) + 1) + " ");
                    n = 3 * n + 1;
                } else {
                    System.out.print(((n * 3) + 1) + " ");
                    n = 3 * n + 1;
                }
            }
        }
        System.out.println();
        System.out.println("Maksymalna wartość: " + max);
        System.out.println("Zakończone po " + (iloscPowtorzen - 1) + " krokach");
    }
}

