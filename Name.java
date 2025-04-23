public class Name {
    String name;
    int age;
    String address;

    Name(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void display(){
        System.out.printf("Name: \"%s\"\nAge: \"%d\"\nAddress: \"%s\"\n", name, age, address);
    }

    public static void main(String args[]){
        Name n1 = new Name("Bharat",20,"Hubli");

        n1.display();
    }
}