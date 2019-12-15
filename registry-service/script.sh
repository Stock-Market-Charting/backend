#!/bin/bash
docker-compose --compatibility down
docker rmi registry-service
mvn clean package
docker build -t registry-service .
docker-compose --compatibility up -d

