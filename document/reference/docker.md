# Docker Starter Guide

## Docker Image Common Commands
### Search Image
docker search java
### Download Image
- docker pull java:8
- docker pull macro/eureka-server:0.0.1
### List Images
docker images
### Delete Image
- docker rmi java
- docker rmi -f java 
- docker rmi -f $(docker images)

## Docker Container Common Commands
### New and Start Container
docker run -d -p 91:80 nginx
### List Containers
docker ps
### Stop Container
docker stop $ContainerId
### Forcing Stop Container
docker kill $ContainerId
Start a Stopped Container
docker start $ContainerId
### Enter Container
- docker inspect --format "{{.State.Pid}}" $ContainerId
- nsenter --target "$pid" --mount --uts --ipc --net --pid
### Delete Container
- docker rm $ContainerId
- docker rm -f $(docker ps -a -q)
### View the boot error log
docker logs $ContainerIdName (or $ContainerId)
### View container's IP address (172.17.0.*)
docker inspect --format '{{ .NetworkSettings.IPAddress }}' $ContainerId
Synchronize host time to container
docker cp /etc/localtime $ContainerName:/etc/
### Check docker usage cpu, memory, network, io on host
- View specified container case: docker stats $ContainerName
- View all container cases: docker stats -a
### into bash inside docker
docker exec -it $ContainerName /bin/bash

## Docker Registry
Docker Registry 2.0 Build
docker run -d -p 5000:5000 --restart=always --name registry2 registry:2
### Push to Private Repositories
docker push localhost:5000/macro/eureka-server:0.0.1
### Modifying Image Labels
docker tag macro/eureka-server:0.0.1 localhost:5000/macro/eureka-server:0.0.1

Build Docker Images Using maven
### Build Image
- command：mvn clean package docker:build
- tip：
Linux server requires remote api: vi /usr/lib/systemd/system/docker.service
Modified to: ExecStart=/usr/bin/dockerd -H tcp: //0.0.0. 0:2375 -H unix: //var/ run/docker.sock
### Push image to private repository
- command：mvn clean package docker:build -DpushImage
- tip：
pom.xml modification<imageName>192.168.1. 71:5000 /macro/$ {project.artifactId}: $ { project.version}</imageName>
- tip：
docker to support http:echo '{“insecure-registries”: ["39.98.190. 128:5000 “]} '> /etc/docker/daemon.json
Modifying Docker Image Storage Location
1. Check where Docker is stored: docker info | grep “Docker Root Dir” (default is /var/lib/ docker)
2. Close Docker service: systemctl stop docker
3. Move directory to target path: mv /var/lib/docker /root/data/docker
4. Establish soft connection: ln -s /root/data/docker /var/lib/docker

## Docker compose
### Installation
1. Download address: https://github.com/docker/compose/releases
2. Installation address: /usr/local/bin/docker-compose
3. Set to executable: sudo chmod +x /usr/local/bin/docker-compose
4. Test if the installation was successful: docker-compose —version

### Install Command Completion Tool
sudo curl -L https://raw.githubusercontent.com/docker/compose/1.22.0/contrib/completion/bash/docker-compose -o /etc/bash_completion.d/docker-compose

### Common Commands
- Build, create, launch related containers: docker-compose up
- List all containers: docker-compose ps
- Delete container for specified service: docker-compose rm eureka
- dynamic expansion of containers: docker-compose scale eureka=3
- Stop related containers: docker-compose stop eureka
- Launch related container: docker-compose start eureka

### Orchestration of SpringCloud Microservices
Works used by ####
- eureka-server
- hello-service
- feign-consumer
- api-gateway
#### Orchestration Mode
1. Arranging SpringCloud microservices: see eureka-server/docker-res/docker-compose.yml
2. Simplify SpringCloud microservice orchestration: see eureka-server/docker-res/docker-compose- simple.yml
3. Arrange highly available registration centers: see eureka-server/docker-res/docker-compose-eureka.yml
