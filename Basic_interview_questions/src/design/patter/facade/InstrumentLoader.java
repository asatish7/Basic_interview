package design.patter.facade;

public class InstrumentLoader {
	Index index;
	Currency currency;
	Basket basket;

	InstrumentLoader() {
		this.index = new Index();
		this.currency = new Currency();
		this.basket = new Basket();
	}

	public void loadCurrency(){
		System.out.println(currency.loadInstrumentsFromDataFabric());
	}
	
	public void loadIndex(){
		System.out.println(index.loadInstrumentsFromDataFabric());
	}
	
	public void loadBasket(){
		System.out.println(basket.loadInstrumentsFromDataFabric());
	}
}
