
public class Kartoteka {

	Flat[] flats = null;

	public Kartoteka(int count) {
		flats = new Flat[count];

	}

	public Flat[] findByRoomNumbers(int roomsNumber) {
		Flat[] result = new Flat[flats.length];
		for (int i = 0; i < flats.length; i++) {
			if (flats[i].roomsNumber == roomsNumber) {
				result[i] = flats[i];

			}
		}
		return result;

	}

	/*
	 * public Flat[] findByFloor(int minFloor, int maxFloor) { Flat[] result = new
	 * Flat[flats.length]; for (int i = 0; i < flats.length; i++) { if (minFloor <=
	 * flats[i].floor && flats[i].floor <= maxFloor) { result[i] = flats[i];
	 * 
	 * } } return result;
	 * 
	 * }
	 */

	public Flat[] findByRoomsAndFloor(int minFloor, int maxFloor, int roomsNumber) {
		Flat[] result = new Flat[flats.length];
		for (int i = 0; i < flats.length; i++) {
			if (flats[i].floor >= minFloor && flats[i].floor <= maxFloor && flats[i].roomsNumber == roomsNumber) {
				result[i] = flats[i];

			}
		}
		return result;

	}

	public Flat[] findBySquare(double square) {
		Flat[] result = new Flat[flats.length];
		for (int i = 0; i < flats.length; i++) {
			if (flats[i].flatSquare >= square) {
				result[i] = flats[i];
			}

		}
		return result;
	}

	public void printFlatInfo(Flat[] flat) {

		for (int i = 0; i < flat.length; i++) {
			if (flat[i] != null) {
				System.out.println(" id: " + flat[i].id + " Rooms: " + flat[i].roomsNumber + " Floor: " + flat[i].floor
						+ " Ulitca: " + flat[i].street + " Square: " + flat[i].flatSquare);
			}
		}
	}
}
