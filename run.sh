#!/bin/bash
if [ -f "./$1/$2.java" ]; then
    javac ./$1/$2.java
    if [ -f "./$1/$2.class" ]; then
        java -cp ./$1 $2
        rm ./$1/$2.class
    else
        echo "Error: Could not run '$2.class' probably due to a complile error"
    fi
else
    echo "Error: File '$2.java' does not exist in the '$1' chapter folder"
fi
