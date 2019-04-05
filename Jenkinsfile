pipeline {
  agent any
  stages {
    stage('init') {
      agent {
        docker {
          image 'gradle:jdk8-alpine'
        }

      }
      steps {
        echo 'inititalize!!!!iuggyug'
        sh 'gradle clean build'
      }
    }
  }
}