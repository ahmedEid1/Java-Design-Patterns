
[<<< Course Page](../README.md)
-----

## Understanding Design Patterns
_**Definition**_ :
- _**a reusable and named solution to a recurring problem in a context**_
---
1. Context :
    - the situation in which the pattern applied

2. problem :
    - what are you trying to achieve and any constrains of the context

3. Solution :
    - what solve the problem in that context

###### Notes :
- a pattern needs to be applied to a recurring problem
- the solution needs to be reusable
---------------------------
### OOP Building Blocks :
1. abstraction
2. encapsulation
3. inheritance
4. polymorphism

### OOP Principles (SOLID):
- Single Responsibility :
    - a class should only do one thing
      - which give it only one reason to change
- Open-Closed :
    - a class should be open for extensions and closed for modifications
- Liskov substitutions :
    - you can substitute your base class with any of its subClasses without errors
- interface segregation :
    - you should  define  fine-granted interfaces as specific as possible for the client that is going to use them
        - then you can use every small interface where you need it
- Dependency Injection :
    - high-level modules should not depend on low-level modules
        - both should depend on abstractions (interfaces and abstract classes)
------
#### Tips
- Don't repeat yourself (DRY)
- Encapsulate what changes
- Favor composition over inheritance
- program to an interface not an implementation
----
----

### you can consider :
- Principles `as` low-level
- Patterns `as` high-level
-----

### Pattern Classifications
- Patterns are classified by :
    1. __purpose__ :
        - **Creational** (5):
            - provide a way to decouple the code that create the object from the object itself
        - **Behavioural** (11):
            - concerned with how objects interact and distribute responsibility
        - **Structural** (7):
            - composing classes and objects to create new structure or functionality
    2. __Scope__ :
        - class (4) :
            - relations between classes are described via inheritance
        - object :
            - relations between objects are described via composition
-------
- _**Note**_ :
    - composition is at _runtime_ while inheritance is at _compile time_ :
        - which make relation via composition more dynamic and flexible

------

[<<< Course Page](../README.md)
-----
