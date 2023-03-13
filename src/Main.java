import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Student деген класс ачыныз полелерин толтурунуз.
//        Полелери аты, жашы,жынысы,акчасы,фамилиясы
//       main ден класстын 10 объектин тузуп ArrayList ке салыныз
//        * 1 - аты А жана Б менен башталган студенттерди чыгарыныз.
//        * 2 - жашы 15тен чон жана акчасы 2000 ден чон балдарды чыгарыныз.
//        * 3 - эн коп акчасы бар студентти чыгарыныз.
//        * 4 - эн акчасы коп кызды чыгарыныз.
//        * 5 - баардык студенттердин атын эле консолго чыгарыныз.
//        * 6 - ар бир студеттин акчасына 1000 сомдон кошуп чыгарыныз.
//        * 7 - биринчи турган студентти чыгарыныз.
//        * 8 - канча студент бар экен чыгарыныз(санын)
//        * 9 - балдарды жана кыздарды болуп группага салгыла

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Эльдан", "Тургунбаев", 2005,"M",2034));
        students.add(new Student("Кайрат", "Мамытов", 2004, "M", 1336));
        students.add(new Student("Айзат", "Дуйшеева", 2003, "F", 13));
        students.add(new Student("Эрбол", "Аширали уулу", 2005,"M",23));
        students.add(new Student("Оксана", "Сайдилханова", 1997,"F",6));
        students.add(new Student("Эрназар", "Асанбеков", 2003,"F",8));
        students.add(new Student("Айкелди", "Ахматова", 1996,"F",3));
        students.add(new Student("Бахтияр", "Абдрахманов", 2005,"M",6));
        students.add(new Student("Айпери", "Омурзакова", 2000,"F",4));
        students.add(new Student("Айназик", "Кенжеева", 2005,"F",28));
        Methodsimpl methodsimpl1 = new Methodsimpl();
        Student student = new Student();
      //  methodsimpl1.FindByFirstLetter(students);
       // methodsimpl1.overYearsAndOverSom(students);
      //  methodsimpl1.bringOutaRichStudent(students);
       // methodsimpl1.takeOutARichStudentGirl(students);
       // methodsimpl1.withdrawAllStudents(students);
       //// methodsimpl1.addMoneyToEachStudent(students);
      //  methodsimpl1.bringOutTheStudentWhoStandsFirst(students);
       //   methodsimpl1.printQuantityOfStudents(students);
        methodsimpl1.BoysAndGirls(students);
    }
}