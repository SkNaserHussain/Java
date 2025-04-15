//Created by Sk Naser Hussain on 15-04-25

interface School {
    void showSchoolName();
}

interface Dept extends School {
    void showDeptName();
}

class Student implements Dept {
    public void showSchoolName() {
        System.out.println("School: School of Engineering & Technology");
    }

    public void showDeptName() {
        System.out.println("Department: CSE");
    }

    public void show() {
        showSchoolName();
        showDeptName();
    }
}

public class Interface {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
