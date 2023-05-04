package sunita;

abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }
    
    public String getName() { // "accessor" method
    	return name; // Python: no equivalent
    }

    public String speak() {
        return name + " says " + sound();
    }

    public abstract String sound();
}

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "moooooo";
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "neigh";
    }
}

class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "baaaa";
    }
}

abstract class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}
}

class Cat extends Mammal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public String sound() {
		return "meow";
	}
}

class AnimalSoundsApp {
    public static void main(String[] args) {
        Animal h = new Horse("CJ");
        System.out.println(h.getName());
        System.out.println(h.speak());
        Animal c = new Cow("Bessie");
        System.out.println(c.speak());
        System.out.println(new Sheep("Little Lamb").speak());
        Animal ca = new Cat("Buford");
        System.out.println(ca.speak());
    }
}