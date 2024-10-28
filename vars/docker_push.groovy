def call(String Project, String ImageTag, String dockerHubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordvariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
}
  sh "docker push ${dockerhubuser}/${Project}:$(imageTag)"
}
