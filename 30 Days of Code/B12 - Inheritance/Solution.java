import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    public char calculate(){
        int average = 0;
        char grade = ' ';
        for(int testScore:testScores){
            average += testScore;
        }
        average = average/testScores.length;
        if(average>=90 && average<=100){
            grade = 'O';
        }
        if(average>=80 && average<90){
            grade = 'E';
        }
        if(average>=70 && average<80){
            grade = 'A';
        }
        if(average>=55 && average<70){
            grade = 'P';
        }
        if(average>=40 && average<55){
            grade = 'D';
        }
        if(average<40){
            grade = 'T';
        }
        return grade;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}