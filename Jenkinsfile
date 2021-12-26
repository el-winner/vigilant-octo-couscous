pipeline {
  
  agent any
  
  stages {
    
    stage("build") {
      
      steps {
        echo 'building the application...'
        echo 'Application built...'
        withMaven(maven = 'Maven-3.8.4') {
          sh 'mvn clean install'
        }
      }
    }
    stage("test") {
      
      steps {
        echo 'testing the application...'
      }
    }
    stage("deploy") {
      
      steps {
        echo 'deploying the application...'
      }
    }
  }
}
