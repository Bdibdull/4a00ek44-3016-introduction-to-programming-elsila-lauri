class Testi
{
    public static void main(String [] args)
    {
        e13();
    }

    //tehtävä 11
    public static void e11()
    {
        //Nisakas Jussi = new Nisakas();

        //koodi ei käänny, sillä Nisakas on abstrakti. toisin sanottuna
        //se on luokka, josta on tarkoitus periä ominaisuuksia uusiin luokkiin;
        //ei luokka, josta luoda olioita.

        Koira Puliveivari = new Koira();
        Puliveivari.synnyta();
    }

    //tehtävä 12
    public static void e12()
    {
        Koira Puliveivari = new Koira();
        Ihminen Jussi = new Ihminen();

        Jussi.luoTaidetta();
        Puliveivari.nuuhkiPyllyä();
    }

    //tehtävä 13
    public static void e13()
    {
        Koira Puliveivari = new Koira();
        Ihminen Jussi = new Ihminen();

        Puliveivari.ääntelehdi();
        Jussi.ääntelehdi();
    }
}