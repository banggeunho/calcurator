pipeline { 
     agent any 
     stages { 
          stage("Compile") { 
               steps {
                    sh "chmod +x ./gradlew"
                    sh "./gradlew compileJava"
               } 
          }
          stage("Build") {
                steps {
                    sh "./gradlew clean bootJar"
                }
          }
          stage("Unit test") { 
               steps { 
                    sh "./gradlew test"
               } 
          } 
     } 
} 
