pipeline {
  agent {
    docker {
      image 'gradle:jdk8-alpine'
      args 'sdf'
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
        echo 'inititalize!!!!iuggyug'
      }
    }
  }
}