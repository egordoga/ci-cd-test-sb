pipeline {
    agent {
        docker {
            image 'maven:3.9-eclipse-temurin-21'
        }
    }

    stages {
        stage('Build1') {
            steps {
                sh 'mvn package'
            }
        }
    }
}