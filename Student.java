public class Student { 
    protected String name; 
    protected Subject[] subject; 
    public Student(){ 
        this.name = new String("NO NAME"); 
    } 
    public Student(Subject[] subject){ 
        this.name = new String("NO NAME"); 
        this.subject = subject; 
    } 
    public Student(String name, Subject[] subject){ 
        this.name = name; 
        this.subject = subject; 
    } 
    public String getName(){ 
        return name; 
    } 
    public void setName(String name){ 
        this.name = name; 
    } 
    public void setSubject(Subject[] subject){ 
        this.subject = subject; 
    } 
    public Subject getSubject(int index){ 
        return subject[index]; 
    } 
    public void setSubject(Subject subject, int index){ 
        this.subject[index] = subject; 
    }
    public double average(){ 
        double unitSum=0, gradeSum=0; 
        for(Subject eachSubject: subject){ 
            gradeSum += eachSubject.getGrade()*eachSubject.getUnit(); 
            unitSum += eachSubject.getUnit(); 
        } 
        return gradeSum/unitSum; 
    } 
}