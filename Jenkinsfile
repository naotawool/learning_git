node {
    // Git から Clone
    stage 'Clone'
        checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/naotawool/learning_git.git']]]

    // ビルド
    stage 'Build'
        timestamps {
            bat 'gradlew.bat clean build --info'
        }
}
