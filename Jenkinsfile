pipeline {
  
  agent any
  
  stages {
    
    stage("build") {
      
      steps {
        echo 'building the application...'
        echo 'Application built...'
        withMaven {
          sh 'mvn clean install'
    }
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
