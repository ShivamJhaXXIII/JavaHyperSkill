package StaticMembers;

/*A static field has the same value for all instances of the class.

Correct. Static fields are shared among all instances of the class, so they have the same value for all instances.
A static method can be accessed by the class name and doesn't need an object.

Correct. Static methods belong to the class itself and can be accessed using the class name without needing an instance of the class.
A static method cannot be invoked by an instance method of the same class.

Incorrect. Static methods can be invoked by instance methods. An instance method can call a static method using the class name or simply by the method name if they are in the same class.
A static method can access static and non-static fields.

Incorrect. Static methods can access static fields but cannot directly access non-static (instance) fields because non-static fields require an instance of the class to be accessed.*/
class Cats {

    // write static and instance variables
    String name;
    int age;
    static int counter;

    public Cats(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        // do not forget to check the number of cats
        counter++;
        if(counter > 5) System.out.println("You have too many cats");
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }

    public static void main(String[] args) {
        Cats cat1 = new Cats("tom", 3);
        Cats cat2 = new Cats("tom", 3);
        Cats cat3 = new Cats("tom", 3);
        Cats cat4 = new Cats("tom", 3);
        Cats cat5 = new Cats("tom", 3);
        Cats cat6 = new Cats("tom", 3);
        Cats cat7 = new Cats("tom", 3);

        System.out.println(getNumberOfCats());
    }
}