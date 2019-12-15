#!/bin/bash
docker-compose --compatibility down
docker rmi gateway-service
mvn clean package -P docker
docker build -t gateway-service .
docker-compose --compatibility up -d

