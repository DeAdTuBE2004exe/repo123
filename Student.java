public class Student{
    String name,usn;

    Student(String name, String usn){
        this.name = name;
        this.usn = usn;
    }

    void display(){
        System.out.printf("Name: \"%s\"\nUSN: \"%s\"\n", name, usn);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Bharat","01fe23bca007");

        s1.display();
    }
}