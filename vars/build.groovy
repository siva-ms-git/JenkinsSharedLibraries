def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean"
     }
  else if ("${mavenGoal}" == "Package")
     {
       sh "mvn clean package"
     }
  else if ("${mavenGoal}" == "Sonar")
     {
       sh "mvn sonar:sonar"
     }
   else if ("${mavenGoal}" == "Package")
      {
        sh "mvn deploy"
     }
}
