import java.io.Console;

class e06
{
    static Console c = System.console();

    public static void main(String [] args)
    {
        System.out.println(toista('x', itseisarvo(-3)));
        System.out.println(toista('a', itseisarvo(4)));
    }

    //palauttaa merkkijonon, jossa on yhtä monta kertaa
    //tietty merkki kuin annettu toistomäärä
    public static String toista(char merk, int toisto)
    {
        String palaute = "";
        for(int i = 0; i < toisto; i++)
        {
            palaute += merk;
        }
        return palaute;
    }

    //palauttaa annetun luvun itseisarvon
    public static int itseisarvo(int luku)
    {
        if(luku < 0)
        {
            luku *= -1;
        }
        return luku;
    }
}