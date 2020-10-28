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
				junit '**/target/surefire-reports/*.xml'
			}
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
