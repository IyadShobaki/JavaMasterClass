package section7OOPCompositionEncapsPoly;

public class A3Printer93 {
	private int tonerLvl;
	private int numberOfPagesPrinted;
	private boolean isDuplex;
	public A3Printer93(int tonerLvl, boolean isDuplex) {
		if(tonerLvl > -1 && tonerLvl <= 100) {
			this.tonerLvl = tonerLvl;
		}else {
			this.tonerLvl = -1;
		}
		this.isDuplex = isDuplex;
		this.numberOfPagesPrinted = 0;
	
	}
	
	public int fillToner(int tonerlvl) {
		if(tonerlvl >0 && tonerlvl <= 100) {
			if(this.tonerLvl + tonerlvl > 100) {
				return -1;
			}
			this.tonerLvl += tonerlvl;
		}else {
			return -1;
		}
		return this.tonerLvl;
	}
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(this.isDuplex) {
			pagesToPrint = (pages /2) + (pages % 2);
			System.out.println("Printing in duplex mode");
		}
		this.numberOfPagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}
	
	
}
