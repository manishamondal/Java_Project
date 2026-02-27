pipeline {
    agent any 

    tools {
        maven 'LocalMVN'   // must match exactly what you configured
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'new', url: 'https://github.com/manishamondal/Java_Project.git'
            }
        }

        stage('Verify Tools') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
             post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            steps {
                bat 'if exist jenkins\\scripts\\deploy.bat call jenkins\\scripts\\deploy.bat'
            }
        }
       stage('Install') {
            steps {
               bat 'java -jar target\\dummy-java-project-1.0-SNAPSHOT.jar'
            }
        }  
    }
}
