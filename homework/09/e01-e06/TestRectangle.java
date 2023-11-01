class TestRectangle {
    public static void main(String [] args) {
        Rectangle a = new Rectangle();

        //tehtävä 1
        System.out.println("\nTehtävä 1");
        System.out.println(a.width);
        System.out.println(a.height);

        //tulos on tietenkin 0 molemmissa, sillä arvot on vain alustettu, muttei asetettu



        //tehtävä 2
        System.out.println("\nTehtävä 2");
        System.out.println(a);

        Rectangle b = a;

        System.out.println(b);

        a.width = 1;
        a.height = 1;

        b = a;

        System.out.println(b.width);
        System.out.println(b.height);

        /*tuloste on seuraava:

        Rectangle@2f92e0f4
        Rectangle@2f92e0f4
        1
        1

        Aluksi siis, vaikka a:n arvot ovat periaatteessa 0 molemmat,
        b:n arvoja haetessa ohjelma palauttaa luokan nimen ja muistipaikan osoitteen.
        Huomioitavaa on, että osoite on sama.
        Kun taas a:n arvot määrittää ja sitten hakee b:n arvot,
        oikeat, haetut arvot löytyvät.
        Olisiko taas auringon pilkuista kiinni?
        */



        //tehtävä 3
        System.out.println("\nTehtävä 3");
        a.printMe();



        //tehtävä 4
        System.out.println("\nTehtävä 4");
        a.whoAmI();
        //taitaa olla a-olion muistipaikan osoite, eli ns a-olio itse



        //tehtävä 5
        System.out.println("\nTehtävä 5");
        Rectangle p = new Rectangle();
        System.out.println(p);
        p = null;

        kaynnistaRoskienKeruu();
        //funktio kutsutaan ja p tuhoutuu

        System.out.println("Uusi yritys");
        Rectangle p1 = new Rectangle();
        Rectangle p2 = p1;
        System.out.println(p1);
        p1 = null;
        kaynnistaRoskienKeruu();
        //funktio kutsutaan, mutta p1 ei tuhoudu, sillä finalize-broadcastin pitäisi ilmoittaa tuhosta
        //ehkä viittaus p2:desta estää sen?



        //tehtävä 6
        System.out.println("\nTehtävä 6");
        System.out.println(a.countSurfaceArea());
        System.out.println(b.countSurfaceArea());
    }

    public static void kaynnistaRoskienKeruu() {
            // Käynnistetään roskien keruu. HUOM - pois päältä hetkellisesti hehe
            //System.gc();
            // Odotellaan sekunnin verran.
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
}