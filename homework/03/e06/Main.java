import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println(1 + 2);

        System.out.println("merkkijono1" + "merkkijono2");

        System.out.println("merkkijono1" + 2);

        System.out.println("merkkijono1" + 3.3);

        System.out.println(3.3 + "merkkijono" + 3.3);

        System.out.println(2 + "merkkijono2");

        System.out.println("merkkijono1" + 'a');

        System.out.println('a' + 'b');
        

        /*
        ohjelman tuloste on seuraava: 

        3
        merkkijono1merkkijono2
        merkkijono12
        merkkijono13.3
        3.3merkkijono3.3
        2merkkijono2
        merkkijono1a
        195

        suurin osa näistä tuloksista on täysin loogisia, eli merkkijonon yhdistelyä. annetaan 
        jokin merkkijono ja vaikka numero tai yksittäinen kirjain hipsujen sisällä,
        ja sillä ainakin yksi "laskutoimituksen" tekijä on merkkijono, 
        java määrittelee koko tulostetun pötkön merkkijonoksi.

        tietenkin 1+2 on eri. "1" + "2" tuottaa merkkijonon, mutta 1 + 2 tilanteessa ovat molemmat
        annetut komponentit kokonaislukuja, joten java laskee ne yhteen. tulos on yllättäen kolme.

        selvästi oikea taika tässä on, kun lisää yksittäisiä kirjaimia yhteen, eli hipsun sisässä
        yhdet merkit.
        miksi ihmeessä 'a' + 'b' on 195, en tiedä ollenkaan. char ei tainnut olla edes luokkatyyppi,
        joten ei ole mitään tietoa, miksi se käyttäytyy noin.
        */
    }
}