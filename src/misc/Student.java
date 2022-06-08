package misc;

public class Student {
    int studentId;
    String name;

    Student(){

    }

    Student(int studentId ,String name){
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Student)){
            return false;
        }
        Student student =  (Student) o;
        if(student.name.equals(this.name))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int sum=0;
        for (char c : name.toCharArray()) {
            sum+=(int)c;
        }
        return studentId+sum;
    }
}
