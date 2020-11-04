package resumeconstuctor;

public class result {

	String subject;
	char grade;
	
	
	result(){
		
		this.subject="STIA 113";
	}
	
	result(char a){
		
		this.grade=a;
		
	}
	
	public void printResult() {
		
		System.out.println("\nResult");
		
		result r = new result('A');
		System.out.println("Subject: "+subject);
		System.out.println("Grade: "+r.grade);
	}
}

	
