class Ohjelmoija extends Ihminen
{
    //tehtävä 5 ja 7

    //kun nimi ja palkka annetaan
    public Ohjelmoija(String n, int p)
    {
        super(n);
        setPalkka(p);
    }

    //kun vain nimi annetaan
    public Ohjelmoija(String n)
    {
        super(n);
    }

    //ilman parametrejä
    public Ohjelmoija()
    {
        super();
    }

    //tehtävä 6
    private int palkka;

    public void setPalkka(int p)
    {
        if(p >= 1000 && p <= 10000)
        {
            palkka = p;
        }
        else
        {
            throw new IllegalArgumentException("laita ny jotai järkevii lukui");
        }
    }

    public int getPalkka()
    {
        return palkka;
    }

    //tehtävä 2
    public void osallistuCyberGothDanceJuhlaan()
    {
        // ai mihin? -> https://www.youtube.com/watch?v=gPbVRpRgHso
        System.out.println(getNimi() + " laittaa tanssilattian solmuun.");
        //tehtävä 10
        lisaanny();
    }

    public void ohjelmoi()
    {
        System.out.println("Ohjelmoija tekee viallisen ohjelman ja etsii kirjoitusvirhettä 2 tuntia.");
    }

    //tehtävä 8
    public void tulostaTiedot()
    {
        super.tulostaTiedot();
        System.out.print(palkka + " ");
    }

    //tehtävä 9
    public void lisaanny()
    {
        if(palkka > 5000)
        {
            System.out.println(getNimi() + " lisääntyy.");
        }
        else
        {
            System.out.println(getNimi() + " yrittää lisääntyä.");
        }
    }
}