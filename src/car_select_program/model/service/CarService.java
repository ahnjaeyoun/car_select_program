package car_select_program.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import car_select_program.model.vo.Car;

public class CarService {
	private Scanner sc= new Scanner(System.in);

	private List<Car> CarList = new ArrayList<Car>();
	
	
	
	public CarService() {
		CarList.add(new Car(1, "싼타페", "현대", "SUV", 3277, 12, 2000, "Diesel"));
		CarList.add(new Car(2, "아반떼", "현대", "Sedan", 1975, 12, 1598, "Gasoline"));
		CarList.add(new Car(3, "쏘나타", "현대", "Sedan", 3187, 19, 1999, "Gasoline"));
		CarList.add(new Car(4, "k3", "기아", "Sedan", 1825, 13, 1598, "Gasoline"));
		CarList.add(new Car(5, "k5", "기아", "SUV", 2400, 13, 1999, "Gasoline"));
		CarList.add(new Car(6, "쏘렌토", "기아", "SUV", 3058, 11, 2151, "Diesel"));
		CarList.add(new Car(7, "Genesis Coupe", "제네시스", "SUV", 3278, 8, 1998, "Gasoline"));
		CarList.add(new Car(8, "g70", "제네시스", "Sedan", 4347, 9, 1998, "Gasoline"));
		CarList.add(new Car(9, "gv80", "제네시스", "SUV", 6478, 9, 2497, "Diesel"));
		CarList.add(new Car(10, "3 Series", "BMW", "Sedan", 5620, 8, 1995, "Gasoline"));
		CarList.add(new Car(11, "5 SEries", "BMW", "Sedan", 6850, 8, 2443, "Gasoline"));
		CarList.add(new Car(12, "i8", "BMW", "Sports", 19820, 13, 1499, "Hybrid"));
		CarList.add(new Car(13, "E-class", "Benz", "Sedan", 7050, 9, 1950, "Gasoline"));
		CarList.add(new Car(14, "C-class", "Benz", "Sedan", 6120, 10, 1991, "Gasoline"));
		CarList.add(new Car(15, "Maybach", "Benz", "Sedan", 37360, 6, 5980, "Gasoline"));
		CarList.add(new Car(16, "아벤타도르", "람보르기니", "Sports", 57167, 4, 6498, "Gasoline"));
		CarList.add(new Car(17, "카이엔", "포르쉐", "SUV", 11720, 7, 2995, "Diesel"));
		CarList.add(new Car(18, "파나메라", "포르쉐", "Sedan", 15030, 7, 3996, "Gasoline"));
		CarList.add(new Car(19, "에스칼레이드", "캐딜락", "SUV", 15700, 7, 6162, "Diesel"));
		
	}
	
	
public void display() {
	
	int insertNum = 0;
	do {
			
		System.out.println("************[차량 조회 및 편집 서비스]************");
		System.out.println();
		System.out.println("1. 등록된 차량 전체 조회");
		System.out.println("2. 등록 차량 추가");
		System.out.println("3. 등록된 차량 제거");
		System.out.println("4. 등록된 차량 수정");
		System.out.println("5. 등록된 차량 검색(포함 문자열)");
		System.out.println("0. 서비스 종료");
		System.out.println();
		System.out.print("번호 입력 : ");
		
		try {
			
			insertNum = sc.nextInt();
			
			switch(insertNum) {
			case 1 : selectAll(); break;
			case 2 : System.out.println(addCar());; break;
			case 3 : deleteCar(); break;	
			case 4 :
			case 5 :
			case 0 : System.out.println("~서비스 종료~"); break;

			default : System.out.println("안내된 번호만 입력해주세요.");
				
			}
			
			
			

			
		}catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
			sc.nextLine();
			insertNum = -1;
		}

	}while(insertNum != 0);
	

}

public void selectAll() {
	System.out.println("*************등록된 차량 전체*************");
	
	if(CarList.isEmpty()) {
		System.out.println("등록된 차량이 없습니다.");
		
		return;
	}
	int index = 0;
	for(Car cr : CarList) {
		System.out.println(cr);
	}
	
	System.out.println();
	
}

public String addCar() throws InputMismatchException {

	System.out.println("***********차량 등록(추가)***********");
	System.out.println();
	
	
	System.out.print("차량 번호 : ");
	int CarNum= sc.nextInt();
	
	for( Car temp : CarList) {
		if(CarNum == temp.getCarNum()) {
			return "등록되었는 차량 번호와 같은 번호를 입력하였습니다. 번호 조회 후 등록해주세요. ";
			
		}
	}
	
	
	System.out.print("차량 이름 : ");
	String Name = sc.next();
	
	System.out.print("제조 회사 : ");
	String company = sc.next();
	
	System.out.print("차량 타입 : ");
	String type = sc.next();
	
	System.out.print("가격 : ");
	int price = sc.nextInt();
	
	System.out.print("복합 연비 : ");
	double fuel_efficiency = sc.nextDouble();
	
	System.out.print("배기량(중간급) : ");
	double displacement = sc.nextDouble();
	
	System.out.print("사용 연료 : ");
	String fuel = sc.next();
	
	
	
	if(CarList.add(new Car(CarNum, Name, company, type, price, fuel_efficiency, displacement, fuel))) {
		return "등록 성공";
	}else {
		return "등록 실패";
	}
	
}

public void deleteCar() {
	System.out.println("*************등록된 차량 제거*************");
	
	System.out.print("등록된 차량의 번호를 입력해주세요. : ");
	int CarNum = sc.nextInt();
	
	if(CarList.isEmpty()) {
		System.out.println("등록된 차량이 없습니다.");
	}
	
	
	

	}


}









