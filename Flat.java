
public class Flat {

	int id;
	int flatNunber;
	double flatSquare;
	int floor;
	int roomsNumber;
	String street;
	String tipeOfBuilding;
	String dateOfLifeTime;

	// конструктор-особый метод
	public Flat() {
	}

	public Flat(int id, int flatNumber, double flatSquare, int floor, int roomsNumber, String street,
			String tipeOfBuilding, String dateOfLifeTime) {
		this.id = id;
		this.flatNunber = flatNumber;
		this.flatSquare = flatSquare;
		this.floor = floor;
		this.roomsNumber = roomsNumber;
		this.street = street;
		this.tipeOfBuilding = tipeOfBuilding;
		this.dateOfLifeTime = dateOfLifeTime;

	}
}