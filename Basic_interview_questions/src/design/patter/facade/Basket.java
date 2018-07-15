package design.patter.facade;

import java.util.HashMap;
import java.util.Map;

public class Basket implements Instrument{
String basketId;

	public Basket(String basketId) {
	super();
	this.basketId = basketId;
}

	public Basket() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String, Instrument> loadInstrumentsFromDataFabric() {
		Map<String, Instrument> basketMap = new HashMap<>();
		basketMap.put("Basket", new Basket("Basket"));
		return basketMap;

	}

	public String getBasketId() {
		return basketId;
	}

	public void setBasketId(String basketId) {
		this.basketId = basketId;
	}

}
