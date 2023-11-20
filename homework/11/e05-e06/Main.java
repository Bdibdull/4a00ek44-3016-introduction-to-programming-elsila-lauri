
class Main {
    public static void main(String [] args) {
        class Energiajuoma implements MyytavaTuote
        {
            public void myy()
            {
                System.out.println("Energiajuoma myyty.");
            }
        }

        class Koira implements MyytavaTuote
        {
            public void myy()
            {
                System.out.println("Koira myyty.");
            }
        }

        Energiajuoma ed = new Energiajuoma();
        myy(ed);

        Koira musti = new Koira();
        myy(musti);

        myy(new MyytavaTuote()
            {
                @Override
                public void myy()
                {
                    System.out.println("Anonyymi myyty.");
                }
            }
        );

        //e06
        myy(() -> System.out.println("Lambda myyty."));

        myy(() -> metodi());

        myy(Main::metodi);
    }

    public static void metodi()
    {
            System.out.println("Method reference myyty.");
    }

    public static void myy(MyytavaTuote m) {
        m.myy();
    }
}

interface MyytavaTuote
{
    public void myy();
}