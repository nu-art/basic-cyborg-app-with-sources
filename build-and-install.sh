#!/bin/bash

bash dev-tools/scripts/dev/android/build-and-install.sh \
                --app-name=your-apk-name \
                --package-name=com.your.app \
                --build=debug \
                --project=app \
                "$@"