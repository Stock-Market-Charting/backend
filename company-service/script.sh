#!/bin/bash
docker-compose down
docker rmi company-service
mvn clean package
docker build -t company-service .
docker-compose up -d

