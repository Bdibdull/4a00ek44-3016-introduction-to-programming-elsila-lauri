
class e06 {
    public static void main(String [] args) {
       int [] taulukko = new int[3];  

       // korvataan nollat arvoilla 101, 200 ja 999     
       taulukko[0] = 12;
       taulukko[1] = 99;
       taulukko[2] = 32;
       
       for(int i = 2; i >= 0; i--)
       {
        System.out.println(taulukko[i]);
       }

    }
}