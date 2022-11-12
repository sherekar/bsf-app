# bsf-app

BSF Backend Application

## Reference Documentation

* Swagger URL: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

#### Project Setup
```sh
sudo systemctl start docker
mvn clean package
sudo docker build -t bsf-app:1.0 .
sudo docker run -d -p 8080:8080 -t bsf-app:1.0
```

### Debug/Monitor
```sh
sudo docker ps
docker inspect <container_id>
docker logs <container_id>
sudo docker stop <container_id>
```