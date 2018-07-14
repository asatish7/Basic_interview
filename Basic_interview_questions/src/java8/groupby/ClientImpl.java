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
		System.out.println(totalClientCommissionMap);
	}

	public static void main(String[] args) {
		ClientImpl clientImpl = new ClientImpl();
		clientImpl.populateClient();
		clientImpl.calculateClientCommission();
	}
}
