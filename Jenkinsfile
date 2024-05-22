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
                    
                    def currentDir = pwd()
                    echo "Current directory: ${currentDir}"
                    
                    // Navigate to the directory containing the Maven project
                   // dir('java-maven/maven') {
                        // Run Maven commands
                     //   sh 'mvn clean test package'
                       // sh "java -jar target/maven-0.0.1-SNAPSHOT.jar"
                }                    
                   
            }
        }
        stage('Slack') {
            steps {
                slackSend(message: "Build succeeded: ${env.JOB_NAME} [${env.BUILD_NUMBER}] (<${env.BUILD_URL}|Open>)")
            }
        }
    }
}
