package practice.concurrency.future;

import java.util.concurrent.Callable;

/**
 * 
 * <b>Description</b> : A Callable which calculates factorial of a number and
 * returns the value after calculation The intention is to demo callable which
 * is capable of returning a value
 * 
 * @author Vinod Akkepalli
 *
 */

public class DelayedResponseTask implements Callable<Integer> {

	private final int number;

	public DelayedResponseTask(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {

		int result = 1;

		// Calculate factorial of number
		for (int i = this.number; i > 1; i--) {
			result *= i;
		}

		Thread.sleep(2000);
		return result;
	}

}
