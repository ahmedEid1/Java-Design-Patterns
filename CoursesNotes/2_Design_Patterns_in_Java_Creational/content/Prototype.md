- [<<< Course Pages](../README.md)
---
# the prototype pattern
###### used when the type of object to create is determined bt a prototypical instance which is cloned to produce another instance 
###### used to get a unique instance of the same object

----
### Concepts :
- avoid costly creation
- avoid subclassing
- doesn't use `new`
- often utilize an interface
- implemented with a registry
    - the original object is created and then kept in the registry


#### Example
- `Java.lang.object.clone()`

### Design
- the pattern changes the way we call `new`
  - if object is expensive to create, and we could get what we need by coping the member variables
    - then use the prototype pattern
  

- implement the `clonable` interface
- each instance is unique in spite of being a copy


- costly construction is not handled by the client (not like the builder)
- can still utilize parameters for constructing if you need to  (not like the singleton)

----
#### what is the different between a deep and shallow copy ?
- a shallow copy thr immediate properties 
- a deep copy everything including the object referenced 
-----
![the prototype pattern](../media/3.PNG)

-----
- Note : `super.clone()` create a shallow copy
----
### code example
















---
- [<<< Course Pages](../README.md)
---