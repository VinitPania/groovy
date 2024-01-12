#!bin/bash

# Get the latest tag (considering both annotated and lightweight tags)
latest_tag=$(git describe --tags --abbrev=0 --always)

# Generate release notes using commit messages since the last release
release_notes=$(git log --oneline --pretty=format:"%s" ${latest_tag}..HEAD)

# Print or save the release notes to a file
echo "$release_notes" > release_notes.txt
