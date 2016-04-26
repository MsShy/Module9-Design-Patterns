package homework.factory;

public class Cook {
	public static void main(String[] args) {


		Factory factory = new FactoryStove();
		Stove stove = factory.getGasStove();
		stove.setOnOff(true);
		stove.setTimer(123);
		System.out.println("Stove working " + stove.getTime() + " minute");
		stove.setTemperature(20);
		System.out.println("Stove working at temperature " + stove.getTemperature());
		System.out.println("you spent gas on" + stove.getExpense() + "grn");
		stove.stop();


	}

}
