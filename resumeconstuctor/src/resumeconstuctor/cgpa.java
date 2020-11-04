package resumeconstuctor;

public class cgpa {

	double cgpa;
	double[] gpa = new double[4];
	double sum;
	double finalcgpa;
	
	cgpa(){
		this.cgpa = 3.20;
		this.gpa = new double [] {3.40, 3.75, 3.56, 2.98};		
	}

	cgpa(double CGPA, double GPA[]){
		this.cgpa = CGPA;
		this.gpa = GPA;
	}
	
	public double calCGPA() {
		for (int i = 0; i < gpa.length; i++) {
			sum=sum+gpa[i];
		}
		return finalcgpa;
	}
	public void printGPA() {
		System.out.println("\nSemester: ");
		for (int i = 0; i < gpa.length; i++) {
			System.out.println("\nSem " + (i + 1) + " : " + gpa[i]); 
		}
		System.out.println("\nFinal CGPA : " + cgpa); 
	}
}


