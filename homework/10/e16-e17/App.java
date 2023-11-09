class App {
    public static void main(String [] args) 
    {
        //metodille voi antaa mitä tahansa, joka toteuttaa
        //rajapinnan MyytavaAsia.
        //toisin sanottuna sille voi passittaa tällä hetkellä
        //energiajuomia ja koiria.

        Koira a = new Koira();
        Energiajuoma es = new Energiajuoma();
        String c = "AAAAAAAAAAAAA";

        metodi(a);
        metodi(es);
        metodi(c);
        //merkkijono ei sovi siis metodille, ohjelma ei edes käänny.
    }
    public static void metodi(MyytavaAsia a) {

    }
}