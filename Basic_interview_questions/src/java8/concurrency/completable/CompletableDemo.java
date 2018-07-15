package java8.concurrency.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
/*
 * Completable future for runasync and supplyasync
 */
public class CompletableDemo {
	public static void main(String[] args) {
		Runnable task2 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("i value is " + i + " Executed by Thread " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		CompletableFuture<Void> cf = CompletableFuture.runAsync(task2);
		for (int j = 0; j < 100; j++) {
			System.out.println(" J value is " + j + " Executed by " + Thread.currentThread().getName());

		}
		Supplier<String> sup = () -> {
			int result = 0;
			for (int i = 0; i < 100; i++) {
				if (i == 99) {
					result = i;
				}
			}

			return String.valueOf(result);
		};
		CompletableFuture<String> cfs = CompletableFuture.supplyAsync(sup);

		try {
			System.out.println(cfs.get());
			cf.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
