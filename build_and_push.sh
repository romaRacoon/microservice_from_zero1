mvn package
docker-compose -f compose-env.yaml up
docker build . -t romaracoon/cats-api:1.0.0
docker push romaracoon/cats-api:1.0.0