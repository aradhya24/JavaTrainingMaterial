package LSP.shapes;

public class Rectangle implements IShape {
	
	protected Integer length;
	protected Integer breadth;
	
	
	public void setLength(Integer length) {
		this.length = length;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}



	@Override
	public double getArea() {
		return length*breadth;
	}

}
