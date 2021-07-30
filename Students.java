package week3day1;

public class Students {
	
	
	int id = 14526;
	String Name ="Gokul";
	
	
public void getStudentInfo(int Studentid) {
	System.out.println("Student id:"  +Studentid);
}
public void getStudentInfo(String Studentemail) {
	System.out.println("Student email:"  +Studentemail );
}
public void  getStudentInfo(double StudentPhoneNumber) {
	System.out.println("Student PhoneNumber:"  +StudentPhoneNumber  );
	
}
public void  getStudentInfo(char StudentInitial) {
	System.out.println("StudentInitial:"  +StudentInitial );}
	

	


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Students ss = new Students();
	ss.Name("Swetha");
	ss.getStudentInfo('R');
    ss.getStudentInfo("rswetha14701@gmail.com");
    ss.getStudentInfo(14526);
    ss.getStudentInfo(601245754);
    }
private void Name(String string) {
	// TODO Auto-generated method stub
	
}}
	








