# springboot-jib-helloworld
helloworld example with spring boot and jib

### build with jibDockerBuild
To build to a Docker daemon, use:

    ./gradlew jibDockerBuild

### build with jib
You can containerize your application easily with one command:

    ./gradlew jib --image=<MY IMAGE>
    
configuration, see https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin#configuration

### run

    docker run -d --rm -p 8080:8080 --name springboot-jib-helloworld springboot-jib-helloworld

### example

https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin#example

### see
[jib](https://github.com/GoogleContainerTools/jib)

[springboot example](https://github.com/GoogleContainerTools/jib/tree/master/examples/spring-boot)

[jib-gradle-plugin](https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin)
