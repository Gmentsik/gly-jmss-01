FROM jboss/wildfly

ADD ./target/jmss.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080