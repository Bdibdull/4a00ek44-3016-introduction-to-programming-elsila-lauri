
class Rectangle {
    // attribuutteja
    public int width;
    public int height;

    //tehtävä 3
    public void printMe()
    {
        System.out.println(width);
        System.out.println(height);
    }

    //tehtävä 4
    public void whoAmI()
    {
        System.out.println(this);
    }

    //tehtävä 5
    public void finalize() {
        System.out.println("Deleting: " + this);
    }

    //tehtävä 6
    public float countSurfaceArea()
    {
        float area = width * height;
        return area;
    }

}