package assignment1;

public class Student {
	int A;
	int B;
	int C;
	
	public Student(int A, int B, int C) {
		super();
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public static void main(String[] args) {
		Student st1 = new Student(67, 70,79);
		Student st2 = new Student(76, 73,69);
		Student st3 = new Student(69, 81,82);
		
		int st1total = st1.A +st1.B+st1.C;
		int st2total = st2.A +st2.B+st2.C;
		int st3total = st3.A +st3.B+st3.C;
		System.out.println("Total and average of student1 out of 300 :"+st1total +" "+st1total/3);
		System.out.println("Total and average of student2 out of 300 :"+st2total +" "+st2total/3);
		System.out.println("Total and average of student3 out of 300 :"+st3total+" "+st3total/3);
		
		int subA = st1.A + st2.A+ st3.A;
		int subB = st1.B + st2.B+ st3.B;
		int subC = st1.C + st2.C+ st3.C;
		System.out.println("Average in subject A "+subA/3);
		System.out.println("Average in subject B "+subB/3);
		System.out.println("Average in subject C "+subC/3);
		
		
		
	}

}
