class Pet {
    String name;

    String getname() {
        return name;
    }

    void feed() {
        System.out.println("i am feeding " + name);

    }

    //constructor
    Pet(String me) {
        name = me;
    }

    
}