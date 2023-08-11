package car_select_program.run;

import car_select_program.model.service.CarService;

public class CarRun {
	public static void main(String[] args) {
		CarService mn = new CarService();
		mn.display();
	}

}

