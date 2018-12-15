/*import java.util.*;
public class RunStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner (System.in);
Student a = new Student ("Anne"); // or Student a = new Student (""); to get user input 
a.addQuiz(90);
a.addQuiz(100);;
a.addQuiz(89);
System.out.println("Quiz Average:"+a.getAverageScore());

	}//main
}//class*/
import java.util.*;
public class RunStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String grade="",name="";		
Scanner in = new Scanner (System.in);
Student a = new Student (); // or Student a = new Student (""); to get user input 
System.out.println("Please input student's name:");
name = in.next();
a.setName(name);
System.out.println("Please input student's grades, enter 'q' to quit");
while(!grade.equalsIgnoreCase("q")) {
grade = in.next();
a.addGrade(grade);	
}
System.out.println(a.getName() + " GPA:"+a.getGPA());

	}//main
}//class
