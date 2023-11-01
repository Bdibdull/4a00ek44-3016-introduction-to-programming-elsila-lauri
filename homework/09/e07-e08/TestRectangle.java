
class TestRectangle {
    public static void main(String [] args) {
        //tehtävä 7-8
        Rectangle r1 = new Rectangle();
        r1.setWidth(30);
        System.out.println(r1.getWidth()); // 30

        Rectangle r2 = new Rectangle();
        //r2.setWidth(-30);
        //System.out.println(r2.getWidth()); // 0
        //printtaisi IllegalArgumentExceptionin: Leveys on oltava enemmän kuin 0!

        try {
            r1.setWidth(-9);
        } catch(IllegalArgumentException e) {
            System.out.println("virhe!" + e.getMessage());
        }
        //printtaa saman, kuin aiemmin, mutta lisää sitä ennen "virhe!" - funktio hakee throwin viestin
    }
}