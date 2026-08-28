pipeline {
    agent {
        docker {
            image 'maven:3.9-eclipse-temurin-21'
        }
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
    }
}