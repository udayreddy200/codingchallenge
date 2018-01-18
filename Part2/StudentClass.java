import java.util.ArrayList;
import java.util.List;

public class StudentClass {
	
	
	public List<Student> addStudents(Student stud1,List<Student> arrList){
		arrList.add(stud1);
		return arrList;
	}
	
	
	
	
	public static void main(String [] args){
		
		Student stud1 = new Student(1,"Uday",6786789011L,"Atlanta");
		Student stud2 = new Student(2,"Harish",9126786786L,"New York");
		List<Student> arrList = new ArrayList<Student>();
		StudentClass studClass = new StudentClass();
		studClass.addStudents(stud1, arrList);
		studClass.addStudents(stud2, arrList);
		System.out.println("Here are the Student Details");
		for(Student arr:arrList){
			System.out.println("Student Id:"+arr.id+"  Student Name:"+arr.name+"  Phone Number:"+arr.Phone+"  Address:"+arr.address);
		}			
	}
}


class Student{
	
	int id;
	String name;
	Long Phone;
	String address;
	
	public Student(int id, String name, Long Phone, String address){
		this.id = id;
		this.name = name;
		this.Phone = Phone;
		this.address = address;
		
	}
	
}