public class Student {

    private String name;
    private Gender gender;

    public Student(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
