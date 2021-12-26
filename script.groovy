def buildApp() {
  echo 'building the application...'
        echo 'Application built...'
        echo "Building version ${NEW_VERSION}..."
        sh 'mvn clean install'
}
