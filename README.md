# Deploying command from project directory:

./gradlew clean build uploadArchives

## Update gradlew permission:

If "./gradlew: Permission denied" is found, then run-

Either

chmod +x gradlew (on unix systems)

OR

git update-index --chmod=(+|-)x <file>
