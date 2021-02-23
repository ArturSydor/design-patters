### Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

## Examples and explanation:

- First it should be noted that Prototype pattern is not used to gain performance benefits. It's only used for creating new objects from prototype instance.
- Remember Dolly? The sheep that was cloned! Lets not get into the details but the key point here is that it is all about cloning.
- Create object based on an existing object through cloning.
- The prototype pattern is a creational design pattern in software development. It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects.
- In short, it allows you to create a copy of an existing object and modify it to your needs, instead of going through the trouble of creating an object from scratch and setting it up.

## Cases when Prototype could be used:

**Use the Prototype pattern when a system should be independent of how its products are created, composed, represented and**
- When the classes to instantiate are specified at run-time, for example, by dynamic loading.
- To avoid building a class hierarchy of factories that parallels the class hierarchy of products.
- When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.
- When object creation is expensive compared to cloning.

### Examples in java:

- java.lang.Object#clone()
