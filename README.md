# BYOC - Bring Your Own Container

Slides of the JavaLand 2015 talk on containerless applications and
the [Backset](https://github.com/chkal/backset).

## Slides

Just open the following file in your browser:

    slides/index.html

## Demo

The demo application is located in the `todo` directory. Just run the Maven build and
then execute the resulting JAR file.

    $ cd todo
    $ mvn clean package
    $ java -jar target/todo.jar

Now you can open your browser and point it to:

    http://localhost:8080/index.jsf

To use a custom configuration file, refer to it using the first command line argument like this:

    $ java -jar target/todo.jar config.yml

For more information about Backset, refer to the
[GitHub repository](https://github.com/chkal/backset) and especially the
[README.md](https://github.com/chkal/backset/blob/master/README.md).