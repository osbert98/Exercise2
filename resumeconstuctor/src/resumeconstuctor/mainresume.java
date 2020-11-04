package resumeconstuctor;

public class mainresume {

	public static void main(String[] args) {
		
		workexp w = new workexp();
		workskills s = new workskills();
		result r = new result();
		talent t = new talent();
		Biodata b = new Biodata();
		cgpa c = new cgpa();
		
		System.out.println("MY RESUME");
		
		b.printBio();
		s.printWorkskills();
		w.printWork();
		t.printTalent();
		c.printGPA();
		
	}

}