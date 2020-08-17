pipeline {
      
      agent { docker { image 'java:latest' } }
    stages {
        stage('build') {
            steps {
                batch 'javac src/source/NumberToArmenianWordsSecondEdition.java'
            }
        }
    }
}         
