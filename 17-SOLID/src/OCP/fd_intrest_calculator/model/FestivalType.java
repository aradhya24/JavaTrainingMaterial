package OCP.fd_intrest_calculator.model;

public enum FestivalType {
	NEWYEAR, DIWALI, HOLI, OTHERS;

	public static void displayAllFestivalType() {
		System.out.println("Available FestivalType  choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static FestivalType getByIndex(int index) {
		return values()[index - 1];
	}
}
