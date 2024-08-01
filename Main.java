package Lab5;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {

	private String name;

	public Dog(String name) {
		// The problem program did not had this implementation
		super(name);
	}

	public String getName() {
		return name;
	}
	
	public void sound(int volume) {
		System.out.println("Dog barks with volume: " + volume);
	}
}

class Cat extends Animal {


	public Cat(String name) {
		super(name);
	}

	public void sound() {
		System.out.println("Cat meows");
	}
}

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
		dog.sound(5); 

		Cat cat = new Cat("whiskers");
		cat.sound();   
	}
}

/*
 * class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    public Dog(String name) {
    }

    public void sound(int volume) {
        System.out.println("Dog barks with volume: " + volume);
    }
}

class Cat extends Animal {
    
    private void sound() {
keep
Pinned
private void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound(5); 

        Cat cat = new Cat("Whiskers");
        cat.sound();   
    }
}*/
