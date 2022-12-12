package kadai2;

import java.util.ArrayList;
import java.util.List;

public class Kadai2Main {

	public static void main(String[] args) {

		// 所有車1台目
		Vehicle myCar1 = new Vehicle("honda civic");
		
		// 燃費は15リッターです
		myCar1.setNenpi(15);
				
		// 20リットル給油しました
		myCar1.kyuyu(20);
		
		
		// 所有車2台目
		Vehicle myCar2 = new Vehicle("toyota carolla");
		
		// 燃費は12リッターです
		myCar2.setNenpi(12);
				
		// 3リットル給油しました
		myCar2.kyuyu(3);
		

		// 私が所有している車のリストを作ります。
		List<Vehicle> myCars = new ArrayList<Vehicle>(); 
		myCars.add(myCar1);
		myCars.add(myCar2);
	
		// 走行可能距離は以下です。
		for(Vehicle car : myCars) {
			car.runableKiro();
		}
	}
}
