package resumeconstuctor;

public class workskills {

	String skill1, skill2;
	

	workskills(){
		
		this.skill1= "MS Package 100%";
		
	}
	
	workskills(String s2){
		
		this.skill2= s2;
		
	}


	public void printWorkskills(){
		
		System.out.println("\nWorkskills");
		
		workskills sk2 = new workskills("Java Programming 30%");
		System.out.println("\t 1."+skill1+",\t 2."+sk2.skill2+"");
	}
}
