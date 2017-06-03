node {
    stage 'Clone'
        checkout scm

    stage 'Build'
        timestamps {
            bat 'gradlew.bat clean build --info'
        }
}
