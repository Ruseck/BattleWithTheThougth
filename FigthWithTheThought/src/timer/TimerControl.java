package timer;

import java.util.ArrayList;

import javax.management.timer.Timer;

public class TimerControl {

	public TimerControl() {
	}

	ArrayList<Timer> timers = new ArrayList<>();

	Thread thread = new Thread(new Runnable() {
	boolean isStop=false;	
		@Override
		public void run() {

			while (!isStop) {
				for (int i = 0; i < timers.size()&&!isStop; i++) {
					Timer timer = timers.get(i);
					timer.setTime();
				}
			}
		}
	});

}
