

public class Circle  extends Shape
{
    private Double radius;
    
    public Circle()
    {
    }
    public Circle(Double radius)
    {
        this.radius=radius;
    }
     public void setRadius(Double radius)
    {
        this.radius=radius;
    }
    public Double getRadius()
    {
        return this.radius;
    }
    

   public void computeArea()
    {
	    super.setArea((3.142857) * (radius * radius)); 
    }
}
