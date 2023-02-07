class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school ="newSchool";
    }
}

public class StaticKeeword {
    public static void main(String[] args) {
     Student.school = "JVM";
     Student student1 = new Student();
     student1.name = "tony";
     System.out.println(student1.school);
    }
}
