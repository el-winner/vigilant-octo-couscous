pipeline {
  
  agent any
  
  environment {
    NEW_VERSION = '1.3.0'
  }
  
  tools {
      maven 'Maven-3.8.4'
  }
  
  stages {
    
    stage("build") {
      
      steps {
        echo 'building the application...'
        echo 'Application built...'
        echo "Building version ${NEW_VERSION}..."
        sh 'mvn clean install'
      }
    }
    stage("test") {
      
      when {
        expression {
          BRANCH_NAME == 'main'
        }
      }
      
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
