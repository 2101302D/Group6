pipeline {
    agent any
    tools{
        maven 'Maven 3.8.6'
    }

    stages {
        stage('Build') {
            steps {
                bat label: 'Building Project', script: '''
                    @echo 
                    echo 'Building...'
                    mvn clean install -Dmaven.test.skip=true
                '''
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
         stage('Scan to Sonarqube'){
            steps{
                echo 'Scanning to Sonarqube...'
                bat 'mvn sonar:sonar'
            }
            post{
                always{
                    echo 'Scan Completed'
                }
                success{
                    echo 'Scan Success'
                }
                failure{
                    echo 'Scan Failed'
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