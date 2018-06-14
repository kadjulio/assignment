package ogui.juliot.wis.hw2.assignment2;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application  {

	public static HashMap<Long,Student> hmStudent;
	public static void main(String[] args) {
	hmStudent=new HashMap<Long,Student>();
	
	Student one=new Student("john","WIS");
	hmStudent.put(new Long(one.getId()),one);
	
	SpringApplication.run(Assignment2Application.class, args);
	Student two=new Student("julio","maths");
    hmStudent.put(new Long(two.getId()),two);
	}
}

