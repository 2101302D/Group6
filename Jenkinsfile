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
                    mvn package -Dmaven.test.skip=true
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

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                deploy adapters: [tomcat9(credentialsId: 'b0fd7704-8d8f-4190-b9fc-6e7b2aefc1b9', path: '', url: 'http://localhost:8090')], contextPath: 'Group6', onFailure: false, war: 'target/*.war'    
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