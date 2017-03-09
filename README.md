# Host github for android studio using wagon-git:

## Integrate wagon-git:

###In library "build.gradle" file:

apply plugin: 'maven'

repositories {
    maven { url "https://raw.github.com/synergian/wagon-git/releases" }
}

configurations {
    deployLibrary
}

dependencies {
    deployLibrary "ar.com.synergian:wagon-git:0.3.0"
}

uploadArchives {

    repositories.mavenDeployer {
        configuration = configurations.deployLibrary
        repository(url: 'git:releases://git@github.com:reversecoder/rc-samplelibrary-androidstudio.git')
        snapshotRepository(url: 'git:snapshots://git@github.com:reversecoder/rc-samplelibrary-androidstudio.git')

        uniqueVersion = true

        pom.project {
            groupId = 'com.reversecoder.samplelibrary.androidstudio'
            version = '1.0.0-SNAPSHOT'
            artifactId = 'rc-samplelibrary-androidstudio'
            packaging 'aar'
        }
    }
}

## Deploy and upload archive:

1) Deploying command from project directory:
   ----------------------------------------

./gradlew clean build uploadArchives

2) Update gradlew permission:
   -------------------------

i) If "./gradlew: Permission denied" error is found, then run-

Either

chmod +x gradlew (on unix systems)

OR

git update-index --chmod=(+|-)x <file>

ii) Again run deploying command-

./gradlew clean build uploadArchives