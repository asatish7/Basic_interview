package design.patter.facade;

public class FacadeDemo {
public static void main(String[] args) {
	InstrumentLoader instrumentLoader = new InstrumentLoader();
	instrumentLoader.loadBasket();
	instrumentLoader.loadIndex();
}
}
