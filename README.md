Services
![[Pasted image 20240330211937.png]]

Solution Architecture Diagram
![[Pasted image 20240330212018.png]]

Logical Architecture for each service
![[Pasted image 20240330212609.png]]


- For write automated-integrated-test we use java library call "Test Container"


### Internal communication among services - MicroService Part 2

When communicate between services, it can be done Synchronous or Asynchronous.
Here Synchronous is relying on response,

![Uploading image.png…]()


But when services in the cloud, It has dynamic IP addresses,
![[Pasted image 20240410030241.png]]

So we are creating a discovery server for assign IP address initially for service and stores all the information of the services and do the communication,
![[Pasted image 20240410030405.png]]
![[Pasted image 20240410030514.png]]

for discovery server we use netflix, eureka server as a dependancy

```xml

<dependencies>  
    <dependency>        
	    <groupId>org.springframework.cloud</groupId>  
        <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>  
    </dependency>
</dependencies>
    
```
