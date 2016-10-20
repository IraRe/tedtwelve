docker network create private_network
docker network connect private_network mysql

docker run --name ted -p 8080:8080 --network=private_network tedtwelve/twelve