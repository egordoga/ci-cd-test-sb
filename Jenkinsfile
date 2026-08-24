pipeline {
    agent {
        docker {
            image 'maven:3.9-eclipse-temurin-21'
        }
    }

    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}