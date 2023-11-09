class Testi
{
    public static void main(String [] args)
    {
        //laittaa tänne mitä tehtävää testaa si
        e01();
    }

    //tehtävä 1
    public static void e01()
    {
        Ihminen Jussi = new Ihminen();
        Ihminen SuperJussi = new Ihminen();

        SuperJussi.syo();
        Jussi.lisaanny();
    }

    //tehtävä 2
    public static void e02()
    {
        Ohjelmoija Jussi = new Ohjelmoija();

        Jussi.nuku();
        Jussi.syo();
        Jussi.lisaanny();
        Jussi.ohjelmoi();
        Jussi.osallistuCyberGothDanceJuhlaan();
    }

    //tehtävä 3
    public static void e03()
    {
        Ohjelmoija SuperJussi = new Ohjelmoija();
        Ihminen HuonoJussi = new Ihminen();

        HuonoJussi.setNimi("HuonoJussi");
        SuperJussi.setNimi("SuperJussi");

        HuonoJussi.nuku();
        SuperJussi.nuku();
    }

    //tehtävä 4
    public static void e04()
    {
        Ihminen Jussi = new Ihminen("Jussi");
        Jussi.syo();
    }

    //tehtävä 5
    public static void e05()
    {
        Ohjelmoija Jussi = new Ohjelmoija("Jussi");
        Ihminen Jussi2 = new Ihminen("Jussi2");

        Jussi.syo();
        Jussi.ohjelmoi();
        Jussi2.syo();
        Jussi2.lisaanny();
    }

    //tehtävä 6
    public static void e06()
    {
        Ohjelmoija Jussi = new Ohjelmoija("Jussi");
        Jussi.setPalkka(7899);
        Jussi.setPalkka(10001);
    }

    //tehtävä 7
    public static void e07()
    {
        Ohjelmoija Jussi = new Ohjelmoija("Jussi", 2544);
        System.out.println(Jussi.getPalkka());
    }

    //tehtävä 8
    public static void e08()
    {
        Ohjelmoija Jussi = new Ohjelmoija("Jussi", 8989);
        Ihminen Jussi2 = new Ihminen("Jussi2");

        Jussi.tulostaTiedot();
        Jussi2.tulostaTiedot();
    }

    //tehtävä 9
    public static void e09()
    {
        Ohjelmoija Jussi = new Ohjelmoija("Jussi", 9222);
        Ohjelmoija KoyhaJussi = new Ohjelmoija("KoyhaJussi", 1000);

        KoyhaJussi.lisaanny();
        Jussi.lisaanny();
    }

    //tehtävä 10
    public static void e10()
    {
        Ohjelmoija Jussi = new Ohjelmoija("Jussi", 9222);
        Ohjelmoija KoyhaJussi = new Ohjelmoija("KoyhaJussi", 1000);

        Jussi.osallistuCyberGothDanceJuhlaan();
        KoyhaJussi.osallistuCyberGothDanceJuhlaan();
    }
}