pipeline {
      
    agent any
    stages {
        stage('compile') {
            steps {
                script usr/lib/jvm/java-8-openjdk-amd64/bin/javac src/source/NumberToArmenianWordsSecondEdition.java
            }
        }
          
        stage('build') {
            steps {
                script 'usr/lib/jvm/java-8-openjdk-amd64/bin/java src/source/NumberToArmenianWordsSecondEdition.java'
            }
        }
    }
}         
