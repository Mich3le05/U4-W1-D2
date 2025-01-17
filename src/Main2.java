import java.util.Scanner;

public class Main2 {

    //	Scrivere un programma che chiede un intero in ingresso e lo stampa in lettere se il valore è compreso tra 0 e 3, altrimenti stampa un messaggio d'errore usando il costrutto switch.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        System.out.println(stampaNumero(test));
        scan.close();

    }

    public static String stampaNumero(int num) {
        String risultato;
        switch (num) {
        //Ogni case rappresenta un numero. Se il numero passato è pari al valore specificato nel case, il programma assegna alla variabile risultato il corrispondente valore testuale.
            case 0: {
                risultato = "zero";
                break;
            }
            case 1: {
                risultato = "uno";
                break;
            }
            case 2: {
                risultato = "due";
                break;
            }
            case 3: {
                risultato = "tre";
                break;
            }
            default:
                risultato = "Numero non compreso tra 0 e 3, impossibile convertire";
        }
        return risultato;
    }

}
