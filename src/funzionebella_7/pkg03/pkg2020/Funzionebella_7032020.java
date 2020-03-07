package funzionebella_7.pkg03.pkg2020;

import java.util.Random;
import java.util.Scanner;

public class Funzionebella_7032020 {

    static int StessiElementi(int vett1[], int vett2[], int numeri) {
        int vettocontrollo[] = new int[100], varcontrollo = 0, successo = 0, parziale = 0;
        for (int i = 0; i < numeri; i++) {
            varcontrollo = vett1[i];

            for (int j = 0; j < numeri; j++) {
                if (varcontrollo == vett2[j]) {
                    successo++;
                    j = numeri;
                }
                System.out.println();
            }
        }
        if (successo == numeri) {
            parziale++;
        }
        successo = 0;
        for (int i = 0; i < numeri; i++) {
            varcontrollo = vett2[i];

            for (int j = 0; j < numeri; j++) {
                if (varcontrollo == vett1[j]) {
                    successo++;
                    j = numeri;
                }
                System.out.println();
            }
        }
        if (successo == numeri) {
            parziale = parziale + 1;
        }
        System.out.println();
        return parziale;
    }

    public static void main(String[] args) {
        int stessi1[] = new int[100], stessi2[] = new int[100], questionequal = 0, numeri1 = 0, numeri2 = 0;
        Scanner kekkeroni = new Scanner(System.in);
        Random kekkaroni = new Random();
        System.out.print("numeri ");
        numeri1 = kekkeroni.nextInt();
        for (int i = 0; i < numeri1; i++) {
            System.out.print("a" + i + " ");
            stessi1[i] = kekkeroni.nextInt(10);
            System.out.print("b" + i + " ");
            stessi2[i] = kekkeroni.nextInt(10);
        }
        questionequal = StessiElementi(stessi1, stessi2, numeri1);
        if (questionequal == 2) {
            System.out.print("sei fortunato!");
        }
    }

}
