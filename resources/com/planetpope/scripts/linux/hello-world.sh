#!/bin/bash
# echo Hello $1. Today is $2.


rossjs=$1
if [ "$rossjs" = true ]; then
  echo "process the script for rossjs"
fi

rossconverters=$2
if [ "$rossconverters" = true ]; then
  echo "process the script for rossconverters"
fi

