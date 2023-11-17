pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Rudalf/covid-api.git'
            }
        }

        stage('Build&Push') {
            steps {
                sh 'docker build -t myapp .'
                sh 'docker push myapp:latest'
            }
        }
    }
}
