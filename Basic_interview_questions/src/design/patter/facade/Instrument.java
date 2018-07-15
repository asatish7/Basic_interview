package design.patter.facade;

import java.util.Map;

public interface Instrument {
public Map<String,Instrument> loadInstrumentsFromDataFabric();
}
