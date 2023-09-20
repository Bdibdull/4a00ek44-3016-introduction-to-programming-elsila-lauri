import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        double rando = 0;
        int rand = 0;
        for(int i = 0; i < 5; i++)
        {
            rando = Math.random()*5;
            //kerromme viidellä emmekä neljällä, sillä todellisuudessa
            //haluamme viisi mahdollista lopputulosta 0,1,2,3,4
            rand = (int)rando;
            System.out.println(rand);
        }

    }
}