#!/usr/bin/env just --justfile

clean:
    sbt clean

bsp-install:
    sbt bloopInstall

setup-ide: bsp-install
