pipeline {
      
      agent { docker { image 'java:latest' } }
    stages {
        stage('build') {
            steps {
                sh javac src/source/NumberToArmenianWordsAecondEdition.java
            }
        }
    }
}         
