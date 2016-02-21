#!/bin/bash
USAGE="Usage: cowrie [start/stop]"
INFO="Cowrie - Configuration file: /usr/share/cowrie/cowrie.cfg"

echo "$INFO"
if [[ "$1" = "start" ]]; then
	/usr/share/cowrie/start.sh
elif [[ "$1" = "stop" ]]; then
	/usr/share/cowrie/stop.sh
else
	echo "ERROR: Invalid argument"
	echo "$USAGE"
	exit -1
fi
exit 0
