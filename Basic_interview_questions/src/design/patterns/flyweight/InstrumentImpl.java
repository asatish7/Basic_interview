package design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class InstrumentImpl {
	private static final Map<InstrumentType, Instruments> instruments = new HashMap<>();

	public Instruments getInstrument(InstrumentType instrumentType) {
		Instruments instrument = instruments.get(instrumentType);
		if (instrument == null) {
			if (instrumentType.equals(instrumentType.BASKET)){
				System.out.println("Creating Basket");
				instrument = new Basket();
			}
			if (instrumentType.equals(instrumentType.CURRENCY)){
				System.out.println("Creating Currency");
				instrument = new Currency();
			}
			if (instrumentType.equals(instrumentType.INDEX)){
				System.out.println("Creating Index");
				instrument = new Index();
			}
			if (instrumentType.equals(instrumentType.STOCK)){
				System.out.println("Creating Stock");
				instrument = new Stock();
			}
			instruments.put(instrumentType, instrument);
		}
		return instrument;
	}
}
