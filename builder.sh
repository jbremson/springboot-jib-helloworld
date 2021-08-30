REPO_LOC='jbremson'
echo "Did you login to the container repo???"
./gradlew clean
./gradlew jibDockerBuild
docker tag springboot-jib-helloworld:latest "$REPO_LOC"/springboot-jib-helloworld
docker push "$REPO_LOC"/springboot-jib-helloworld:latest
helm install hellojib-chart hellojib
echo "Follow the instructions from helm to access the app."