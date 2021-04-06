### Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Examples and explanation:

- There is an angry troll living in the nearby hills. Usually it goes bare handed but sometimes it has a weapon. To arm the troll it's not necessary to create a new troll but to decorate it dynamically with a suitable weapon.
- Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator class.
- In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.

## Cases when Decorator could be used:

- Add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
- For responsibilities that can be withdrawn.
- When extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing.


### Examples in java:

- java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer 
- java.util.Collections#synchronizedXXX()
- java.util.Collections#unmodifiableXXX()
- java.util.Collections#checkedXXX()
