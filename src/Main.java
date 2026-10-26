// 1.1. Class declaration
class MyClass {
}

// 1.2. Public method
class MyClassWithMethod{
    public void print(String s){
        System.out.println(s);
    }
}
//1.3 private method
class privateMethod{
    private void printSecret(){
        System.out.println("Super private");
    }
}
//1.4 constructor
class MyConstructor{
    public String firstName;
    public int age;


    public MyConstructor(String firstName, int age){
        System.out.println("Сonstructor was called");
        this.firstName=firstName;
        this.age=age;
    }

}
// 1.5 public propeties
class PublicProperties{
    public String animeName = "Naruto";
    public int numberOfEpisodes = 720;

    public void printFromInside(){
        System.out.println("Anime name: " + animeName);
        System.out.println("Number of episodes: " + numberOfEpisodes);
    }
}
// 1.6 Private properties
class PrivateProperties {
    private String secretCode = "12345";

    public void showSecret() {
        System.out.println("Secret inside class: " + secretCode);
    }
}
// 1.7 getters and setters
class GettersSetters {
    private String name;
    private int age;

    // Getter and Setter for String (name)
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Getter and Setter for int (age)
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
// 1.8 constructors with arguments
class ConstructorsArguments {
    public String phoneModel;
    public double price;

    public ConstructorsArguments(String phoneModel, double price) {
        this.phoneModel = phoneModel;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Phone Model: " + phoneModel + ", Price: $" + price);
    }
}


public class Main {
    public static void main(String[] args) {
        // 1.1 Object creation
        MyClass obj = new MyClass();
        // 1.2 Public method call
        MyClassWithMethod obj2 = new MyClassWithMethod();
        obj2.print("print it");
        // 1.3 Private method call + error
        privateMethod obj3 = new privateMethod();
        //obj3.printSecret();
        //1.4 Constructor
        MyConstructor obj4 = new MyConstructor("Vasya", 17);
        //1.5 public properties
        PublicProperties obj5 = new PublicProperties();
        System.out.println("Anime name: " + obj5.animeName);
        System.out.println("Number of episodes: " + obj5.numberOfEpisodes);
        // change the value
        obj5.animeName = "Death note";
        obj5.numberOfEpisodes = 37;
        System.out.println("New anime name: " + obj5.animeName);
        System.out.println("New number of episodes: " + obj5.numberOfEpisodes);

        obj5.printFromInside();
        //1.6 private properties
        PrivateProperties obj6 = new PrivateProperties();
        obj6.showSecret();
        //System.out.println(obj6.secretCode);
        //1.7 getters and setters
        GettersSetters obj7 = new GettersSetters();

        obj7.setName("Arseniy");
        obj7.setAge(19);

        System.out.println("Name: " + obj7.getName());
        System.out.println("Age: " + obj7.getAge());
        // 1.8 constructors with arguments
        ConstructorsArguments phone1 = new ConstructorsArguments("iPhone 15", 999.99);
        ConstructorsArguments phone2 = new ConstructorsArguments("Samsung Galaxy S24", 899.50);

        phone1.displayInfo();
        phone2.displayInfo();
    }
}