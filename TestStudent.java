public class TestStudent {
  public static void main(String[] args){
    System.out.println("This program solves the average of the student.");
    int quit = 1;
    while(quit!=0){
      try {
        int subjects = (int)Input.validDouble("Number of Subjects: ",2,0,"lower");
        Subject[] subject = new Subject[subjects];
        for(int i=0; i<subjects; i++){
          double eachGrade =  Input.validDouble("Grade #"+(i+1)+": ",1,5,"between");
          double eachUnit =  Input.validDouble("Unit #"+(i+1)+": ",1,0,"lower");
          subject[i] = new Subject(eachGrade, eachUnit);
        }
        Student student = new Student(subject);
        System.out.println("The average is "+student.average());
			  System.out.println("Enter zero to quit.");
			  quit = Input.getInt();
		  } catch(Exception e){
		    System.out.println("Invalid Input. NAN.");
		    //e.getMessage();
		    continue;
		  }
    }
  }
}
