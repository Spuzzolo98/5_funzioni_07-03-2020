package funzionebella_7.pkg03.pkg2020;

import java.util.Random;
import java.util.Scanner;

public class Funzionebella_7032020 {

    /**
     * funzione 1
     *
     * calcola quanti numeri pari ci sono in un vettore
     *
     * @param vettore
     * @param numeri
     * @return
     */
    static int contapari(int vettore[], int numeri) {
        int paricontati = 0;
        for (int i = 0; i < numeri; i++) {
            if (vettore[i] % 2 == 0) {
                paricontati++;
            }
        }
        return paricontati;
    }

    /**
     * funzione 2
     *
     * calcola quanto vale la media degli elementi di un vettore
     *
     * @param vettore
     * @param numeri
     * @return
     */
    static int media(int vettore[], int numeri) {
        int mediafatta = 0;
        for (int i = 0; i < numeri; i++) {
            mediafatta = mediafatta + vettore[i];
        }
        mediafatta = mediafatta / numeri;
        return mediafatta;
    }

    /**
     * funzione 3
     *
     * capisce se il vettore può essere invertito mantenendo lo stesso ordine di
     * elementi
     *
     * @param vettore
     * @param numeri
     * @return
     */
    static int palindromo(int vettore[], int numeri) {
        int palindromocontrollo = 0, j = 1;
        for (int i = 0; i < numeri; i++) {
            if (vettore[i] - vettore[numeri - j] != 0) {
                palindromocontrollo++;
            }
            j++;
        }
        return palindromocontrollo;
    }

    /**
     * funzione 4
     *
     * (questa è impestata) capisce se due vettori hanno gli stessi elementi al
     * loro interno, non curante dell'ordine e (da aggiungere) nemmeno della
     * diversa quantità di elementi
     *
     * @param vett1
     * @param vett2
     * @param numeri
     * @return
     */
    static int StessiElementi(int vett1[], int vett2[], int numeri) {
        int vettocontrollo[] = new int[100], varcontrollo = 0, successo = 0, parziale = 0;
        for (int i = 0; i < numeri; i++) {
            varcontrollo = vett1[i];

            for (int j = 0; j < numeri; j++) {
                if (varcontrollo == vett2[j]) {
                    successo++;
                    j = numeri;
                }
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
            }
        }
        if (successo == numeri) {
            parziale = parziale + 1;
        }
        return parziale;
    }

    /**
     * funzione 5
     *
     * calcola se in un vettore esiste un oggetto il cui valore è il doppio di
     * un altro presente nel vettore
     *
     * @param vettore
     * @param numeri
     * @return
     */
    static int doppiodellaltro(int vettore[], int numeri) {
        int controllo = 0, doppiocontrollo = 0;
        for (int i = 0; i < numeri; i++) {
            controllo = vettore[i];
            for (int j = 0; j < numeri; j++) {
                if (controllo == (vettore[j] * 2)) {
                    doppiocontrollo++;
                }
            }
        }

        return doppiocontrollo;
    }

    /**
     * main
     *
     * beh, è il main
     *
     * @param args
     */
    public static void main(String[] args) {
        int contaparivett[] = new int[100], mediavett[] = new int[100], palindromovett[] = new int[100], stessielementivett1[] = new int[100], stessielementivett2[] = new int[100], doppiovett[] = new int[100];
        int contaparinumeri = 0, contaparicontati = 0, medianumeri = 0, mediafatta = 0, palindromonumeri = 0, palindromocontrollo = 0, stessielementirestituito = 0, stessielementinumeri = 0, doppionumeri = 0, doppiocontrollo = 0;
        Scanner scannervar = new Scanner(System.in);
        Random randomvar = new Random();

        System.out.println("funzione 1!");                                      //funzione 1
        System.out.print("quanti numeri? ");
        contaparinumeri = scannervar.nextInt();
        for (int i = 0; i < contaparinumeri; i++) {
            contaparivett[i] = scannervar.nextInt();
        }
        contaparicontati = contapari(contaparivett, contaparinumeri);
        System.out.print("i numeri pari del vettore sono " + contaparicontati);
        System.out.println();

        System.out.println("funzione 2!");                                      //funzione2
        System.out.print("quanti numeri? ");
        medianumeri = scannervar.nextInt();
        for (int i = 0; i < medianumeri; i++) {
            mediavett[i] = scannervar.nextInt();
        }
        mediafatta = media(mediavett, medianumeri);
        System.out.print("la media è " + mediafatta);
        System.out.println();

        System.out.println("funzione 3!");                                      //funzione3
        System.out.print("quanti numeri? ");
        palindromonumeri = scannervar.nextInt();
        for (int i = 0; i < palindromonumeri; i++) {
            palindromovett[i] = scannervar.nextInt();
        }
        palindromocontrollo = palindromo(palindromovett, palindromonumeri);
        if (palindromocontrollo == 0) {
            System.out.println("è palindromo!");
        }
        if (palindromocontrollo != 0) {
            System.out.println("non è palindromo...");
        }

        System.out.println("funzione 4!");                                      //funzione4
        System.out.print("quanti numeri? ");
        stessielementinumeri = scannervar.nextInt();
        for (int i = 0; i < stessielementinumeri; i++) {
            System.out.print("a" + i + " ");
            stessielementivett1[i] = scannervar.nextInt(10);
            System.out.print("b" + i + " ");
            stessielementivett2[i] = scannervar.nextInt(10);
        }
        stessielementirestituito = StessiElementi(stessielementivett1, stessielementivett2, stessielementinumeri);
        if (stessielementirestituito == 2) {
            System.out.println("sei fortunato!");
        }
        if (stessielementirestituito != 2) {
            System.out.println("questi vettori non sono uguali...");
        }

        System.out.println("funzione 5!");                                      //funzione5
        System.out.print("quanti numeri? ");
        doppionumeri = scannervar.nextInt();
        for (int i = 0; i < doppionumeri; i++) {
            doppiovett[i] = scannervar.nextInt();
        }
        doppiocontrollo = doppiodellaltro(doppiovett, doppionumeri);
        if (doppiocontrollo != 0) {
            System.out.println("c'è almeno un numero doppio in questo vettore!");
        }
        if (doppiocontrollo == 0) {
            System.out.println("non c'è nessun numero raddoppiato qui...");
        }

    }

}
