import java.io.Console;


class e13 {
    static String [] hedelm = {"@", "!", "#", "&"};
    //oletusarvo huutomerkkejä
    static String [] ruutu = {"!", "!", "!", "!", "!"};
    static Console c = System.console();

    public static void main(String [] args) {
        int raha = 25; //pelaajan käyttöraha
        int summa = 0; //pelaajan yhteensä käyttämät rahat
        int putki = 0; //montako merkkiä putkeen
        int korkein = 0; //korkein putki
        System.out.println("Tervetuloa HedelmäPeliin!");

        //niin kauan kunnes käyttäjä lopettaa
        while(true)
        {
            System.out.println(
                "\nSinulla on " + raha + " euroa.\n" +
                "Uusi kierros (1e)? y/n"
                );
            String vastaus = c.readLine();

            if(vastaus.equals("y") && raha > 0)
            {
                summa += 1;
                raha -= 1;

                //oletusarvo yksi (eli yksi peräkkäinen merkki)
                putki = 1;
                korkein = 1;

                //satunnaiset hedelmät
                shedelmiä();

                //ruudun tulostus
                printR();

                //tarkistetaan ruudut, aloitetaan yhdestä
                for(int i = 1; i < ruutu.length; i++)
                {
                    if(!ruutu[i].equals(ruutu[i-1]))
                    {
                        //jos jäsen i ei ole sama kuin aiempi jäsen,
                        //kaikki jäsenet eivät ole samoja;
                        //mutta jos koko matkan jäsenet ovat samoja,
                        //kaikki taulukon jäsenet ovat samoja
                        if(putki > korkein)
                        {
                            korkein = putki;
                        }
                        putki = 1;
                    }
                    else
                    {
                        putki += 1;
                        if(putki > korkein)
                        {
                            korkein = putki;
                        }
                    }
                }

                //jos voittokonditiot totta,
                //saa tietenkin voittoja
                if(korkein == ruutu.length) //kaikki samaa, jackpot
                {
                    System.out.println("Voitit jackpotin!");
                    raha += 10;
                }
                else if(korkein > 2) // 3-4 putki
                {
                    System.out.println(
                        "Sait " + korkein + " peräkkäistä " +
                        "hedelmää! Voitit " + korkein +
                        " euroa.");
                    raha += korkein;
                }
            }
            else if(vastaus.equals("n"))
            {
                System.out.println("Peli ohi.");
                break;
            }
            else if(raha < 1)
            {
                System.out.println(
                    "Rahasi ovat loppu. " +
                    "Käytit " + summa + " euroa. " +
                    "Peli ohi!"
                    );
                break;
            }
            else
            {
                System.out.println("Virheellinen syöte!");
            }
        }
    }

    //täyttää listan satunnaisilla hedelmillä
    public static void shedelmiä()
    {
        for(int i = 0; i < ruutu.length; i++)
        {
            ruutu[i] = hedelm[random(3)];
        }
    }

    //satunnainen arvo välillä 0-maks
    public static int random(int maks)
    {
        return (int)(Math.random()*(maks+1));
    }

    //tulostaa peliruudun
    public static void printR()
    {
        for(int i = 0; i < ruutu.length; i++)
        {
            System.out.print("[" + ruutu[i] + "]");
        }
        System.out.println();
    }
}