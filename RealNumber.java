
public class RealNumber {
	
		private int x;
		public RealNumber() {
			this.x=0;
		}
		public RealNumber(int x) {
			this.x=x;
		}
		public String toString() {
			return ""+x;
		}
		public int getx() {
			return this.x;
		}
		public int compareTo(RealNumber y) {
			return this.x-y.getx();
		}
		public int add(RealNumber y) {
			return this.x+y.getx();
		}
		public int substract(RealNumber y) {
			return this.x-y.getx();
		}
		public int multiply(RealNumber y) {
			return 1;//dummy value
		}
		public int divide(RealNumber y) {
			return 1;//dummy value
		}

}

