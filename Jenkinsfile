pipeline {
  agent {
    docker {
      image 'gradle:jdk8-alpine'
    }

  }
  stages {
    stage('init') {
      agent {
        docker {
          image 'gradle:jdk8-alpine'
        }

      }
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