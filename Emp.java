public class Emp {
    String name;
    int age;
    String address;

    Emp(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void display(){
        System.out.printf("Name: \"%s\"\nAge: \"%d\"\nAddress: \"%s\"\n");
    }

    public static void main(String args[]){
        Emp e1 = new Emp("Bharat",20,"Hubli");

        e1.display();
    }
    
}
