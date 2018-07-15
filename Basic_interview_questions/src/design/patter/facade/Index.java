package design.patter.facade;

import java.util.HashMap;
import java.util.Map;

public class Index implements Instrument {
	String ricCode;

	public Index(String ricCode) {
		super();
		this.ricCode = ricCode;
	}

	public Index() {
		// TODO Auto-generated constructor stub
	}

	Map<String, Instrument> indexMap = new HashMap<>();

	@Override
	public Map<String, Instrument> loadInstrumentsFromDataFabric() {
		indexMap.put(".IBM", new Index(".IBM"));
		return indexMap;

	}

	public String getRicCode() {
		return ricCode;
	}

	public void setRicCode(String ricCode) {
		this.ricCode = ricCode;
	}

}
