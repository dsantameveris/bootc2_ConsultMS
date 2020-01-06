#This is the base.
FROM java:8

#This is the port.
EXPOSE 8020:8020

#No idea
ADD /target/ConsultServiceJar.jar ConsultServiceJar.jar

#No idea
ENTRYPOINT ["java", "-jar", "ConsultServiceJar.jar"]