import java.io.Console;

//pääluokka
class e14 {
    static String [] polku = new String[1];

    public static void main(String [] args)
    {
        Console c = System.console();

        System.out.println("Anna polun koko: ");
        int koko = Integer.parseInt(c.readLine());

        polku = new String [koko];

        //täytetään polku välilyönneillä
        for(int i = 0; i < polku.length; i++)
        {
            polku[i] = " ";
        }

        //printataan tyhjä pelilauta
        printP();

        //missä kohtaa pelaaja on laudalla, annetaan aluksi väärä arvo
        int paikka = -1;

        //vastaanotetaan vain (about) korrekti syöte
        //(kirjaimet silti rikkoo ohjelman)
        while(true)
        {
            System.out.println("Anna pelaajan paikka: ");
            paikka = Integer.parseInt(c.readLine())-1; 
            if(paikka >= 0 && paikka < koko)
            {
                //saatiin oikea arvo! lopetetaan
                break;
            }
            else
            {
                System.out.println("Ei löydy pelilaudalta!");
            }
        }

        //asetetaan pelaaja laudalle
        polku[paikka] = "P";
        //tulostetaan pelilauta feat pelaaja
        printP();

        System.out.println("\nKäännetään kortit...");

        //randomisoidaan pommit, huomoidaan pelaajan ruutu
        //käytämme randomisointiin getRandom funktiota
        for (int i = 0; i < polku.length; i++)
        {
            int rando = MyMath.getRandom(1,3);
            if(rando == 1)
            {
                if(polku[i].equals(" "))
                {
                    polku[i] = "B";
                }
                else
                {
                    polku[i] = "PB";
                }
            }
        }

        //onko pelaaja pommin kohdalla, oletusarvoisesti ei
        boolean pommi = false;

        //tarkastetaan, räjähtääkö pelaaja
        for (int i = 0; i < polku.length; i++)
        {
            if(polku[i].equals("PB"))
            {
                pommi = true;
                break;
            }
        }

        //tulostetaan lauta ennen voitto/häviö-ilmoitusta
        printP();

        //voitto/häviö
        System.out.println(
            (pommi) ?
            "Pelaaja hävisi!" //kun pommi true
            :
            "Pelaaja voitti!" //kun pommi false
        );
    }

    //tulostaa pelilaudan
    public static void printP()
    {
        for(int i = 0; i < polku.length; i++)
        {
            System.out.print("[" + polku[i] + "]");
        }
        System.out.println();
    }


}

//randomisointi matematiikka luokka :)
class MyMath
{
    public static int getRandom(int min, int max)
    {
        //vaihteluväli
        int vali = max - min;

        int rando = (int)(Math.random()*(vali+1))+min;

        return rando;
    }
}