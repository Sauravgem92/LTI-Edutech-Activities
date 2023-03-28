

public class Rectangle   extends Shape
{
    private Double length;
    private Double breadth;
    
    public Rectangle()
    {
    }
    public Rectangle(Double length,Double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
	public void setBreadth(Double breadth) 
    {
		this.breadth=breadth;
	}
    public Double getBreadth()
    {
        return this.breadth;
    }
    
    public void setLength(Double length) 
    {
    	this.length=length;
	}
    public Double getLength()
    {
        return this.length;
    }
    
	public void computeArea()
    {
	     super.setArea((length * breadth));
	}
}
