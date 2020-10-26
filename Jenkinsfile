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

        stage('Compile') {
            steps {
                sh """
					cd mango-pom
					ls -all
					mvn clean compile
					"""
            }
        }

        stage('Test') {
            steps {
				sh """
					cd mango-pom
					mvn test
					"""
            }
        }

        stage('Sonar Check') {
            steps {
                sh """
					cd mango-pom
					mvn sonar:sonar -D sonar.projectKey=mango -D sonar.host.url=http://localhost:9001 -D sonar.login=30d89602c0b2437d2f3463e3364126fd5405b1d8
					"""
            }
        }

        stage('Clean') {
            steps {
                sh """
					cd mango-pom
					mvn clean
					ls -all
					"""
            }
        }
    }
}
