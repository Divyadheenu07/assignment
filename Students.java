package student.s;

public class Students {

		 public void getStudentInfo(int id) {
			 System.out.println("THE Student Id is : "+id);
			 }
		 public void getStudentInfo(int id,String name) {
			 System.out.println("ID IS : "+id +"                                                                                           " + " THE Student  Name is : "+name);
		    }
		 public void getStudentInfo(String email,long phonenumber) {
			 System.out.println("THE Student email is  : "+email + "                                               "+
					 "The Student phone number is : "+phonenumber);
			 
			 }
		 public static void main(String[] args) {
			 Students details=new Students();
			 details.getStudentInfo(1675);
			 details.getStudentInfo(1675, "Divya");
			 details.getStudentInfo("divyadheenu1627@gmail.com",7358523279L);
			 

}
	}

