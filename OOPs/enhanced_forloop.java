class Student2 {
    String name;
    int marks;
    int rollno;
}

public class enhanced_forloop {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Antima";
        s1.marks = 100;
        s1.rollno = 1;

        Student2 s2 = new Student2();
        s2.name = "Ashish";
        s2.marks = 90;
        s2.rollno = 2;

        Student2 s3 = new Student2();
        s3.name = "Komal";
        s3.marks = 90;
        s3.rollno = 3;

        Student2 students[] = new Student2[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student2 stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}
