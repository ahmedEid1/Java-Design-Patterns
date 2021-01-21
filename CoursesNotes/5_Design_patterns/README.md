- [<<< Home Page](../../README.md)
---

# Design pattern

### Benefits :
- you will not need to reinvent the wheel
- help  you build resilient code
- help you prepare for future additions 
----

#### Design principle :
- **Encapsulate what varies** 
    - identify the aspects of your application that changes and separate them from the ones that don't
---
- **Program to an interface not an implementations** 
    - clients remain unaware of the kind of objects they are using as long as the interface adhere to the interface the client expect 
---
- **Favor composition over inheritance**
  - classes should achieve code reuse using composition rather than inheritance from a superclass
  - this lead to more flexible design
---


### The Strategy Pattern
- define a family of algorithms 
  - encapsulate each one and make them interchangeable
    - this let the algorithms vary independent of the client that use them
![Strategy UML](media/1.PNG)
