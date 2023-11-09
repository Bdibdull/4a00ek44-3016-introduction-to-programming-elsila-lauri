class Appe15 {
    public static void main(String [] args) {
        Koira a = new Koira();
        Ihminen b = new Ihminen();

        metodi(a);
        metodi(b);
    }

    public static void metodi(Nisakas a) {
        a.nuuhkiPyllyä();
        a.luoTaidetta();
        a.ääntelehdi();
        //ainoastaan ääntelehdi-onnistuu, sillä
        //se on kaikilla nisakkailla oleva
        //metodi.
        //ohjelma ei toisin sanottuna käänny
    }
}