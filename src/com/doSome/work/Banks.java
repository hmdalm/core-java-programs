package com.doSome.work;

public interface Banks {
	double rateofInterest();

}
class Sbi implements Banks{
	public double rateofInterest() {
		return 8.1;
		
	}
}
class Pnb implements Banks{
	public double rateofInterest() {
		return 9.1;
	
}
	}
	class Hdfc implements Banks{
		public double rateofInterest() {
			return 10.0;
		
	}
	}
		class RBI implements Banks{
			public double rateofInterest() {
				return 8.0;
			
		}
		}
