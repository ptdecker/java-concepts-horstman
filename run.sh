#!/bin/bash
if [ -f "$1.java" ]; then
    javac $1.java
    if [ -f "$1.class" ]; then
        java $1
        rm $1.class
    else
        echo "Error: Could not run '$1.class' probably due to a complile error"
    fi
else
    echo "Error: File '$1.java' does not exist"
fi
