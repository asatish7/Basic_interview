package design.patterns.flyweight;

/*
 * String pool uses FlyWeight Design pattern
 */
public class DemoMain {
	public static void main(String[] args) {
		InstrumentImpl instrumentImpl = new InstrumentImpl();
		instrumentImpl.getInstrument(InstrumentType.BASKET).printInstrument();
		instrumentImpl.getInstrument(InstrumentType.BASKET).printInstrument();
		instrumentImpl.getInstrument(InstrumentType.BASKET).printInstrument();

		instrumentImpl.getInstrument(InstrumentType.CURRENCY).printInstrument();
		instrumentImpl.getInstrument(InstrumentType.CURRENCY).printInstrument();
		instrumentImpl.getInstrument(InstrumentType.CURRENCY).printInstrument();
	}
}
