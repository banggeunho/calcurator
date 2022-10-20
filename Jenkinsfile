pipeline { 
     agent any 
     stages { 
          stage("Compile") { 
               steps { 
                    sh "sudo ./gradlew compileJava"
               } 
          } 
          stage("Unit test") { 
               steps { 
                    sh "sudo ./gradlew test"
               } 
          } 
     } 
} 
