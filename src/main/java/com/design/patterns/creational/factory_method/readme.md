### Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Examples and explanation:

- Blacksmith manufactures weapons. Elves require Elvish weapons and orcs require Orcish weapons. Depending on the customer at hand the right type of blacksmith is summoned.
- It provides a way to delegate the instantiation logic to child classes.
- In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method — either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

## Cases when Factory Method could be used:

- Class cannot anticipate the class of objects it must create.
- Class wants its subclasses to specify the objects it creates.
- Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate.

### Examples in java libraries:

- java.util.Calendar#getInstance()
- java.util.ResourceBundle#getBundle()
- java.text.NumberFormat#getInstance()
- java.nio.charset.Charset#forName()
- java.net.URLStreamHandlerFactory#createURLStreamHandler(String) // return different objects based on protocol
- java.util.EnumSet#of()
- javax.xml.bind.JAXBContext#createMarshaller() 
