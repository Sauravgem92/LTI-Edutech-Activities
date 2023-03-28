

public class Triangle  extends Shape
{
    private Double base;
    private Double height;
    
    public Triangle()
    {
        
    }
    public Triangle( Double base,Double height)
    {
        this.base=base;
        this.height=height;
    }
    
	public void setHeight(Double height) 
    {
		this.height=height;
	}
    public Double getHeight()
    {
        return this.height;
    }
    
        public void setBase(Double base) 
    {
		this.base=base;
	}
    public Double getBase()
    {
        return this.base;
    }
    
    
	public void computeArea()
    {
	        this.setArea((0.5) * (base * height));
	}
}
