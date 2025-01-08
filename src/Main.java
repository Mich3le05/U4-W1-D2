public class Main {

    public static void main(String[] args) {
    }
        //Esercizio 1
        // stringaPariDispari, che accetta una stringa e ritorna true se il numero di caratteri è pari e false se il numero di caratteri è dispari.
        public static boolean stringaPariDispari (String str){
            return str.length() % 2 == 0 ? true : false;
        }

        //        annoBisestile, che accetta un anno espresso come intero e ritorna true se esso è bisestile, false altrimenti.
        public static boolean annoBisestile ( int anno){
            if (anno % 400 == 0) {
                return true;
            } else if (anno % 4 == 0 && anno % 100 != 0) {
                return true;
            } else {
                return false;
            }
        }

}