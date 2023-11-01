
class Rectangle {
    // attribuutteja
    private float width;
    private float height;

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

    //tehtävä 7-8
    public float getWidth()
    {
        return width;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float newH)
    {
        if(newH > 0)
        {
            height = newH;
        }
        else
        {
            throw new IllegalArgumentException("Korkeus on oltava enemmän kuin 0!");
        }
    }

    public void setWidth(float newW)
    {
        if(newW > 0)
        {
            width = newW;
        }
        else
        {
            throw new IllegalArgumentException("Leveys on oltava enemmän kuin 0!");
        }
    }


}