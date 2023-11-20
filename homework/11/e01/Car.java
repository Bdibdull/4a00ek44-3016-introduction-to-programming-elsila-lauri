class Car 
{
    private String brand;
    private Motor motor;

    public Car(String nbrand)
    {
        this.brand = nbrand;
        this.motor = new Motor();
    }

    public Motor getMotor()
    {
        return this.motor;
    }

    class Motor
    {
        public void printCarBrand()
        {
            System.out.println(brand);
            //motor-luokan sisällä oleva viittaus yksityiseen muuttujaan on ok,
            //sillä motor on car-luokan sisäluokka.
        }
    }
}

class Main 
{
    public static void main(String [] args) 
    {
        //Car datsun = new Car();
        //datsun.brand = "datsun 100 a";
        //ei onnistu, sillä muuttuja brand on private. 
        //ulkoiset classit eivät voi siihen koskea.

        Car datsun = new Car("datsun 100 a");
        datsun.getMotor().printCarBrand();
    }
}