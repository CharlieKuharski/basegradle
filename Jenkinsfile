pipeline {
  agent {
    docker {
      image 'gradle:jdk8-alpine'
    }

  }
  stages {
    stage('init') {
      steps {
        echo 'inititalize!!!!'
      }
    }
    stage('build') {
      steps {
        echo 'Docker build'
      }
    }
  }
}