package car_select_program.model.vo;

public class Car {
	private int carNum ;
	private String Name;
	private String company;
	private String type;
	private int price;
	private double fuel_efficiency;
	private double displacement;
	private String fuel;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	

	public Car(int carNum, String name, String company, String type, int price, double fuel_efficiency,
			double displacement, String fuel) {
		super();
		this.carNum = carNum;
		Name = name;
		this.company = company;
		this.type = type;
		this.price = price;
		this.fuel_efficiency = fuel_efficiency;
		this.displacement = displacement;
		this.fuel = fuel;
	}

	


	public int getCarNum() {
		return carNum;
	}



	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public double getFuel_efficiency() {
		return fuel_efficiency;
	}



	public void setFuel_efficiency(double fuel_efficiency) {
		this.fuel_efficiency = fuel_efficiency;
	}



	public double getDisplacement() {
		return displacement;
	}



	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}



	public String getFuel() {
		return fuel;
	}



	public void setFuel(String fuel) {
		this.fuel = fuel;
	}



	@Override
	public String toString() {
		return "차량 정보 == 차량 번호 : " + carNum + ", 차량 이름 : " + Name + ", 제조회사 : " + company + ", 차량 타입 : " + type + ", 가격 : "
				+ price + "만원, 복합 연비(평균) : " + fuel_efficiency + "km/l, 배기량(중간급) : " + displacement + "cc, 사용 연료 : " + fuel;
	}
	
	
	
}
