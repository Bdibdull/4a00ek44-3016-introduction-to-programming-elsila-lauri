import java.io.Console;

class e08 {
    public static void main(String [] args) {
       Console c = System.console();

       int [] nroita = new int[10];
       int tulos = 0;

       for(int i = 0; i < nroita.length; i++)
       {
            System.out.println("Anna luku: ");
            nroita[i] = Integer.parseInt(c.readLine());
            tulos += nroita[i];
       }
       
       System.out.println("Lukujen summa on " + tulos);

    }
}