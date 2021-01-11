- [<<< Course Pages](../README.md)
---
# The Proxy Pattern
###### a replacement for a real object


## When to use it ?
- representing large objects in a GUI
- representing expensive database operations
- Authenticating access 
---

- Virtual Proxy improve performance and save memory
---
## How to implement ?
- create a proxy class that do the expensive operations only when it is needed
- use proxy objects instead of the real one
    - create the real object only when you need it 
        - also store it and use it instead of recreating it  

---
- [<<< Course Pages](../README.md)
---