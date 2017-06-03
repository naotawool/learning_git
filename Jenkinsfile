node {
    stage 'Clone'
        git url: 'https://github.com/naotawool/learning_git.git'
        checkout scm

    stage 'Build'
        timestamps {
            bat 'gradlew.bat clean build --info'
        }
}
