public class Main {
    public static void main(String[] args) {
//Secondo esercizio
        Auto auto1 = new Auto("Ferrari", "f50", 9, 2, 2, 500000.0);
        Auto auto2 = new Auto("Fiat", "Panda", 5, 4, 5,1000.0);

        Auto[] autoArray = {auto1, auto2};
        Concessionario concessionario = new Concessionario(autoArray);

        concessionario.stampaAuto();
        concessionario.prezzoMinMax(autoArray);



//Primo esercizio
        char[] caratteri = {'a', 'b', 'c', 'a', 'd', 'e', 'a'};

        stampaOccorrenza(caratteri, 'a');

        int[] arrayNumbers = {1,2,3,4,5,6,7,8,9,10};

        mediaNum(arrayNumbers);
        stampaValori(arrayNumbers, 10, 30);

        String[] saluti = {"ciao", "buongiorno", "buonasera", "buonanotte"};
        lunghezzaStringhe(saluti, 5);
        //non stampa ciao perché la sua dimensione è 4
    }
    //a)Scrivere un metodo che calcoli la media di tutti i numeri dispari
    // all’interno dell’array e stampi l’informazione a video.
    public static void mediaNum(int[] arrayNumbers) {
        //variabile d'appoggio per calcolare somma
        int somma = 0;
        //variabile d'appoggio per calcolare media
        int media = 0;
        //variabile per tener conto dei numeri dispari
        int countNumeriDispari = 0;
        //ciclare sulla lunghezza dell'array
        for (int i = 0; i < arrayNumbers.length; i++) {
            //controlliamo che ci siano numeri dispari prendendo un elemento dell'array
            if (arrayNumbers[i] % 2 != 0) {
                //elemento arrayNumbers[i] è dispari
                //quindi facciamo la somma
                somma += arrayNumbers[i];
                //tengo traccia dei numeri dispari, incremento il contatore
                countNumeriDispari++;
            }
        }
        //calcoliamo la media solo sui numeri dispari
        media = somma / countNumeriDispari;
        //la media è
        System.out.println("La media dei numeri dispari è: " + media);
    }
    //b) Scrivere un metodo che prenda in ingresso un array e 2 valori aggiuntivi
    //e stampi tutti i valori che sono compresi tra questi due estremi.
    public static void stampaValori(int[] arrayNumbers, int min, int max) {
        //dobbiamo controllare se l'array è nel range di val1 e val2
        //ad esempio: min= 10 e max = 30 -> {tutti gli elementi tra 10 e 30}
        for (int valore : arrayNumbers) {
            //dobbiamo verificare se abbiamo numeri tra i valori
            if (valore >= min && valore <= max) {
                System.out.println("I valori compresi tra " + min + " e " + max + " è " +  valore);
            }
        }
    }
    //c) Scrivere un metodo che accetti in ingresso un array di stringhe ed una dimensione
    // stabilita dall’utente e stampi tutte le stringhe che soddisfano il requisito,
    //lunghezza della stringa maggiore o uguale alla dimensione passata nel costruttore del metodo
    public static void lunghezzaStringhe(String[] saluti, int dimensione) {
        for ( int i = 0; i < saluti.length; i++) {
            if (saluti[i].length() >= dimensione) {
                dimensione = saluti.length;
                System.out.println(saluti[i]);
            }
        }
    }
    public static void stampaOccorrenza(char[] caratteri, char occorrenzaA) {
        int contatore = 0;
        for(char carattere : caratteri) {
            if(carattere == occorrenzaA) {
                contatore++;
            }
        }
        System.out.println("Occorrenza del carattere " + occorrenzaA + " è: " + contatore);
    }

}