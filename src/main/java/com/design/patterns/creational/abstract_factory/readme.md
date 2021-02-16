### Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## Examples and explanation:

- To create a kingdom we need objects with a common theme. Elven kingdom needs an Elven king, Elven castle and Elven army whereas Orcish kingdom needs an Orcish king, Orcish castle and Orcish army. There is a dependency between the objects in the kingdom.

- A factory of factories; a factory that groups the individual but related/dependent factories together without specifying their concrete classes.

- The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes

## Cases when Abstract Factory could be used:

- The system should be independent of how its products are created, composed and represented
- The system should be configured with one of multiple families of products
- The family of related product objects is designed to be used together, and you need to enforce this constraint
- You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
- The lifetime of the dependency is conceptually shorter than the lifetime of the consumer.
- You need a run-time value to construct a particular dependency
- You want to decide which product to call from a family at runtime. 
- You need to supply one or more parameters only known at run-time before you can resolve a dependency.
- When you need consistency among products
- You don’t want to change existing code when adding new products or families of products to the program.

### Real life examples

- Selecting to call to the appropriate implementation of FileSystemAcmeService or DatabaseAcmeService or NetworkAcmeService at runtime.
- Unit test case writing becomes much easier
- UI tools for different OS

### Examples in java libraries:

- javax.xml.parsers.DocumentBuilderFactory#newInstance()

- javax.xml.transform.TransformerFactory#newInstance()

- javax.xml.xpath.XPathFactory#newInstance()



## Possible cons:

- Dependency injection in java hides the service class dependencies that can lead to runtime errors that would have been caught at compile time.
- While the pattern is great when creating predefined objects, adding the new ones might be challenging.
- The code becomes more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.


