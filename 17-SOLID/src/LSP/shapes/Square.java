package LSP.shapes;

public class Square implements IShape{
    protected Integer side;

	public void setSide(Integer side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
    
    
}
