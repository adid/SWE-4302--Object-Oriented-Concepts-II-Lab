public class Main {
    public static void main(String[] args) {

        MyList<Person> peopleList = new MyList<>(10);
        Person person1 = new Person("Adid", "Mirpur", 21);
        Person person2 = new Person("Nahiyan","Banasree", 23);
        Person person3 = new Person("Alvee","Kaola",20);

        peopleList.addItem(person1);
        peopleList.addItem(person2);
        peopleList.addItem(person3);

        MyList<Student> studentsList = new MyList<>(10);
        Student student1 = new Student("Mehedi", "Mirpur", 24,"IUT");
        Student student2 = new Student("Ovi","Uttara",22,"NSU");

        studentsList.addItem(student1);
        studentsList.addItem(student2);

        System.out.println("People:");
        for (int i = 0; i < peopleList.size(); i++) {
            Person person= peopleList.getItem(i);
            System.out.println("Name: " + person.getName()+ " Address: "+ person.getAddress() + ", Age: " + person.getAge());
        }

        System.out.println("\nStudents:");
        for (int i = 0; i < studentsList.size(); i++) {
            Student student= studentsList.getItem(i);
            System.out.println("Name: " + student.getName()+ " Address: "+ student.getAddress()  + ", Age: " + student.getAge() + ", University: " + student.getUniversityName());
        }

    }
}
