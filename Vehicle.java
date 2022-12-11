package kadai2;

public class Vehicle {

	private String model;
	private int gasQuantity = 0;
	private int nenpi = 1;
	
	public static final String type = "car";
	
	// 車種を設定する
	public Vehicle(String model) {
		this.model = model;
	}
	
	// 燃費を設定する
	public void setNenpi(int nenpi) {
		this.nenpi = nenpi;
	}
	
	// 給油する
	public void kyuyu(int quantity) {
		this.gasQuantity = quantity;
	}
	
	// 走行可能距離を求める
	public void runableKiro() {
		
		System.out.println(model + "の走行可能距離は" + nenpi*gasQuantity + "キロです。");
		
		if ( gasQuantity < 5 ) {
			System.out.println(model + "は給油してください。");
		}
	}
}
