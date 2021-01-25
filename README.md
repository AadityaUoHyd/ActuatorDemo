## Demo code for, How to create custom endpoint for our application: 

Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. 
It uses HTTP endpoints or JMX beans to enable us to interact with it. Once this dependency is kept the classpath, several endpoints 
are available for us out of the box.

Hit these url to find values of..

http://localhost:9090/actuator  
http://localhost:9090/actuator/info (for static data) 
http://localhost:9090/actuator/mappings  
http://localhost:9090/actuator/beans  
http://localhost:9090/actuator/release-notes  
http://localhost:9090/actuator/release-notes/version-1.0  
