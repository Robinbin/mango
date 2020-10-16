#!groovy
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class                           : 'GitSCM',
                          branches                         : [[name: '*/master']],
                          doGenerateSubmoduleConfigurations: false,
                          extensions                       : [],
                          submoduleCfg                     : [],
                          userRemoteConfigs                : [[url: 'https://github.com/Robinbin/mango.git']]])
            }
        }

        stage('Clean') {
            steps {
                sh "mvn clean"
            }
        }

        stage('Compile') {
            steps {
                sh "mvn compile"
            }
        }

        stage('Test') {
            steps {
                sh "mvn test"
            }
        }

        stage('Sonar Check') {
            steps {
                sh "mvn sonar:sonar -Dsonar.projectKey=mango -Dsonar.host.url=http://localhost:9001 -Dsonar.login=1877428d8135046181ae8571157e5ce69b38b004\n"
            }
        }

        stage('Clean') {
            steps {
                sh "mvn clean"
            }
        }
    }
}
