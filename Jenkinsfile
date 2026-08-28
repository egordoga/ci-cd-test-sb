pipeline {

    agent none

    stages {

        stage('Build') {
            agent {
                docker {
                    image 'maven:3.9-eclipse-temurin-21'
                }
            }

            steps {
                sh 'mvn package'
                stash name: 'jar', includes: 'target/*.jar'
            }
        }

        stage('Archive') {
            agent any

            steps {
                unstash 'jar'
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage('Docker Build') {
            agent any

            steps {
                unstash 'jar'
                sh 'docker build -t cd-ci-test:latest .'
            }
        }
    }
}