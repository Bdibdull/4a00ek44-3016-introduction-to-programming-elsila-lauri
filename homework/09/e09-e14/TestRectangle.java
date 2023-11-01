
class TestRectangle {
    public static void main(String [] args) {
        //tehtävä 9
        Rectangle r = new Rectangle(50,50);
        //toimii!



        //tehtävä 10
        Rectangle r1 = new Rectangle(50,50);
        Rectangle r2 = new Rectangle(50,50);

        if(r1 == r2) {
            System.out.println("Täällä ollaan");
        }
        //valintalauseen sisään ei tietenkään mennä, sillä vertailemme tässä
        //olioiden muistipaikkojen osoitteita,
        //eikä olioiden arvoja.
        //sitä varten tehdään usein Equals-metodi



        //tehtävä 11

        if(r1.Equals(r2)) {
            System.out.println("Samankokoiset!");
        }
        //toimii!



        //tehtävä 12
        System.out.println(r1.toString());
        //toimii!


        //tehtävä 13
        System.out.println(r1.countDiagonal());
        //toimii!



        //tehtävä 14

        Rectangle r3 = new Rectangle(50,50);
        Rectangle r4 = r3.cloneMe();

        // tietokoneen muistissa nyt kaksi oliota, r3 ja r4.
        // r3 ja r4 sisältävät eri muistipaikan osoitteet.
        if(r3 != r4) {
            System.out.println("different memory addresses");
        }

        if(r3.Equals(r4)) {
            System.out.println("The same width and height");
        }
    }
}
