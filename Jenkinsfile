pipeline {
    
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the Git repository
                git 'https://github.com/Sectani/Jenkins-Tutorial-Repo.git'
            }
        }
        stage('Build') {
            steps {
                // Here, we can can run Maven commands
                script {  
                    sh 'mvn clean test package --file simple-maven-project/pom.xml'
                    sh "java -jar simple-maven-project/target/*.jar"
                }                    
                   
            }
        }
    }

     post {
        success {
            slackSend(channel: '#Jenkins-Canal', color: 'good', message: "Build succeeded: ${env.JOB_NAME} [${env.BUILD_NUMBER}] (<${env.BUILD_URL}|Open>)")
        }
        failure {
            slackSend(channel: '#Jenkins-Canal', color: 'danger', message: "Build failed: ${env.JOB_NAME} [${env.BUILD_NUMBER}] (<${env.BUILD_URL}|Open>)")
        }
    }
    
}
