#!/bin/bash

if [ $# -eq 0 ]; then
    echo "Please provide the name of the new app directory"
    exit 1
fi

NEW_APP_DIR="$1"

mkdir "$NEW_APP_DIR"
cp -r app gradle .gitignore build.gradle gradle.properties gradlew gradlew.bat settings.gradle "$NEW_APP_DIR"
