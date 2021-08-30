# springboot-jib-helloworld
helloworld example with spring boot and jib

### build with jibDockerBuild
To build to a Docker daemon, use:

    ./gradlew clean
    ./gradlew jibDockerBuild

### build with jib
You can containerize your application easily with one command:

    ./gradlew jib --image=<MY IMAGE>
    
configuration, see https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin#configuration

### run

`    docker run -d --rm -p 8080:8080 --name springboot-jib-helloworld springboot-jib-helloworld
`
### example

https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin#example

### helm build w/ kind
1) `kind create cluster` (if not existent)
2) `./gradlew clean`
3) `./gradlew jibDockerBuild`
4) `docker tag springboot-jib-helloworld <container repo>/springboot-jib-helloworld`
5) `docker push <container repo>/springboot-jib-helloworld:latest`
6) Set hellojib/values.yaml to point at above container location. 
7) 
    `
### see
[jib](https://github.com/GoogleContainerTools/jib)

[springboot example](https://github.com/GoogleContainerTools/jib/tree/master/examples/spring-boot)

[jib-gradle-plugin](https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin)
