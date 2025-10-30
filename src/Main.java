import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        String pozdrav = "Ahoj svet";
        String meno = "praje Miloš";
        meno = pozdrav;

       // Toto je vypisanie konzoly
        System.out.println(pozdrav + " " + meno);
        System.out.println("Hello World!");
        System.out.println("Hello World!");
*/

        // Kalkulacka
      /*  int prveCislo = 10;
        int druheCislo = 5;

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);

        boolean pravdaNepravda = false; */
 /*
        float prveDesCislo = 0.1f;
        float druheDesCislo = 0.2f;
        System.out.println(prveDesCislo + druheDesCislo);
*/
  /*      System.out.println("Ahoj, zadaj meno: ");
        Scanner  mojScanner = new Scanner(System.in);
        String meno = mojScanner.nextLine();
        System.out.println("Prajem pekny den " + meno);
  */
/*
        // moj pokus vylepsena kalkulacka
        Scanner  mojScanner = new Scanner(System.in);

        System.out.println("Zadaj prve cislo: ");
        int prveCislo = mojScanner.nextInt();
        System.out.println("Zadaj druhe cislo: ");
        int druheCislo = mojScanner.nextInt();
        System.out.println("Prepocet: ");
        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);
        System.out.println(prveCislo % druheCislo);
*/
        //String metody
     /*   Scanner  mojScanner = new Scanner(System.in);
        System.out.println("Zadaj svoj text: ");
        String mojText = mojScanner.nextLine();

        System.out.println(mojText.length());
        System.out.println(mojText.isEmpty());
        System.out.println(mojText.toUpperCase());
        System.out.println(mojText.toLowerCase());
        System.out.println(mojText.contains("hoj"));
        System.out.println(mojText.indexOf("e"));
        System.out.println(mojText.substring(2)); */

        // Prevod textoveho cisla na cislo
      /*  String textCislo = "55";
        int prevedeneCislo = Integer.parseInt(textCislo);
        System.out.println(prevedeneCislo + 5); */

      /*  int x = 10;
        int y = 9;
        // x =! y; // x = x + y  da sa zapisat aj x +=y ...podobne s *,/,-
        System.out.println(++x); //!= nerovna sa  // ++x pripocita 1  a --x odcita 1
        */
        /*
        // Logicke vyrazy, ak obidve strany(alebo viac)  su pravdive vrati pravdu
        int x = 10;
        int y = 9;
        int z = 12;
        System.out.println(x > y && z > x);
        */
        /*
        // Logicke vyrazy, OR aspon jedna strana je pravdiva, tak cely  vyraz je pravdivy
        /*
        int x = 10;
        int y = 9;
        int z = 12;
        System.out.println(x > y || z > x || z > y);
        */
        /*
        // Logicke vyrazy, ! logicka negacia aspon jedna strana je pravdiva, tak cely  vyraz je pravdivy
        int x = 10;
        int y = 9;
        int z = 12;
        System.out.println(!(x > y || z < x));
            */
        //Podmienky
  /*
        Scanner  mojScanner = new Scanner(System.in);
        System.out.println("Zadaj vek:");
        int vek = mojScanner.nextInt();

        if (vek >= 18 && vek >= 65) {
            System.out.println("Uzivatel je dospely");
        }
        else if(vek >= 65) {
            System.out.println("Uzivatel je senior");
        }
        else if(vek < 18 && vek >=0){
            System.out.println("Uzivatel je dieta");
        }
        else {
            System.out.println("Neda sa zadat zaporny vek");
        }
*/
/*        Scanner  mojScanner = new Scanner(System.in);
        System.out.println("Zadaj vek:");
        int vek = mojScanner.nextInt();

        if (vek >= 18) {
            System.out.println("Uzivatel je dospely");
            if (vek >= 65) {
                System.out.println("Uzivatel je senior");
            }
        }
        else if(vek < 18 && vek >=0){
            System.out.println("Uzivatel je dieta");
        }
        else {
            System.out.println("Neda sa zadat zaporny vek");
        }
*/
/*
        //Vypocet BMI hmotnost(kg / vyska (m) na druhu
        // (18.5) - podvaha
        // (>=18.5 && < 25) - optimalna vaha
        // (>=25) - nadvaha

        float vyska;
        float hmotnost;
        float bmi;

        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj vysku(m):");
        vyska = mojScanner.nextFloat();

        System.out.println("Zadaj hmotnost (kg):");
        hmotnost = mojScanner.nextFloat();

        bmi = hmotnost / (vyska * vyska);
        System.out.println("Tvoje BMI je: " + (hmotnost / (vyska * vyska)));
            if (bmi >= 0 && bmi < 18.5) {
            System.out.println("Mas podvahu");
            }
            else if (bmi >=18.5 && bmi < 25){
            System.out.println("Optimalna vaha");
            }
            else if (bmi >=25) {
            System.out.println("Mas nadvahu");
             }
            else {
            System.out.println("Nejde zadat zapornu hodnotu");
            }
*/
 /*       // Hra kocky  neparna=vyhravas, parna=prehravas
        int hodeneCislo;
        Random nahodnyGenerator = new Random();
        hodeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println(hodeneCislo);
        if (hodeneCislo % 2 == 1) {
            System.out.println("Neparna vyhravas");
        }
        else {
            System.out.println("Parna prehravas");
        }

*/
/*
        Scanner mojScanner = new Scanner(System.in);
        int cisloDna;
        System.out.println("Zadaj cislo dna: ");
        cisloDna = mojScanner.nextInt();

        switch (cisloDna) {
            case 1:
                System.out.println("Je pondelok");
                break;
            case 2:
                System.out.println("Je utorok");
                break;
            case 3:
                System.out.println("Je streda");
                break;
            case 4:
                System.out.println("Je stvrtok");
                break;
            case 5:
                System.out.println("Je piatok");
                break;
            case 6:
                System.out.println("Je sobota");
                break;
            case 7:
                System.out.println("Je nedela");
                break;
            default:
                System.out.println("Neplatne cislo dna");
        }
*/
 /*
        Scanner mojScanner = new Scanner(System.in);
        int cisloDna;
        System.out.println("Zadaj cislo dna: ");
        cisloDna = mojScanner.nextInt();
        // prepadavanie switch-a bez break
        switch (cisloDna) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovny den");
                break;
            case 6:
            case 7:
                System.out.println("Je vikend");
                break;
            default:
                System.out.println("Neplatne cislo dna");
        }
*/
 /*       //Pole- klasicky - dlhy zapis
        int[] znamky = new int[5]; // java v poli znamky vytvori 5 prazdnych schranok
        znamky[0] = 3; // indexuje sa od pozicie 0
        znamky[1] = 5;
        znamky[2] = 2;
        znamky[3] = 3;
        znamky[4] = 1;

        System.out.println(znamky[2]);
*/
 /*
 //Pole- skrateny zapis
        // int[] znamky = new int[] {3, 5, 2, 3, 1}; // {vyplni prvky cize aj pole}
        // System.out.println(znamky[0]);

        String[] menaStudentov = new String[] {"Jan", "Jozef", "Peter", "Katka, Janka"};
        // menaStudentov[3] = "Tereza";
        System.out.println(menaStudentov[0].length()); // dlzka textu nulteho pola
        System.out.println(menaStudentov.length); // velkost pola vratane 0

        // int[][] viceDimPole = new int [2][2];
        //        viceDimPole[0][0] = 83;
*/

//Smycky - Cykly

        // for (int i = 1; i < 8; ++i)
        //    System.out.println(i);
        //for (int i =0; i < 100; i++) {
        // System.out.println(i + ". Ahoj svet!");
        // System.out.println(i * 5);

        // String[] menaStudentov = new String[] {"Jan", "Jozef", "Peter", "Katka", "Janka"};

       // for (int i = 0; i < 4; i++) {
       //     System.out.println(menaStudentov[i]);

        // for (int i = 0; i < menaStudentov.length; i++) {  //to iste, ale keby sa menilo velkost pola tak to mam osetrene
        //     System.out.println(menaStudentov[i]);
        //foreach
 /*       for(String jednoMeno: menaStudentov) {
            System.out.println(jednoMeno);
        }
 */
        // Vypis pola nasobku
        // int[] nasobky = new int[] {0, 10, 20, 30}
/*        int[] nasobky = new int[21];

        for(int i=0; i < nasobky.length; i++){
            nasobky[i] = 10 * i;
        }
    for (int jedenNasobok: nasobky) {
        System.out.println(jedenNasobok);
    }
*/
        // Smycka- cyklus while
/*        int riadiacaPremenna = 0;
        while(riadiacaPremenna < 5) {
            System.out.println(riadiacaPremenna);
            riadiacaPremenna++;
        }
*/
/*       int riadiacaPremenna = 0;

        while(riadiacaPremenna != 0) {
            System.out.println(riadiacaPremenna);
            riadiacaPremenna++;
        }

        do {
            System.out.println(riadiacaPremenna);
            //riadiacaPremenna++;
        } while(riadiacaPremenna != 0);
*/
/*
        // break = ukoncenie smycky; continue = ukoncenie iterace a pokracovanie dalej
            int riadiacaPremenna = 0;

            while(true) {
                System.out.println(riadiacaPremenna);
                riadiacaPremenna++;
                if (riadiacaPremenna > 5) {
                    break;
                    //continue;
                }
            }
*/
 /*      // Hra kocky  vylepsena verzia neparna=vyhravas, parna=prehravas

        int hodeneCislo;
        boolean  riadiacaPremenna = true;
        String ukoncenie = "";
        Random nahodnyGenerator = new Random();
        Scanner mojScanner = new Scanner(System.in);

        do {
            System.out.println("Pre hod kockou stlac enter");
            mojScanner.nextLine();


        hodeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println(hodeneCislo);
        if (hodeneCislo % 2 == 1) {
            System.out.println("Neparna vyhravas");
        }
        else {
            System.out.println("Parna prehravas");
        }

        System.out.println("Pre ukocenie zadaj pismeno q, pre pokracovanie stlac ENTER");
        ukoncenie = mojScanner.nextLine();
        if(ukoncenie.equals("q")) {
            riadiacaPremenna = false;
            }

        }while(riadiacaPremenna);
*/
        //BlackJack
        int skoreHraca = 0;
        int skoreKrupiera = 0;
        int potiahnutaKarta = 0;
        String uzivatelskyVstup;  //Zatial je to prazdna hodnota
        Random nahodnyGenerator = new Random();
        Scanner mojScanner = new Scanner(System.in);

        do {
            potiahnutaKarta = nahodnyGenerator.nextInt(1, 14);
            System.out.println("Potiahnuta karta je:" + potiahnutaKarta);
            skoreHraca = skoreHraca + potiahnutaKarta;
            System.out.println("Skore hraca je:" + skoreHraca);

            if (skoreHraca > 21) {
                System.out.println("Prehral si");
                break;
            }
            System.out.println("Chceš ďalšiu kartu? (d = áno, q = nie)");
            uzivatelskyVstup = mojScanner.nextLine();

            if (uzivatelskyVstup.equals("d")) {
                continue;
            } else if (uzivatelskyVstup.equals("q")) {
                while (skoreKrupiera < skoreHraca) {
                    potiahnutaKarta = nahodnyGenerator.nextInt(1, 14);
                    skoreKrupiera = skoreKrupiera + potiahnutaKarta;
                }
                break;

            }
        }
            while (true) ;

            System.out.println("Skore hraca: " + skoreHraca);
            System.out.println("Skore krupiera: " + skoreKrupiera);
            if ((skoreHraca > skoreKrupiera) && skoreHraca <= 21 ||(skoreKrupiera > 21)) {
                System.out.println(("Vyhra si:"));
            }else if (skoreKrupiera == skoreHraca)
            System.out.println(("Je remiza:"));
            else{
                System.out.println(("Uzivatel prehral:"));

            }

    }
}