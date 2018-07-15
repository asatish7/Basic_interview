package design.patter.facade;

import java.util.HashMap;
import java.util.Map;

public class Currency implements Instrument{
String currencyId;

	public Currency(String currencyId) {
	super();
	this.currencyId = currencyId;
}

	public Currency() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String, Instrument> loadInstrumentsFromDataFabric() {
		Map<String,Instrument> currencyMap = new HashMap<>();
		currencyMap.put("USD", new Currency("USD"));
		return currencyMap;
		// TODO Auto-generated method stub
		
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

}
