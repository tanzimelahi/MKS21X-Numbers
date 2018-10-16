
public class RationalNumber extends RealNumber {
	private int x;//numerator
	private int y;//denominator
    public RationalNumber(int x,int y) {
    	super();
    
    }
    public int getx() {
    	return  this.x;
    }
    public int gety() {
    	return this.y;
    }
   public RationalNumber add(RationalNumber a) {
	   return a;
   }
   public RationalNumber substract(RationalNumber a) {
	   return a;
   }
   public RationalNumber multiply(RationalNumber a) {
	   return a;
   }
   public RationalNumber divide(RationalNumber b) {
	   return b;
   }
   public String toString() {
	   return x+"/"+y;
   }
    
}

