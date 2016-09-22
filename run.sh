#!/bin/bash
TIMESTAMP="$(date)";


#if [ "$1" = "gulp" ]
#then
#cd frontend/
#gulp serve
#fi

sleep 3
echo "Killing the process"
echo "$TIMESTAMP Right before killing the processes" >> gamedayproject

#kill -9 $(lsof  -i:8080)
PID=(`ps -ef | grep java | grep catalina | awk '{print $2}'`)

kill -9 $PID

echo "$TIMESTAMP Rebuild project" >> gamedayproject

mvn clean install;

mvn -P cargo.run;




