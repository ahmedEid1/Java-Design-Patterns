# <u>Design Patterns</u>
###### a solution to a problem in a context

----
### Table of content :
- understanding design patterns (Done)
- why are design patterns important?
- Behaviour Design Patterns
- Creational Design Patterns
- Structural Design Patterns
- other design patterns in java
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
    
Notes :
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
    - you should  define  fine-granted interfaces as specific for the client that is going to use them 
        - then you can use every small interface where you need it 
- Dependency Injection
    - high-level modules should not depend on low-level modules
        - both should depend on abstractions (interfaces and abstract classes)
------
- Don`t repeat yourself (DRY)
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
    1. purpose :
        - Creational (5):
            - provide a way to decouple the code that create the object from the object itself
        - Behavioural (11):
            - concerned with how objects interact and distribute responsibility 
        - Structural (7):
            - composing classes and objects to create new structure or functionality
    2. Scope :
        - class (4) :
            - how relation between classes are described via inheritance
        - object :
          - how relation between objects are described via composition
-------
- _**Note**_ :
    - composition is at runtime while inheritance is at compile time :
        - which make relation via composition more dynamic and flexible
    
------
-----
-----
-----
## <u> Why are Design Patterns important ?</u>

### why learn design patterns ?
- patterns capture expert knowledge
- patterns are reusable :
    - so you don`t need to solve a problem that someone already solve
- help you find the appropriate design 
- help you in documentations and communication 
    - because they provide shared vocabulary which is :
        - precise and complete
    
----
#### note :
- well-designed software is :
    - flexible
    - easy to maintain
    - reusable
    
- object-granularity :
    - what should be in the object.
    
---
---
### Example :
#### replacing inheritance with composition using _**the strategy pattern**_
- why ?
    - composition produce more flexible design
    
##  Strategy Pattern :
- Define a family of algorithms 
    - encapsulate each one and make them interchangeable 
 
----   
- _benefit_ : 
  - _**Lets the algorithm vary independent of the client that uses it**_
  
-----  
- usage :
    - swap out behaviour at run-time
    - change parts of the system independently of all other parts
    
-----
- the strategy pattern use the following principles :
    - encapsulate what changes
    - favour composition over inheritance
    - open-closed 
    - program to an interface
    
-----
### the Diagram :
![the strategy pattern](media/1.PNG)
---
#### Note :
- subClass explosion :
    - happen when the number of classes needed to add a functionality to the class hierarchy 
        - _Grows exponentially_ 


    

    
