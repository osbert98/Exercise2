package resumeconstuctor;

public class talent {

	
	String talent, descrip;
	
	
	
	talent(){
		
		this.talent="Teamwork";
	}
	
	talent(String d){
		
		this.descrip=d;
		
	}
	
	public void printTalent() {
		
		System.out.println("\nTalent");
		talent desc1 = new talent("Working effectively with people and cooperating with others.");
		System.out.println("\t 1."+talent+","+desc1.descrip+"");
	}
}
