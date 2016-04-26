//package homework.factory;
//
//import static java.lang.Thread.sleep;
//
//public class FactoryGas  {
//	boolean setOn;
//	boolean setOff;
//	private long timer = 1L;
//
//	public FactoryGas(final boolean setOn, final boolean setOff) {
//		this.setOn = setOn;
//		this.setOff = setOff;
////		Thread thread = new Thread(new Runnable() {
////			@Override
////			public void run() {
////				try {
////					sleep(timer);
////					stop();
////				} catch (InterruptedException e) {
////					e.printStackTrace();
////					Thread.currentThread().interrupt();
////				}
////			}
////		});
////		thread.start();
//	}
//
//	void stop() {
//		System.out.println(String.format("%s is done", getClass().getSimpleName()));
//	}
//
//	@Override
//	public Stove getStove() {
//		return new GasStove(setOn,setOff);
//	}
//}
