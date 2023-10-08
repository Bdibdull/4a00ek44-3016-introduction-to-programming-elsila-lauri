import java.io.Console;


class e13 {
    //koodille universaaleja muuttujia,
    //eli itse eri hedelmät,
    //peliruudun sisältötaulukko
    //ja readLineen c-muuttuja

    //värit (ANSI)
    static String kel = "\u001B[33m";
    static String pun = "\u001B[31m";
    static String vih = "\u001B[32m";
    static String sin = "\u001B[34m";

    //resettiväri
    static String res = "\u001B[0m";

    static String [] hedelm = {
        kel + "@" + res, 
        pun + "!" + res, 
        vih + "#" + res, 
        sin + "&" + res
        };
    //oletusarvo huutomerkkejä
    static String [] ruutu = {"!", "!", "!", "!", "!"};
    static Console c = System.console();

    public static void main(String [] args) {
        int raha = 25; //pelaajan käyttöraha
        int summa = 0; //pelaajan yhteensä käyttämät rahat
        int putki = 0; //montako merkkiä putkeen
        int korkein = 0; //korkein putki
        int delay = 10; //millisekunnit uuden printin välillä sekoituksessa
        int kum = 0; //kumitus, extra linjoja joita poistaa kumita() funktiota varten
        System.out.println(
            vih + "Tervetuloa HedelmäPeliin!" +
            pun + "\nPelaa vastuullisesti." +
            "\nHedelmäPeli oy tai sen sisaryhtiöt" +
            "\neivät vastaa menetetystä pääomasta.\n\n" +
            res
            );

        //niin kauan kunnes käyttäjä lopettaa
        while(true)
        {
            System.out.println(
                "\nSinulla on " + raha + " euroa.\n" +
                "Uusi kierros (1e)? y/n"
                );
            String vastaus = c.readLine();

            //helvetin pitkä if-lause joka pyörittää itse peliä,
            //jos pelaaja valitsee jatkavansa siis
            if(vastaus.equals("y") && raha > 0)
            {
                //muuttujien asettelu
                summa += 1; //euro käytetty, laitetaan muistiin
                raha -= 1; //euro per peli
                //oletusarvo yksi (eli yksi peräkkäinen merkki)
                putki = 1;
                korkein = 1;
                //delay minimiin ennen looppia
                delay = 10;

                //tyhjentää rivit ja nollaa kum-muuttujan
                kumita(6+kum);
                kum = 0;
                //satunnaiset hedelmät
                shedelmiä();
                //ruudun tulostus
                printR();
                
                while(delay < 100)
                {
                    //tyhjennä rivi, random hedelmät,
                    //printtaa ne, odota hetki,
                    //hidasta tahtia,
                    //uudestaan
                    kumita(1);
                    shedelmiä();
                    printR();
                    odota(delay);

                    delay += 5;
                }

                //0,7 sekunnin väli, ettei hyppää naamalle
                odota(700);

                //spacing väliin
                System.out.println();
                
                //tarkistetaan ruudut, aloitetaan yhdestä
                for(int i = 1; i < ruutu.length; i++)
                {
                    if(!ruutu[i].equals(ruutu[i-1]))
                    {
                        //jos jäsen i ei ole sama kuin yksi aiempi jäsen,
                        //kaikki jäsenet eivät ole samoja;
                        //mutta jos koko matkan peräkkäiset jäsenet ovat samoja,
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
                    System.out.println(vih + "Voitit jackpotin!" + res);
                    raha += 25; //tienataan 25e
                    kum += 1; //extralinja, joka pitää poistaa
                }
                else if(korkein > 2) // 3-4 putki
                {
                    System.out.println(
                        "Sait " + korkein + " peräkkäistä " +
                        "hedelmää! Voitit " + korkein +
                        " euroa.");
                    raha += korkein;
                    kum += 1;
                }
            } //NYT VASTA käsitellään virheinputit tai kieltymys (n)
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
                System.out.println(
                    pun +
                    "Virheellinen syöte!" +
                    res
                    );
                kum += 5;
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
    }

    //odottaa annetun määrän ms
    public static void odota(int ms)
    {
        try{
            Thread.sleep(ms);
            } catch(Exception e){
                //ei mitään tarvetta tälle
            }
    }

    public static void kumita(int rivei)
    {
        //mennään rivin alkuun ja kumitetaan koko rivi
        System.out.print("\r");
        System.out.print("\033[2K");

        //jos rivei enemmän kuin yksi, menemme for looppiin
        for(int i = 1; i < rivei; i++)
        {
            //liikkuu yhden ylöspäin
            System.out.print(String.format("\033[%dA", 1));
            System.out.print("\r");
            System.out.print("\033[2K");
        }
    }
}