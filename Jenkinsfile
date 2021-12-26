pipeline {
  
  agent any
  
  tools {
      maven 'Maven-3.8.4'
  }
  
  stages {
    
    stage("build") {
      
      steps {
        echo 'building the application...'
        echo 'Application built...'
        sh 'mvn clean install'
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
