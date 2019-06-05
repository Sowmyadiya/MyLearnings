package learning.learning;

/**
 * Hello world!
 *
 */
public class Address 
{
	
	int flatNo;
	String streetName;
	String city;
	long pinCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int flatNo, String streetName, String city, long pinCode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
		
	}
	
	@Override
	public String toString() {
		String msgs=this.flatNo+" "+this.streetName+" "+this.city+" and "+this.pinCode;
		return msgs;
	}
}
