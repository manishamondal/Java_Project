pipeline {
    agent any 
    tools {
        // Ensure Maven and JDK are pre-configured in Jenkins Global Tool Configuration
        maven 'LocalMVN'
        jdk 'Java_17'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(
                    branches: [[name: 'main']], 
                    userRemoteConfigs: [[url: 'https://github.com/manishamondal/Java_Project.git']]
                )
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    // Archives the JUnit test results so they can be viewed in the Jenkins UI
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
      
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
				sh 'chmod +x jenkins/scripts/deploy.sh'
                sh './jenkins/scripts/deploy.sh' 
            }
        }
    }
    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Build and deployment succeeded!'
        }
        failure {
            echo 'Build or deployment failed.'
        }
    }
}