pipeline {
      
    agent any
    stages {
        stage('compile') {
            steps {
                sh '/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/javac src/source/NumberToArmenianWordsSecondEdition.java '
            }
        }
          
        stage('build') {
            steps {
                sh '/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java src/source/NumberToArmenianWordsSecondEdition.java'
            }
        }
    }
}         
