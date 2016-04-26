package homework.factory;

import static java.lang.Thread.sleep;

public class GasStove implements Stove {
	boolean setOnOff;
	long time;
	boolean start;


	@Override
	public boolean setOnOff() {

		return setOnOff = true;
	}

	@Override
	public long setTimer() {
		return this.time = 230;
	}

	@Override
	public boolean start() {

		if (setOnOff = true) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						sleep(time);
						stop();
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();
					}
				}
			});
			thread.start();

		}
		return this.start = true;
	}

	public void stop() {
		if (setOnOff = false) {
			System.out.println(String.format("%s is done", getClass().getSimpleName()));
		}
	}


}
