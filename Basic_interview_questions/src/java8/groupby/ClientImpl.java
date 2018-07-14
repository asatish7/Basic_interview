package java8.groupby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientImpl {
	List<Client> clientList = new ArrayList<>();
	Map<String, DoubleSummaryStatistics> totalClientCommissionMap = new HashMap<>();

	private void populateClient() {
		clientList = Arrays.asList(new Client(9, "Arun Mahadev", 1900), new Client(19, "Arun Mahadev", 2700),
				new Client(9, "Abhishek Satish", 1900), new Client(3, "Arun Mahadev", 800),
				new Client(21, "Abhishek Satish", 8900), new Client(23, "Anil Kumar", 9000),
				new Client(2, "Arun Mahadev", 900), new Client(3, "Anil Kumar", 900));
	}

	private void calculateClientCommission() {

		totalClientCommissionMap = clientList.stream().collect(
				Collectors.groupingBy(Client::getClientName, Collectors.summarizingDouble(Client::getCommission)));
		// prints output as below
		System.out.println(totalClientCommissionMap);
		/*
		 * {Abhishek Satish=DoubleSummaryStatistics{count=2, sum=10800.000000,
		 * min=1900.000000, average=5400.000000, max=8900.000000},
		 *  Anil Kumar=DoubleSummaryStatistics{count=2, sum=9900.000000,
		 * min=900.000000, average=4950.000000, max=9000.000000},
		 * Arun Mahadev=DoubleSummaryStatistics{count=4, sum=6300.000000,
		 * min=800.000000, average=1575.000000, max=2700.000000}}
		 */

		// If you just want sum then
		totalClientCommissionMap.forEach((k, v) -> {
			System.out.println("Client : " + k + " Sum: " + v.getSum());
		});

		/*
		 * Client : Abhishek Satish Sum: 10800.0 
		 * Client : Anil Kumar Sum: 9900.0
		 * Client : Arun Mahadev Sum: 6300.0
		 */

	}

	public static void main(String[] args) {
		ClientImpl clientImpl = new ClientImpl();
		clientImpl.populateClient();
		clientImpl.calculateClientCommission();
	}
}
