import java.lang.Math;

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

    //tehtävä 9
    public Rectangle()
    {
        height = 1;
        width = 1;
    }

    public Rectangle(float H, float W)
    {
        setHeight(H);
        setWidth(W);
    }
    
    //tehtävä 11
    public boolean Equals(Rectangle b)
    {
        boolean sameW = b.getWidth() == this.getWidth();
        boolean sameH = b.getHeight() == this.getHeight();
        if(sameW && sameH)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //tehtävä 12
    public String toString()
    {
        String inWords = "height = " + height + " , width = " + width;
        return inWords;
    }

    //tehtävä 13
    public double countDiagonal()
    {
        //pythagorakseen on varmasti jokin funktio. masentaa liikaa etsiä sellaista
        //eli vaikeamman kautta mennään
        double pW = width * width;
        double pH = height * height;
        double ttP = pW + pH;
        double pytha = Math.sqrt(ttP);
        return pytha;
    }

    //tehtävä 14
    public Rectangle cloneMe()
    {
        Rectangle clone = new Rectangle(this.height, this.width);
        return clone;
    }
}