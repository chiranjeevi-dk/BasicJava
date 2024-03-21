package ArrayRelated;
class Student
{
    private String name;
   private int mark1,mark2,mark3,regno;
   private float cgpa;
    void get(String s , int reg,int m1,int m2,int m3)
    {
        this.name=s;
        this.regno=reg;
        this.mark1=m1;
        this.mark2=m2;
        this.mark3=m3;
    }
    void calculate()
    {
        cgpa= (float) ((mark1+mark3+mark2)/3.0);
    }
     void display()
    {
        System.out.println(name);
        System.out.println(regno);
        System.out.println(cgpa);
    }
}
public class Stu
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.get("Afzal",2121,71,72,73);
        student.calculate();
        student.display();
    }
}