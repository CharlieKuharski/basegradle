pipeline {
  agent {
    docker {
      image 'gradle'
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