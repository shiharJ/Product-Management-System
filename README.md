Services

![image](https://github.com/shiharJ/Product-Management-System/assets/56840369/931ea27c-90be-4bf1-9770-ccb290a7d5e3)


Solution Architecture Diagram
![image](https://github.com/shiharJ/Product-Management-System/assets/56840369/c67a57d6-5b2d-44a5-a913-e2ff4c148a88)


Logical Architecture for each service
![image](https://github.com/shiharJ/Product-Management-System/assets/56840369/3e48f3d9-e58e-4d94-94f7-901175255d74)



- For write automated-integrated-test we use java library call "Test Container"


### Internal communication among services - MicroService Part 2

When communicate between services, it can be done Synchronous or Asynchronous.
Here Synchronous is relying on response,

![image](https://github.com/shiharJ/Product-Management-System/assets/56840369/b03b8a98-5ccf-40cb-9622-2bcef896cc94)


But when services in the cloud, It has dynamic IP addresses,
![image](https://github.com/shiharJ/Product-Management-System/assets/56840369/6d1f94ff-e150-4e4b-9c01-9fda973d3025)


So we are creating a discovery server for assign IP address initially for service and stores all the information of the services and do the communication,
![image](https://github.com/shiharJ/Product-Management-System/assets/56840369/73080ff5-2540-4181-a9d4-6a15c0ea61d3)

![image](https://github.com/shiharJ/Product-Management-System/assets/56840369/dfdcf80a-03e9-4661-96fe-f4839048f60f)


for discovery server we use netflix, eureka server as a dependancy

```xml

<dependencies>  
    <dependency>        
	    <groupId>org.springframework.cloud</groupId>  
        <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>  
    </dependency>
</dependencies>
    
```
