class Student extends Person
{
private String universityName;

    public Student(String name, String address, int age, String universityName) {
        super(name, address, age);
        this.setUniversityName(universityName);
    }

    public void study() {
        System.out.println(getName()+" is studying at "+universityName);
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}