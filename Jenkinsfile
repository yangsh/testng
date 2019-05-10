pipeline {
    agent any

    tools {
        maven 'mvn-3.6.1'
    }

    stages {
        stage('test') {
            steps {
                sh "mvn test"
            }
        }
    }

    post {
            always {
                step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
            }
    }

}