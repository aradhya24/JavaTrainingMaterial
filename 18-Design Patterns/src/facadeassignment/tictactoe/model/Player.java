package facadeassignment.tictactoe.model;

public class Player {
	
	private String name;
    private Character symbol;
	
    public Player(String name, Character symbol) {
		super();
		this.name = name;
		this.symbol = symbol;
	}
    
    
	public String getName() {
		return name;
	}
	public Character getSymbol() {
		return symbol;
	}
    
    
}
