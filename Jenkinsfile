pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    
    evironment {
        SERVER_PORT = '8081'   
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                  junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deploy') { 
            steps {
                echo $SERVER_PORT
            }
        }
    }
}
