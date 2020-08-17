pipeline {
      
      agent { docker { image 'java:latest' } }
    stages {
        stage('build') {
            steps {
                sh /usr/lib/jvm/java-11-openjdk-14.0.2/bin/javac src/source/NumberToArmenianWordsAecondEdition.java
            }
        }
    }
}         
