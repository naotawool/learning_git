node {
    stage 'Clone'
        git url: 'https://github.com/naotawool/learning_git.git'

    stage 'Build'
        timestamps {
            bat 'gradlew.bat clean build --info'
        }
}
