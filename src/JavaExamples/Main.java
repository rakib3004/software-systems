package src.JavaExamples;

// Interface 1
interface Printable {
    void print();
}

// Interface 2
interface Loggable {
    void log();
}

// Interface 3
interface Auditable {
    void audit();
}

// Interface 4
interface Displayable {
    void display();
}

// Interface 5
interface Exportable {
    void export();
}

// Interface 6
interface Downloadable {
    void download();
}

// Interface 7
interface Updatable {
    void update();
}

// Interface 8
interface Searchable {
    void search();
}

// Parent Class 1
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Parent Class 2
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Parent Class 3
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Parent Class 4
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

// Parent Class 5
class Product {
    void sell() {
        System.out.println("Product is sold");
    }
}

// Child Class 1
class Circle extends Shape implements Printable, Loggable {
    @Override
    public void print() {
        System.out.println("Printing Circle");
    }

    @Override
    public void log() {
        System.out.println("Logging Circle");
    }
}

// Child Class 2
class Dog extends Animal implements Auditable, Displayable {
    @Override
    public void audit() {
        System.out.println("Auditing Dog");
    }

    @Override
    public void display() {
        System.out.println("Displaying Dog");
    }
}

// Child Class 3
class Car extends Vehicle implements Exportable, Downloadable {
    @Override
    public void export() {
        System.out.println("Exporting Car");
    }

    @Override
    public void download() {
        System.out.println("Downloading Car");
    }
}

// Child Class 4
class Manager extends Employee implements Updatable, Searchable {
    @Override
    public void update() {
        System.out.println("Updating Manager");
    }

    @Override
    public void search() {
        System.out.println("Searching Manager");
    }
}

// Child Class 5
class Laptop extends Product implements Printable, Loggable {
    @Override
    public void print() {
        System.out.println("Printing Laptop");
    }

    @Override
    public void log() {
        System.out.println("Logging Laptop");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Dog dog = new Dog();
        Car car = new Car();
        Manager manager = new Manager();
        Laptop laptop = new Laptop();

        circle.draw();
        circle.print();
        circle.log();

        dog.makeSound();
        dog.audit();
        dog.display();

        car.move();
        car.export();
        car.download();

        manager.work();
        manager.update();
        manager.search();

        laptop.sell();
        laptop.print();
        laptop.log();
    }
}
