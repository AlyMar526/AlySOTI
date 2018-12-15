
/*public class Student {
	//1.implement private variables (attributes can be public)
	private String name;
	private double totalQuizScore;
	private int count; //counters always have to be an int
	//2. default constructor
	public Student() { //default does not take any parameters
		name = ""; // must use set name so user can override and input 
		totalQuizScore = 0;
		count = 0;
	}
	//3. Overloaded construct
	public Student (String name) {
		this.name=name;
		totalQuizScore = 0;
		count = 0;
	}
	//4. generate getters and setters
	public String getName() { // get: returns attribute
		return name;
	}
	public void setName(String name) { //set: return type is always void b.c nothing is being returned an action is simply being done
		this.name = name;
	}
	public double getTotalQuizScore() {
		return totalQuizScore;
	}
	public void setTotalQuizScore(double totalQuizScore) {
		this.totalQuizScore = totalQuizScore;
	}
	//5.implement methods 
	public void addQuiz(double score) { // void: not returning anything, an action is being done
		totalQuizScore += score;
		count++;
	}
	public double getAverageScore() { //no parameters because all of the data needed is inside of the class
		if(count > 0) {
			return totalQuizScore / count;
		}else {
				return 0;
			}
	}
	
}*/

public class Student {
	//1.implement private variables (attributes can be public)
	private String name;
	private double totalGradeScore;
	private int count; //counters always have to be an int

	//2. default constructor
	public Student() { //default does not take any parameters
		name = ""; // must use set name so user can override and input 
		totalGradeScore = 0;
		count = 0;
	}
	//3. Overloaded construct
	public Student (String name) {
		this.name=name;
		totalGradeScore = 0;
		count = 0;
	}
	//4. generate getters and setters
	public String getName() { // get: returns attribute
		return name;
	}
	public void setName(String name) { //set: return type is always void b.c nothing is being returned an action is simply being done
		this.name = name;
	}
	public double getTotalQuizScore() {
		return totalGradeScore;
	}
	public void setTotalQuizScore(double totalGradeScore) {
		this.totalGradeScore = totalGradeScore;
	}
	//5.implement methods 
	public void addGrade(String grade) { // void: not returning anything, an action is being done
		Double pointValue=0.0;
		//while(!grade.equalsIgnoreCase("q")) {
		if (grade.equalsIgnoreCase("q")) {
			return;
		}
		//if (grade.charAt(1) =='+'||grade.charAt(1) =='-') {
		if (grade.contains("+")||grade.contains("-"))
			switch(grade) {
			case "A-": case "a-":
				pointValue= 3.7;
				totalGradeScore += pointValue;
				count++;
				break;
			case "B+": case "b+":
				pointValue = 3.3;
				totalGradeScore += pointValue;
				count++;
				break;
			case "B-": case "b-":
				pointValue = 2.7;
				totalGradeScore += pointValue;
				count++;
				break;
			case "C+": case "c+":
				pointValue = 2.3;
				totalGradeScore += pointValue;
				count++;
				break;
			case "C-": case "c-":
				pointValue = 1.7;
				totalGradeScore += pointValue;
				count++;
				break;
			case "D+": case "d+":
				pointValue = 1.3;
				totalGradeScore += pointValue;
				count++;
				break;
			
		}else{
			switch(grade) {
			case "A": case "a":
				pointValue= 4.0;
				totalGradeScore += pointValue;
				count++;
				break;
			case "B": case "b":
				pointValue = 3.0;
				totalGradeScore += pointValue;
				count++;
				break;
			case "C": case "c":
				pointValue = 2.0;
				totalGradeScore += pointValue;
				count++;
				break;
			case "D": case "d":
				pointValue = 1.0;
				totalGradeScore += pointValue;
				count++;
				break;
			case "F": case "f":
				pointValue = 0.0;
				totalGradeScore += pointValue;
				count++;
				break;
		}
		}
}

		
		
		
	public double getGPA() { //no parameters because all of the data needed is inside of the class
		if(count > 0) {
			return totalGradeScore / count;
		}else {
				return 0;
			}
	}
	
}
