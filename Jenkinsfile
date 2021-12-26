pipeline {
  
  agent any
  
  parameters {
    choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }
  
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
            params.executeTests
        }
      }
      
      steps {
        echo 'testing the application...'
      }
    }
    stage("deploy") {
      
      steps {
        echo "deploying the application...${params.VERSION}"
      }
    }
  }
}
