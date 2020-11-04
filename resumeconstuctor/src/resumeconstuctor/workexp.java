package resumeconstuctor;



public class workexp {

	String workexp;
	
	workexp(){
		
		
	}
	
	workexp(String w){
		
		this.workexp= w;
		
	}
	
	public void printWork() {

	System.out.println("\nExperience");
	
	
	workexp work1= new workexp("6 months experience as a Technician");
	
	System.out.println("\tWork Experience: "+work1.workexp);
	
	

}

}
