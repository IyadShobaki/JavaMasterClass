//
//public class Printer {
//	private int tonerLevel;
//	private int pagesPrinted;
//	private boolean duplex;
//	
//	public Printer(int tonerLevel, boolean duplex) {
//		super();
//		if(tonerLevel >-1 && tonerLevel <= 100) {
//			this.tonerLevel = tonerLevel;
//		}else {
//			this.tonerLevel = -1;
//		}
//		
//		this.pagesPrinted = 0;
//		this.duplex = duplex;
//	}
//	
//	public int addToner(int tonerAmount) {
//		if(tonerAmount >0 && tonerLevel <= 100) {
//			this.tonerLevel = tonerAmount;
//		}else {
//			return -1;
//		}
//	}
//}
