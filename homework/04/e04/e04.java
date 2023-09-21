
class e04 {
    public static void main(String [] args) {
       // luodaan taulukko jonka koko on 3. Sisältää 3 nollaa
       int [] taulukko = new int[3];  

       // korvataan nollat arvoilla 101, 200 ja 999     
       taulukko[0] = 12;
       taulukko[1] = 99;
       taulukko[2] = 32;
       
       for(int i = 0; i < taulukko.length; i++)
       {
        System.out.println(taulukko[i]);
       }

    }
}