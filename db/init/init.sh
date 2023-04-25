#!/bin/bash

# create database
mysql -u root -proot -e "DROP DATABASE IF EXISTS sampleDB; CREATE DATABASE sampleDB;"

# create tables
mysql -u root -proot sampleDB < "/docker-entrypoint-initdb.d/sql/create-tables.sql"

# inport data
mysql -u root -proot sampleDB < "/docker-entrypoint-initdb.d/sql/data/person.sql"