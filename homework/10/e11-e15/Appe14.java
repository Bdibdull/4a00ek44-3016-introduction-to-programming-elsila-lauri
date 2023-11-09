import javax.swing.JFrame;

class Appe14 {
    public static void main(String [] args) 
    {
        Koira a = new Koira();
        Ihminen b = new Ihminen();
        JFrame c = new JFrame();

        //tälle menee vain koirat
        method1(a);

        //tälle menee vain ihmiset
        method2(b);

        //tälle menee koirat tai ihmiset
        method3(b);

        //tälle menee aika lailla mikä tahansa
        method4(c);
    }

    public static void method1(Koira a) {

    }

    public static void method2(Ihminen a) {

    }

    public static void method3(Nisakas a) {

    }

    public static void method4(Object a) {

    }
}