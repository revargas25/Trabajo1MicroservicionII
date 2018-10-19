############# TALLER 1 - TAREA 2

FROM mysql:5.6

# ROOT PASSWORD
ENV MYSQL_ROOT_PASSWORD=passw0rd

#ENV MYSQL_DATABASE=sampledb
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=passw0rd


#ENV MYSQL_DATA_DIR=/var/lib/mysql \
#    MYSQL_RUN_DIR=/run/mysqld \
#    MYSQL_LOG_DIR=/var/log/mysql

COPY setup.sh /mysql/setup.sh
COPY setup.sql /mysql/setup.sql
RUN /mysql/setup.sh

ADD ["/vol/DockerTestDB.sql", "/tmp/DockerTestDB.sql"]

#RUN /var/run/mysqld start \
#         mysql -u root -p$MYSQL_ROOT_PASSWORD  -e "GRANT ALL PRIVILEGES ON *.* TO 'comeon'@'%' IDENTIFIED BY 'password';FLUSH PRIVILEGES;" \
#        mysql -u root -p${MYSQL_ROOT_PASSWORD}  < /tmp/DockerTestDB.sql

#PORT
EXPOSE 3306