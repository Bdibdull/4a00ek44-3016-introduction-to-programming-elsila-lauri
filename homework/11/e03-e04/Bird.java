class Bird 
{
    public void lennä() 
    {
        System.out.println("lintu lentää");
    }
}
class Main 
{
    public static void main(String [] args) 
    {
        //e03
        Bird talitintti = new Bird();
        lennä(talitintti);

        class Struthioniformes extends Bird 
        {
            @Override public void lennä()
            {
                System.out.println("Strutsi yrittää lentää");
            }
        }

        Struthioniformes strutsi = new Struthioniformes();
        lennä(strutsi);

        //e04
        lennä(new Bird()
            {
                @Override public void lennä()
                {
                    System.out.println("Anonyymi lentää");
                }
            }
        );
    }

    public static void lennä(Bird b) 
    {
        b.lennä();
    }
}