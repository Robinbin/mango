#!/usr/bin/env groovy

properties(
	[
		buildDiscarder(
				logRotator(
						artifactDaysToKeepStr: '4',
						artifactNumToKeepStr: '2',
						daysToKeepStr: '15',
						numToKeepStr: '12'
				)
		),
		disableConcurrentBuilds()
	]
)

node {
    timestamps {
		stage('Checkout') {
			checkout([$class                           : 'GitSCM',
					  branches                         : [[name: '*/master']],
					  doGenerateSubmoduleConfigurations: false,
					  extensions                       : [[$class: 'CleanCheckout']],
					  submoduleCfg                     : [],
					  userRemoteConfigs                : [[url: 'https://github.com/Robinbin/mango.git']]])				
		}

		stage('Compile') {
			sh """
				cd mango-pom
				ls -all
				mvn clean compile
				"""			
		}

		stage('Test') {
			sh """
				cd mango-pom
				mvn test
				"""
		}

		stage('Sonar') {
			withSonarQubeEnv('My SonarQube Server') {
			sh """
				cd mango-pom
				mvn sonar:sonar
				"""
			}
			
			# -D sonar.projectKey=mango -D sonar.host.url=http://10.72.161.11:9001 -D sonar.login=30d89602c0b2437d2f3463e3364126fd5405b1d8
		}
		stage("Quality Gate") {
            timeout(time: 1, unit: 'HOURS') {
                waitForQualityGate abortPipeline: true
            }
        }

		stage('Clean') {
			sh """
				cd mango-pom
				mvn clean
				ls -all
				"""
		}
	}
}
