package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//       Student student=new Student(101,"Vineet Singh","Mathura");
//       int result=studentDao.insert(student);
//       System.out.println("Done:"+result);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("PRESS 1  for add new Student");
			System.out.println("PRESS 2  for display All Student");
			System.out.println("PRESS 3  for get detail of single student");
			System.out.println("PRESS 4  for delete student");
			System.out.println("PRESS 5  for update student");
			System.out.println("PRESS 6  for exit");
			System.out.println("Enter your choice:");
			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					System.out.println("Enter the student id:");
					int studentId = Integer.parseInt(br.readLine());
					System.out.println("Enter the student name:");
					String name = br.readLine();
					System.out.println("Enter the student city:");
					String city = br.readLine();

					Student student = new Student(studentId, name, city);
					studentDao.insert(student);

					break;

				case 2:
					// display all student
					List<Student> studentList = studentDao.getAllStudent();
					for (Student st : studentList) {
						System.out.println("Id:" + st.getStudentId());
						System.out.println("Name:" + st.getStudent_Name());
						System.out.println("City:" + st.getStudentCity());
						System.out.println("---------------------------");
					}
					break;
				case 3:
					// get single student
					System.out.println("Enter student Id:");
					int stId = Integer.parseInt(br.readLine());
					Student stu = studentDao.getStdent(stId);
					System.out.println("Id:" + stu.getStudentId());
					System.out.println("Name:" + stu.getStudent_Name());
					System.out.println("City:" + stu.getStudentCity());
					System.out.println("---------------------------");
					break;
				case 4:
					// delete student
					System.out.println("Enter student Id:");
					int id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("Student deleted.....");
					break;
				case 5:
					boolean dis=true;
					System.out.println("Enter your id:");
					int sid=Integer.parseInt(br.readLine());
					Student studnt=studentDao.getStdent(sid);
					if(studnt!=null)
					{
					while(dis)
					{
					System.out.println("----Student Details----");
					System.out.println("Id:"+studnt.getStudentId());
					System.out.println("Name:"+studnt.getStudent_Name());
					System.out.println("City:"+studnt.getStudentCity());
					System.out.println("-----------------------");
					System.out.println("PRESS 1 edit student Name:");
					System.out.println("PRESS 2 edit student city:");
					System.out.println("PRESS 3 exit:");
					System.out.println("Enter your choice::");
					int option=Integer.parseInt(br.readLine());
					switch(option)
					{
					case 1:
						System.out.println("Enter your name:");
						String stName=br.readLine();
						studnt.setStudent_Name(stName);
						studentDao.updateStudent(studnt);
						break;
					case 2:
						System.out.println("Enter your city:");
						String stCity=br.readLine();
						studnt.setStudentCity(stCity);
						studentDao.updateStudent(studnt);
						break;
					case 3:
						dis=false;
						break;	
					}
				   }
				  }
					else
					{
						System.out.println("Invalid id try again!!");
						break;
					}
					if(!dis)
					{
						break;
					}
				case 6:
					// exit
					go = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid input Try agin !!");
				e.printStackTrace();
			}
		}
		System.out.println("Thank you using my application");
		System.out.println("See you soon!!");

	}
}
