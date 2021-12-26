pipeline {
  
  agent any
  
  stages {
    
    stage("build") {
      
      steps {
        echo 'building the application...'
        echo 'Application built...'
        export MAVEN_HOME=/opt/maven
        export PATH=$PATH:$MAVEN_HOME/bin
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
