// Parent class
class Vehicle {
    void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car is driving on the road.");
    }
}

// Subclass Bicycle
class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("The bicycle is pedaling on the road.");
    }
}

// Subclass Boat
class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("The boat is sailing on water.");
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating an array of Vehicle objects
        Vehicle[] vehicles = { new Car(), new Bicycle(), new Boat() };

        // Loop through the array and call the move() method
        for (Vehicle v : vehicles) {
            v.move(); // Calls the overridden move() method for each object
        }
    }
}
