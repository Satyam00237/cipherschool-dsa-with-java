abstract class Car
{
    int maxSpeed;
    abstract void accelerate(); // Only Declared but not implemented it is without a body
    // They are created to force the child classes to implement them before using, We will use them after overriding
    abstract void brake();
}
abstract class BMW extends Car {
    void accelerate() {
        System.out.println("BMW is accelerating");
    }
}
