public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private double money;

    public String getFirstname() {
        return firstname;
    }
public Student(){}
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Student(String firstname, String lastname, int  age, String  gender, double money) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.money = money;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstname: " + firstname + '\n' +
                "lastname: " + lastname + '\n' +
                "age: " + age +
                "gender: " + gender +
                "money: " + money;
    }
}
