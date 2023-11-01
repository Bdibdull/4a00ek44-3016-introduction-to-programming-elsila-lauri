import java.io.Console;

class RectArray {
    public static void main(String [] args) {
        Console c = System.console();

        Rectangle r = new Rectangle();

        Rectangle[] Kulmioita = new Rectangle[10];
        float[][] arvoja = new float[10][2];
        int j = 0;

        for(int i = 0; i < arvoja.length; i++)
        {
            System.out.println("Anna kulmion " + (i+1) + " leveys:");
            try
            {
                arvoja[i][j] = Float.parseFloat(c.readLine());
            } 
            catch(Exception e)
            {
                System.out.println("Virheellinen syöte!");
                i--;
                continue;
            }
            j++;

            System.out.println("Anna kulmion " + (i+1) + " korkeus:");
            try
            {
                arvoja[i][j] = Float.parseFloat(c.readLine());
            } 
            catch(Exception e)
            {
                System.out.println("Virheellinen syöte!");
                i--;
                j = 0;
                continue;
            }
            j = 0;

            Kulmioita[i] = new Rectangle(arvoja[i][0], arvoja[i][1]);
        }
        //koodi on semi surkea
        //ei kino
        //se toimii
        //about ainaki

        float kAlue = 0;
        for(int i = 0; i < Kulmioita.length; i++)
        {
            kAlue += Kulmioita[i].countSurfaceArea();
        }

        System.out.println("Kaikkien annettujen suorakulmioiden alueiden summa on " + kAlue);
    }
}