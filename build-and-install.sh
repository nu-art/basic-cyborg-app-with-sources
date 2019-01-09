#!/bin/bash

bash dev-tools/scripts/dev/build-and-install.sh \
                --package-name=com.your.app \
                --build=debug \
                --project=app \
                "$@"