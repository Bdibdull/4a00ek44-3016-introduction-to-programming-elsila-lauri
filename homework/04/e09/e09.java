import java.io.Console;

class e09 {
    public static void main(String [] args) {
       Console c = System.console();

       System.out.println("Anna listan pituus:");
       int pituus = Integer.parseInt(c.readLine());

       String pisin = "";
       
       String [] nimiä = new String[pituus];
       
       for(int i = 0; i < nimiä.length; i++)
       {
            System.out.println("Anna nimi: ");
            nimiä[i] = c.readLine();
            if(pisin.length() < nimiä[i].length())
            {
                pisin = nimiä[i];
            }

       }

       System.out.println("Nimistä pisin on " + pisin);
    }
}