
class e07 {
    public static void main(String [] args) {
  
       String [] nimiä = new String[5];

       nimiä[0] = "Toni";
       nimiä[1] = "Joke";
       nimiä[2] = "Jake";
       nimiä[3] = "Tatu";
       nimiä[4] = "Miro";
       
       for(int i = 0; i < nimiä.length; i += 2)
       {
        System.out.println(nimiä[i]);
       }

    }
}