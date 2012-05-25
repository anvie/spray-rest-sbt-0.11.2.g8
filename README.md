Spray, Akka, MongoDB, and SBT 0.11.2 project
==============================================

[g8](http://github.com/n8han/giter8) This is a bare bones REST template implemented using the [Spray](http://spray.cc) framework on top of Akka.  Persistence is handled with [MongoDB](http://mongodb.com).

Included [sbt-eclipse](https://github.com/typesafehub/sbteclipse) for generating eclipse project.
And [sbt-idea](https://github.com/mpeltonen/sbt-idea) for generating IntelliJ project.

Usage
------

Install giter8 (g8) - [readme](http://github.com/n8han/giter8#readme) for more information.

Install SBT 0.11.X - [Setup](https://github.com/harrah/xsbt/wiki/Setup) for more information.

Install MongoDB - [Setup](http://www.mongodb.org) for more information.

In a shell, run the following:

    g8 anvie/spray-rest-sbt-0.11.2.g8
    cd <name-of-app>
    sbt
    > update
    > container:start
    
You should be able to browse to a access a JSON body for your resource with 'curl -vv localhost:8080/$resourceName$'

If you see any error like "...must specify akka.mode bla... bla.. bla...", just export AKKA_MODE=dev (for development mode)
or specify akka.mode as java parameter.

To create Eclipse project:

    $ sbt eclipse

To create IntelliJ Idea project:

    $ sbt gen-idea



