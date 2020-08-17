pipeline {
      
    agent any
    stages {
        stage('compile') {
            steps {
                sh 'javac src/source/NumberToArmenianWordsSecondEdition.java'
            }
        }
          
        stage('build') {
            steps {
                sh 'java src/source/NumberToArmenianWordsSecondEdition.java'
            }
        }
    }
}         
