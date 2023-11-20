class Main 
{
    public static void main(String [] args) 
    {
        String text = "lintu syntyi";
        text = "eipä synnykään";

        class Bird
        {
            public Bird() 
            {
                System.out.println(text);
            }
        }

        Bird a = new Bird();
    }
}


