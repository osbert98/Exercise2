package resumeconstuctor;

public class Biodata {

	String name, gender, birthday, citizenship, marital_status, address, hp;
	int age;
	
	
	Biodata(){
		
		//this.name= "OSBERT HOWELL MOIZIN";
		this.gender= "Male";
		this.birthday= "28 July 1998";
		this.age = 22;
		this.citizenship = "Malaysian";
		this.marital_status= "Single";
		this.address= "Kampung Soronsob 89108 Kota Marudu, Sabah, Malaysia.";
		this.hp = "016-8354737";
	}
	
	public Biodata(String n){
		
		this.name=n;
		
	}
	
	public void printBio(){
	
		Biodata n = new Biodata("Osbert Howell Moizin");
		
		
		System.out.println("\nName: "+n.name);
		System.out.println("Gender: "+gender);
		System.out.println("Date of Birth: "+birthday);
		System.out.println("Age: "+age);
		System.out.println("Citizenship: "+citizenship);
		System.out.println("Marital Status: "+marital_status);
		System.out.println("Address: "+address);
		System.out.println("No HP: "+hp);
		
	}
}
