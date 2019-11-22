package section6OOPClassConstrInher;

public class A3PointClass79 {
	private int x;
    private int y;
    
    public A3PointClass79() {
		
	}
	public A3PointClass79(int x , int y) {
	    this.x = x;
	    this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance(){
	    double d = Math.sqrt((0 - x) * (0 - x) + (0 - y)*(0 - y));
	    return d;
	}
	public double distance(int x, int y){
	    double d = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y)*(y - this.y));
	    return d;
	}
	public double distance(A3PointClass79 p){
	    double d = Math.sqrt((p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y)*(p.getY() - this.y));
	    return d;
	}
}
