class Ihminen 
{
    private String nimi;
    
    //tehtävä 4
    public Ihminen(String n)
    {
        setNimi(n);
    }

    public Ihminen()
    {
        nimi = "Ihminen";
    }

    //tehtävä 3
    public void setNimi(String n)
    {
        nimi = n;
    }

    public String getNimi()
    {
        return nimi;
    }


    //tehtävä 1
    public void nuku()
    {
        System.out.println(nimi + " nukkuu.");
    }

    public void syo()
    {
        System.out.println(nimi + " syö.");
    }

    public void juo()
    {
        System.out.println(nimi + " juo.");
    }

    public void lisaanny()
    {
        System.out.println(nimi + " lisääntyy.");
    }

    //tehtävä 8
    public void tulostaTiedot()
    {
        System.out.println(nimi);
    }
}

