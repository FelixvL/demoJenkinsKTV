pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

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
        sh 'ls -la'
        sh 'chmod 100 deployscript.sh'
        sh './deployscript.sh'
      }
    }
  }
  environment {
    SERVER_PORT = '8081'
  }
}
