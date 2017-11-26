# Spring_Boot

[![Build Status](https://travis-ci.org/tanmoy281/Spring_Boot.svg?branch=master)](https://travis-ci.org/tanmoy281/Spring_Boot)

First of all install maven setup on the system.

~~Before building the projects, install sqljdbc jar file into local maven repository, as this artifact is not available in maven central repositories.~~

~~download sqljdbc4-4.0.jar from microsoft website. go to the directory where this jar is downloaded and open cmd. now run the below command:~~


~~mvn install:install-file -Dfile=sqljdbc4-4.0.jar -DgroupId=com.micosoft.sqlserver -DartifactId=sqljdbc4 -Dversion=4.0 -Dpackaging=jar~~

sqljdbc jar is now available in maven central repository, so no need to install it into local maven repository.

Build all the projects from /Spring_Boot directory by running the below command:

mvn clean install

Once build is successful, import all the projects into eclipse IDE and start further developement.

~~[Note: Before adding a new project into this github repository, run mvn eclipse:eclipse command to make it eclipse compatible(it adds java buid path entries into .classpath file)]~~
