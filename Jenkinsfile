pipeline {
    agent any
    tools{
        maven 'Maven 3.8.6'
    }

    stages {
        stage('Build') {
            steps {
                withSonarQubeEnv(installationName: 'SonarQube'){
                    bat 'mvn clean install sonar:sonar'
                }
            }
            post{
                always{
                    echo 'Build Completed'
                }
                success{
                    echo 'Build Success'
                }
                failure{
                    echo 'Build Failed'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                bat 'mvn test'
            }
            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
                success{
                    echo 'Test Passed'
                }
                failure{
                    echo 'Test Failed'
                }
            }
        }
        stage('QualityGate'){
            steps{
                echo 'QualityGate...'
                timeout(time: 1, unit: 'MINUTES'){
                    waitForQualityGate abortPipeline: true
                }
            }
            post{
                always{
                    echo 'QualityGate Completed'
                }
                success{
                    echo 'QualityGate Success'
                }
                failure{
                    echo 'QualityGate Failed'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                deploy adapters: [tomcat9(credentialsId: '528b6d96-4aa9-469b-bbbf-308d07a02e58', path: '', url: 'http://localhost:8090')], contextPath: 'Group6', onFailure: false, war: '**/*.war' 
                }
            post{
                always{
                    echo 'Deploy Completed'
                }
                success{
                    echo 'Deploy Success'
                }
                failure{
                    echo 'Deploy Failed'
                }
            }
        }
    }
}