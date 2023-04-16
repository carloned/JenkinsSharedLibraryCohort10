def call(string stageName){
  if("${stageName}" == "Build"){
    sh "mvn clean package"
  }
  else if("${stageName}" == "Test"){
    sh "mvn sonar:sonar"
  }
  else if("${stageName}" == "Upload to Nexus"){
    sh 'echo "Uploading to nexus"'
  }
}
