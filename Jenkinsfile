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
                deploy adapters: [tomcat9(credentialsId: '96566973-c3be-4e36-92af-9173d0a2496a', path: '', url: 'http://localhost:8090')], contextPath: "Group6", onFailure: false, war: 'target/*.war'            
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