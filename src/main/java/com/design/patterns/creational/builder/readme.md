### Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## Examples and explanation:

- Imagine a character generator for a role-playing game. The easiest option is to let the computer create the character for you. If you want to manually select the character details like profession, gender, hair color etc. the character generation becomes a step-by-step process that completes when all the selections are ready.
- Allows you to create different flavors of an object while avoiding constructor pollution. Useful when there could be several flavors of an object. Or when there are a lot of steps involved in creation of an object.
- The builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping constructor anti-pattern.

## Cases when Builder could be used:

- The algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled
- The construction process must allow different representations for the object that's constructed

### Examples in java libraries:

- java.lang.StringBuilder
- java.nio.ByteBuffer as well as similar buffers such as FloatBuffer, IntBuffer and so on.
- java.lang.StringBuffer
- All implementations of java.lang.Appendable
- Apache Camel builders
- Apache Commons Option.Builder

