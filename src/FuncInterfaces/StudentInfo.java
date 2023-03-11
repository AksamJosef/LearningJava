package FuncInterfaces;

import java.util.ArrayList;

interface StudentCheks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentCheks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 7.7;
    }
}
public class StudentInfo {
    void testStudents(ArrayList<Student> students, StudentCheks studentCheks) {
        for (Student s : students) {
            if (studentCheks.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Assaf", 22, 3, 8.3);
        Student student2 = new Student("Josef", 25, 5, 7.4);
        Student student3 = new Student("Jotaro", 21, 2, 5.1);
        Student student4 = new Student("Joylin", 22, 3, 9.9);
        Student student5 = new Student("Jon", 21, 2, 6.6);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudents(students, new CheckOverGrade());
        System.out.println();

        studentInfo.testStudents(students, (Student s) -> {return s.age < 23;});

        System.out.println("---------------------");
        StudentCheks studentCheks = s -> s.age < 22;
        for (Student s : students) {
            if (studentCheks.check(s)) {
                System.out.println(s);
            }
        }

    }

//    public void printStudentOverGrade (ArrayList<Student> students, double grade) {
//        for (Student s : students) {
//            if (s.avgGrade > grade) System.out.println(s);
//        }
//    }
//
//    public void printStudentUnderAge (ArrayList<Student> students, int age) {
//        for (Student s : students) {
//            if (s.age < age) System.out.println(s);
//        }
//    }
}
