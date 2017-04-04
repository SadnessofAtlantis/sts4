#!/bin/bash
set -e
workdir=`pwd`
sources=$workdir/sts4/vscode-extensions/$extension_id

cd sts4/vscode-extensions
./mvnw -DskipTests package

timestamp=`date +%s`
tarfile=${workdir}/out/mvn-cache-${timestamp}.tar.gz
tar -czvf ${tarfile} ${HOME}/.m2/repository