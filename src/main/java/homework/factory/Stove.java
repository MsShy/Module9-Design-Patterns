package homework.factory;

public interface Stove {
	void setOnOff(boolean state);

	void setTimer(long time);

	long getTime();

	int getTemperature();

	void setTemperature(int temperature);

	double getExpense();

	void stop();

}
