public class Subject { 
    private String title; 
    private String code; 
    private double grade; 
    private double unit; 
    public Subject(){ 
        this.title = new String("NO TITLE"); 
        this.code = new String("NO CODE"); 
        this.grade = 0; 
        this.unit = 0; 
    } 
    public Subject(double grade, double unit){ 
        this.title = new String("NO TITLE"); 
        this.code = new String("NO CODE"); 
        this.grade = grade; 
        this.unit = unit; 
    } 
    public Subject(String title, String code, double grade, double unit){
        this.title = title; 
        this.code = code; 
        this.grade = grade; 
        this.unit = unit; 
    } 
    public String getTitle(){ 
        return title; 
    } 
    public void setTitle(String title){ 
        this.title = title; 
    } 
    public String getCode(){ 
        return code; 
    } 
    public void setCode(String Code){ 
        this.code = code; 
    } 
    public double getGrade(){ 
        return grade; 
    } 
    public void setGrade(double grade){ 
        this.grade = grade; 
    } 
    public double getUnit(){ 
        return unit; 
    } 
    public void setUnit(double unit){ 
        this.unit = unit; 
    } 
}
