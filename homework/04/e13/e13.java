
class e13 {
    public static void main(String [] args) {
        int [] kymme = new int[10];

        int luku = Integer.parseInt(args[0]);

        for(int i = 0; i < 10; i++)
        {
            kymme[i] = (int)(Math.random()*100)+1;
            //plus yks koska normi väli on 0-99 (jossa on myös sata lukua)
        }

        for(int j = 0; j < kymme.length; j++)
        {
            if(luku == kymme[j])
            {
                System.out.println("Löytyy!");
                break; //muuten jos on kaksi kertaa sama nii tulee kaks kertaa printti
            }
        }
        
    }
}