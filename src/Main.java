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

    }

}