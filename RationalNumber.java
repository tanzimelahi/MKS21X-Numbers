
public class RationalNumber extends RealNumber{

  private int numerator, denominator;

  
  public RationalNumber(int nume, int deno){
   super(deno);
   numerator=nume;
   denominator=deno;
   if (denominator==0) {
	   numerator=0;
	   denominator=1;
   }
  }

  public double getValue(){
    return this.numerator/(this.denominator+0.0);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return this.numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return this.denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber result=new RationalNumber(this.denominator,this.numerator);
    return result;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return this.numerator==other.getNumerator()&& this.denominator==other.getDenominator();
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator+"/"+denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
   
    if (b>a) {
    	int dummy=b;
    	b=a;
    	a=dummy;
    }//makes sure a is the bigger number
    int gcf=b;
    while(a%b!=0) {
    	int dummy=b;
    	b=a%b;//set be to the remainder of a/b
    	a=dummy;
    	gcf=b;
    }
    return gcf;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
	      if( this.numerator==0) {
	    	  this.numerator=0;
	    	  this.denominator=1;
	      }
	      else{int dummy=this.numerator;
          this.numerator=numerator/gcd(this.numerator,this.denominator);
         //System.out.println(this.numerator);
          this.denominator=this.denominator/gcd(dummy,this.denominator);
          System.out.println(this.denominator);
	      }
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber result=new RationalNumber(this.numerator*other.getNumerator(),this.denominator*other.getDenominator());
    return result;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
	    return this.multiply(other.reciprocal());

  }

  /**
  *Return a new RationalNumber that is the sum of this and the other()
  */
  public RationalNumber add(RationalNumber other){
    int sumdeno=this.getDenominator()*other.getDenominator();
   //System.out.println(sumdeno);
    int sumnume=(sumdeno/this.getDenominator())*this.getNumerator()+(sumdeno/other.getDenominator())*other.getNumerator();
   //System.out.println(sumnume);
    RationalNumber result=new RationalNumber(sumnume,sumdeno);
    result.reduce();
    return result;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
	    int sumdeno=this.getDenominator()*other.getDenominator();
	    int sumnume=(sumdeno/this.getDenominator())*this.getNumerator()-(sumdeno/other.getDenominator())*other.getNumerator();

	    RationalNumber result=new RationalNumber(sumnume,sumdeno);
	    result.reduce();
	    return result;
  }
}

