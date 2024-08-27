#!/usr/bin/env bash

file=keystore.p12
if [ -f $file ]; then
  echo "File already exists"
else
  keytool \
     -dname "CN=test, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown" \
     -genkey -keyalg RSA -alias selfsigned \
     -storetype PKCS12 -keystore $file \
     -storepass password -validity 9999 -keysize 2048 \
     -ext SAN=dns:localhost,ip:127.0.0.1,ip:::1
fi