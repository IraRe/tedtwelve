#Create Docker Container.
docker build -t apache .
# param "-p 9999:80" Port forwarding local port 9999 to docker port 80.
# param "ted12Apache" container name.
# param "apache" image name.
# Address: http://192.168.99.100:9999/
docker run -p 9999:80 -dit --name ted12Apache apache