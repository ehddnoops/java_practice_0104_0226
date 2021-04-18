
public class CarEx2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.color="Èò»ö";
		System.out.println(myCar.color);
		
		Car2 myCar2 = new Car2("°ËÁ¤");
		System.out.println(myCar2.color);

		Car2 myCar3 = new Car2("»¡°­",3000);
		System.out.println(myCar3.cc);
		System.out.println(myCar3.color);

		
		Car2 myCar4 = new Car2("»¡°­",111,222);
		System.out.println(myCar4.color);
		System.out.println(myCar4.cc);
		System.out.println(myCar4.maxSpeed);
		
		Car2 myCar5 = new Car2("ÃÊ·Ï","¼Ò³ªÅ¸");
		System.out.println(myCar5.color);
		System.out.println(myCar5.model);
		
		
		
		
		
	}
}
