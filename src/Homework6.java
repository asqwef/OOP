class Course {
    private String code, name;
    Course() {}
    Course(String c, String n) {
        this.code = c;
        this.name = n;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
}
class OnlineCourse extends Course {
    OnlineCourse() {}
    OnlineCourse(String c, String n) {
        super(c, n);
    }
    @Override
    public String toString() { return "Code: " + getCode() + ", Name: " + getName() + ", Type: Online"; }
}
class OfflineCourse extends Course {
    OfflineCourse() {}
    OfflineCourse(String c, String n) {
        super(c, n);
    }
    @Override
    public String toString() { return "Code: " + getCode() + ", Name: " + getName() + ", Type: Offline"; }
}
public class Homework6 {
    static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}
