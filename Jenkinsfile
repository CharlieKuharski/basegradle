pipeline {
  agent {
    docker {
      image 'appuio/s2i-gradle-java'
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