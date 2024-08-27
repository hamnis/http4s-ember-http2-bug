#!/usr/bin/env just --justfile
set shell := ["bash", "-c"]

clean:
    sbt clean

bsp-install:
    sbt bloopInstall

setup-ide: bsp-install

create-self-signed-cert:
    ./generate-self-signed-cert.sh

export-cert: create-self-signed-cert
    openssl pkcs12 -in keystore.p12  -nokeys -out cert.pem
export-key: create-self-signed-cert
    openssl pkcs12 -in keystore.p12  -nodes -nocerts -out key.pem