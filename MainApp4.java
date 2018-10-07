
public class MainApp4 {

	public static void main(String[] args) {

		Flat fl1 = new Flat(21, 44, 88.9f, 1, 1, "Lenina", "tipe1", "01.01.2011");
		Flat fl2 = new Flat(22, 77, 17.7f, 2, 3, "Kutuzovskij", "tipe1", "01.01.2011");
		Flat fl3 = new Flat(23, 112, 88.9f, 3, 3, "Kutuzovskij", "tipe1", "01.01.2011");
		Flat fl4 = new Flat(24, 76, 123.0f, 4, 3, "Gagarina", "tipe1", "01.01.2011");
		Flat fl5 = new Flat(25, 87, 66.9f, 5, 3, "Skoriny", "tipe1", "01.01.2010");
		Flat fl6 = new Flat(26, 21, 85.9f, 1, 4, "Kuprevicha", "tipe1", "01.01.2001");
		Flat fl7 = new Flat(27, 156, 35.0f, 4, 3, "Angarskaya", "tipe1", "01.01.2018");
		Flat fl8 = new Flat(28, 6, 27.9f, 1, 2, "Svobody", "tipe1", "01.01.2016");
		Flat fl9 = new Flat(29, 1, 288.9f, 1, 2, "Sof'i Kovalevskoj", "tipe1", "01.01.1991");
		Flat fl10 = new Flat(30, 99, 138.9f, 15, 3, "Popova", "tipe1", "01.01.2013");

		Kartoteka kartoteka = new Kartoteka(10);

		kartoteka.flats[0] = fl1;
		kartoteka.flats[1] = fl2;
		kartoteka.flats[2] = fl3;
		kartoteka.flats[3] = fl4;
		kartoteka.flats[4] = fl5;
		kartoteka.flats[5] = fl6;
		kartoteka.flats[6] = fl7;
		kartoteka.flats[7] = fl8;
		kartoteka.flats[8] = fl9;
		kartoteka.flats[9] = fl10;

		// System.out.println(flatsList.flats[4].flatSquare);
		Flat[] resultRoomNumber = kartoteka.findByRoomNumbers(3);
		System.out.println("3-ехкомнатные квартиры");
		kartoteka.printFlatInfo(resultRoomNumber);

		Flat[] resultRoomsAndFloor = kartoteka.findByRoomsAndFloor(2, 4, 3);
		System.out.println("3-ехкомнатные квартиры на 2-4 этажах:");
		kartoteka.printFlatInfo(resultRoomsAndFloor);

		/*
		 * Flat[] resultFloor = kartoteka.findByFloor(2, 4);
		 * System.out.println("3квартиры на 2-4 этажах");
		 * kartoteka.printFlatInfo(resultFloor);
		 */

		Flat[] resultSquare = kartoteka.findBySquare(80.0f);
		System.out.println("квартиры площадью более 80кв:");
		kartoteka.printFlatInfo(resultSquare);

	}

}
