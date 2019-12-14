#!/bin/bash
docker-compose down
docker rmi user-service
mvn clean package
docker build -t user-service .
docker-compose up -d

