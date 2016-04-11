# slick-gen-example

## Setup DB

```
mysql -u root
create database slick_gen_example;
use slick_gen_example;
create table users (id bigint(20) not null auto_increment, name varchar(100) not null, primary key (id) );
exit;
```

## SBT

```
sbt slickCodegen
```

## Problem

```
[tsukaby@MY-PC slick-gen-example]% sbt slickCodegen
[info] Loading global plugins from /Users/tsukaby/.sbt/0.13/plugins
[info] Loading project definition from /Users/tsukaby/IdeaProjects/slick-gen-example/project
[info] Set current project to slick-gen-example (in build file:/Users/tsukaby/IdeaProjects/slick-gen-example/)
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
[info] Generate source code with slick-codegen: url=jdbc:mysql://localhost:3306/slick_gen_example, user=root
[info] Source code has generated in /Users/tsukaby/IdeaProjects/slick-gen-example/target/scala-2.11/src_managed/main/com/tsukaby/slick/Tables.scala
[success] Total time: 0 s, completed 2016/04/11 15:54:21


[tsukaby@MY-PC slick-gen-example]% cat /Users/tsukaby/IdeaProjects/slick-gen-example/target/scala-2.11/src_managed/main/com/tsukaby/slick/Tables.scala
cat: /Users/tsukaby/IdeaProjects/slick-gen-example/target/scala-2.11/src_managed/main/com/tsukaby/slick/Tables.scala: No such file or directory
```