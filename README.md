[![Build Status](https://travis-ci.org/luizgustavocosta/robotic-mowers.svg?branch=master)](https://travis-ci.org/luizgustavocosta/robotic-mowers)

#Assumption
Maven installed in your machine

Java installed in your machine at least Java 8+

Knowledge about the robotic mowers movements, i.e Left Right Move and so on. 

#How to run
###Download the project 
Through the git clone  command ``git clone https://github.com/luizgustavocosta/robotic-mowers.git``

After the clone finish, type ```cd robotic-movers``` this is the directory of project

###Generate the executable
Inside you can execute the following command to ```mvn clean verify``` to generate the executable jar.

###Executing the program
Execute on your command the following .: ``java -jar target/costa-luiz-1.0-SNAPSHOT-jar-with-dependencies.jar `` and the program will start.

Every time you run the program you can choose the help option to know how to execute or run directly
###User interface
The user interface is build using the CLI, so pay attention for the correct use.
 * To start typing information regarding the upper-right coordinates of plateau, press the <ENTER> key
    * ![Test Image 1](imgs/clone.png)
 * The help is available on every launch program, to use type help
    * After use the help option and won't go ahead type exit


