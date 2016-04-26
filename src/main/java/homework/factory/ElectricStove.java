package homework.factory;

public class ElectricStove implements Stove {

	@Override
	public boolean setOnOff() {
		return false;
	}

	@Override
	public long setTimer() {
		return 0;
	}

	@Override
	public boolean start() {
		return false;
	}

	@Override
	public void stop() {

	}
}
