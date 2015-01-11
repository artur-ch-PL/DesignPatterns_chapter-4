# Factory patterns

=
Oriented Object Principle
=
Depend on abstraction. DO NOT DEPEND on concrete classes

=
Abstract Factory
=
Provide an interface for creating families related or dependent objects without specifying their concrete classes.

=
Factory Method
=
Define an interface for creating an object, but let subclasses decide with class to instantiate. 
Factory Method lets a class defer instatiation to the subclasses.

=
In short
=
- all factories encapsulate object creation
- Simply Factory, is not a design pattern, it is a simple way to decouple yours clients from concrete classes
- Factory Method relies on inheritence: object creation is delegated to subclasses which implement the factory method to create object
- Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface 
- All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes
- The intent of Factory Method is to allow a class to defer instantiation to its sublcasses
- The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes
- Factories are powerful technique for coding to abstractions, not concrete classes

