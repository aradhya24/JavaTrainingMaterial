package LSP.shapes;

public class Circle implements IShape {
    
	protected Integer radius;
	
	
	public Circle(Integer radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return (3.14*radius*radius);
	}

}
