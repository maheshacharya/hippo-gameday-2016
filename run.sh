#!/bin/bash
TIMESTAMP="$(date)";


#if [ "$1" = "gulp" ]
#then
#cd frontend/
#gulp serve
#fi

sleep 3
echo "Killing the process"
echo "$TIMESTAMP Right before killing the processes" >> /var/log/gamedayproject

#kill -9 $(lsof  -i:8080)
PID=(`ps -ef | grep java | grep catalina | awk '{print $2}'`)

kill -9 $PID

echo "$TIMESTAMP Rebuild project" >> /var/log/gamedayproject

mvn clean install -pl site;

sleep 1

while [ ! -f site/target/site.war ]
do
  sleep 2
done

mvn -P cargo.run;




