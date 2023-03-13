import java.util.ArrayList;

public class Methodsimpl implements Methods {
    @Override
    public void FindByFirstLetter(ArrayList<Student> students) {
        for (Student s : students) {
            if (s.getFirstname().startsWith("А") || s.getFirstname().startsWith("Б")) {
                System.out.println(s);
            }
        }

    }

    @Override
    public void  overYearsAndOverSom(ArrayList<Student> students) {
        for (Student a : students) {
            if (a.getAge() > 15 && a.getMoney() > 2000) {
                System.out.println(a);

            }
        }
    }

    @Override
    public void bringOutaRichStudent(ArrayList<Student> students) {
        Student s = students.get(0);
        for (Student e:students) {
        if (e.getMoney() > s.getMoney()){
        s = e;
        }
        
    }
        System.out.println(s);
    }
    @Override
    public void takeOutARichStudentGirl(ArrayList<Student> students) {
        Student r = students.get(0);
        for (Student s : students) {
            if (s.getGender().equals("F")) {
                if (s.getMoney() > r.getMoney()) {
                }
            }
        }
        System.out.println(r);
    }
    @Override
    public void withdrawAllStudents(ArrayList<Student> students) {
        for (Student s:students) {
            System.out.println(s.getAge());
        }

       
    }

    @Override
    public void addMoneyToEachStudent(ArrayList<Student> students) {
        for (Student s:students) {
            s.setMoney(s.getMoney() + 1000);
        }
        System.out.println(students);
    }

    @Override
    public void bringOutTheStudentWhoStandsFirst(ArrayList<Student> students) {
        System.out.println(students.get(0));
    }

    @Override
    public void printQuantityOfStudents(ArrayList<Student> students) {
        System.out.println(students.size());

    }

    @Override
    public void BoysAndGirls(ArrayList<Student> students) {
        ArrayList <Student>students1= new ArrayList<>();
        for (Student a: students) {
            if (a.getGender().equals("F")) {
                students1.add(a);
            }

        }
        System.out.println(students1);
    }
}
