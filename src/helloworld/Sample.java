package helloworld;

public class Sample {
String fname;
String lname;



	public Sample(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
	
}



	public static void main(String[] args) {
		Sample sam=new Sample("karthick","bala");
		System.out.println(sam.fname+sam.lname);
	
		
		
		

	}

}
