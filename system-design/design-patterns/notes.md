**Design Patterns**
- Creational (Factory,Singleton,Builder)
- Structural (Adapter,Decorator,Facade)
- Behavioural (Strategy, Observer)


**Factory Design Pattern**
- Problem Consider the case where in restaurant we create different types of 
burgers based on type.
Or we create combo meal with different parameters (new Combo(,,,,,)) 

```java
if(type=="CHEESE")
burger = new CheeseBurger();
else if(type=="Veggie")
burger = new VegieBurger();
```
- This code is used in various places in application - code duplicacy
- Solution is to create Simple Factory class - move this code to 1 class
- But, every time we need to add new burger, class will change - open/closed principle violation
- Thirdly, any class requiring burger need to pass type - dependency inversion violation. Supply the
dependency to the class, rather than class passing the type and getting dependency.
- More classes, more complexity.

**Singleton Design Pattern**
At most one instance of that class exist at any point time, shared state, lazy loaded e.g logger
Also known as Anti-pattern as restricts to have only 1 object, global variable exposed,
does not satisfy SRP

**Builder Design Pattern**
Problem - If class has lots of parameters which are mandatory vs optional, its constructor will be
large or may be we have to define too many constructors. Plus when we pass paramters to constructor, 
it is not clear, which parameter to passed to which class param. Factory can't be implemented because then 
we need to create a lot of subclasses. Better way to pass each paratemer. What if new parameter is added, 
again we have to modify existing code.. Solution is Builder Pattern, from intial start stage to final
stage, at each step we build step by step.

**Prototype Design Pattern**
Problem - task of duplicating a complex object
produce clones of existing objects rather than constructing new instances from the ground up. 
Decide whether you need shallow copy or deep copy of the objects

**Adapter Design Pattern**
Problem solves compatibility between different classes. Take a wrapper class (adapter) around one of the class.
USB A (parent) --> USB C (target). Create a wrapper class that implements USB C (target) by wrapping around adaptee(USB A)
Means wrapper class has a USB A. Usecase - legacy systems, payment gateways
- Target Interface
- Adaptee (Existing class which does not implement target interface)
- Adapter - implements target interface, converts target interface calls to adaptee. from outside it behaves target interface
is working but internally adaptee calls work.


**Decorator Design Pattern**
Extending the behaviour of classes at run time. Favour composition over inheritance.
- Component -This is the abstract class or interface that both the abstract decorator and concrete component will implement/extend. 
This is how both the concrete components and the decorators become interchangeable.
UseCase - POS systems, middleware in web development
- Concrete Component - This is the concrete implementation which extends the component class and 
will provide an implementation to all the methods in the Component class. The methods can be altered by the decorators.
- Decorator - This is the base decorator class, which will be extended by the concrete decorators. It consists of a HAS-A reference to the Component class/interface.
- ConcreteDecorator -  The concrete decorators will be the ones providing a concrete implementation to the base abstract decorators. 
They can be added dynamically at runtime and they override the base decorators' behavior.


**Facacde Design Pattern**
the Facade is a structural pattern that presents a complicated collection of classes in a simplified manner. 
This allows clients easy access to the functionality of these classes.


**Strategy Design Pattern**
Defines family of algorithums that can be used as plug and play model. Change the behaviour at run time.
Inheritance is the solution when you have common features that are shared across subclasses. When a class has a behavior that can be realized in multiple ways,
the use of the strategy pattern is a good candidate solution.

**Observer Design Pattern**
Analogous to Pub/Sub model. Bunch of objects want some status/info from one publisher, rather than polling
publisher, better way is publisher send the details/status/info to each of observer.
This pattern provides loose coupling and inversion of control 

**State Pattern**
Achieve variable behaviour based on state, without need of if/else blocks.
The State pattern enables an object to change its behavior dynamically in response to change in of state. 
It achieves this by encapsulating state-specific behaviors into separate classes, each implementing a common State interface.
Here, Context class depends on State class. State class repsonsible for changing state of Context class.
So circular dependency if we add class parameters. So rather, Context -> HAS A State
& state class have function parameter of Context class.
