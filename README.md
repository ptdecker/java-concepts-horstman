# Java Concepts Problems and Projects

## Introduction

This repository contains selected programming exercise and project solutions from [Cay Horstmann's "Java Concepts", 6th Edition](http://amzn.com/0470509473).  This sixth edition is out of date.  The newest seventh addition is [Java Concepts: Early Objects](http://amzn.com/111843112X) and I have not worked these problems since they are probably in active classroom usage.  If you're looking for a good non-textbook introduction to Java, you might try the excellent [Head First Java](http://amzn.com/0596009208).

Cay also maintains [his on GitHub repository](https://github.com/cayhorstmann). And, there seems to be [a fairly good number](https://github.com/search?q=cay+horstmann) of other GitHub repositories in the style of this one.

## Status

So far I'm about half-way through Chapter 2 with a long ways to go still.  I work these every now and then as puzzles and to try and maintain the elusive GitHub checkin streak.

## Getting Started

The following instructions are written assuming you are using either Linux or Apple OS X operating systems.  If you're using Windows, you'll have to adapt.

Also, to keep things very basic, these solutions were created using a simple text editor as opposed to an Integrated Development Environment (or "IDE") such as IntelliJ, Eclipse, NetBeans, or BlueJ.  If you are using an IDE, you'll want to open these problems and run them using whatever method is appropriate for your particular IDE.

## Compiling

To compile an exercise solution:

    $ javac <chapter>/<exercise>.java

Where  "&lt;chapter&gt;" is replaced by the name of the chapter and "&lt;exercise&gt;" is replaced by the name of the exercise. Chapters are named "Chapter01", "Chapter02", etc.  Exercises are generally named along the lines of "P01d01" for exercise "P1-1". Note the leading zero for exercises and chapters 1 through 9. This is done so that the files sort nicely in your file list. The exception to this general rule is when the exercise gives you a specific name to use. For example, exercise P1.3 instructs you to call your program "FacePrinter".  Projects are named along the lines of "Project1d01"

Compiling will create the "&lt;exercise&gt;".class file in the "&lt;chapter&gt;" directory that you will need to run your program.

## Running

Once compiled, to run your exercise use:

    $ java -cp <chapter> <exercise>

## Cleaning

After you have run your exercise, you'll probably want to delete the class file:

    $ rm <chapter>/<exercise>.class

## Script

If you're using Linux or Mac OS X, there is a script you can run that will compile, run your program, then clean up the created class file:

    $ ./run.sh <chapter> <exercise>

## A Note on License and Copyright

The Creative Commons 1.0 license associated with this repository only applies to the code contained in the repository.  The problems themselves are from Mr. Horstmann's excellent learning text and are subject to licensing and restrictions in that publication (ISBN 978-0-470-57878-0).  My solutions and adaptations to these problems are of my crafting and are in no way official solutions to Mr. Horstmann's text.  I believe that quotes from Mr. Horstmann's text within the source code comments is covered under fair use laws.  I highly recommend that you support Mr. Horstmann and the exceptionally excellent Wiley publishing company by purchasing a copy of the textbook--you're learning experience will be greatly diminished without it.
