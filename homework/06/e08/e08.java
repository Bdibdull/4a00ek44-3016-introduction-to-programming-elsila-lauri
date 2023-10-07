import java.io.Console;


class e08 {
    public static void main(String [] args) {
         // laskee luvun itseisarvon (jos neg, muuta positiiviseksi)
         // ÄLÄ käytä javan valmista Math -luokkaa toteutuksessa
        int itseisarvo = Matikka.itseisarvo(-7); 
        System.out.println(itseisarvo); // 7

         // Tsekkaa kumpi annetuista arvoista on suurempi
         // ÄLÄ käytä javan valmista Math -luokkaa toteutuksessa
        int max = Matikka.max(10, 20);
        System.out.println(max); // 20;

         // arpoo luvun 0 - MAX, käytä Math.random() metodia toteutukseen
        int random = Matikka.random(max);
        System.out.println(random); // satunnainen luku 0 - 20
    }
}

class Matikka
{
    //antaa itseisarvon annetusta luvusta
    public static int itseisarvo(int luku)
    {
        if(luku < 0)
        {
            luku *= -1;
        }
        return luku;
    }

    //antaa suuremman kahdesta arvosta
    public static int max(int luku1, int luku2)
    {
        if(luku1 > luku2)
        {
            return luku1;
        }
        else
        {
            return luku2;
        }
    }

    public static int random(int maks)
    {
        return (int)(Math.random()*(maks+1));
    }
}