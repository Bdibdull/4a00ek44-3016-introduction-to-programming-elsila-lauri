import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        String testi = "    Jalopenoo    ";

        //palauttaa merkin indeksissä n
        System.out.println(testi.charAt(4));

        //palauttaa merkkijonon pituuden
        System.out.println(testi.length());

        //palauttaa merkkijonon "trimmattuna" eli poistaa alusta ja lopusta välimerkit (voi varmaan poistaa muitakin merkkejä)
        System.out.println(testi.trim());
    }
}