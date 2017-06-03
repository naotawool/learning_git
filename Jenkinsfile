node {
    // Git から Clone
    stage 'Clone'
        git(url: 'https://github.com/naotawool/learning_git.git', branch: 'develop', poll: true)

    // ビルド
    stage 'Build'
        timestamps {
            bat 'gradlew.bat clean build --info'
        }
}
