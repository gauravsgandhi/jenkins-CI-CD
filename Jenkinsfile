pipeline{
    agent any
    tools{
        maven '3.8.6'
    }
    stages{
        stage("Build Maven"){
          steps{
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/gauravsgandhi/jenkins-CI-CD']]])
              bat 'mvn clean install'
          }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t gauravews/devops-integration .'
                }
            }
        }
        stage('Push image to docker hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'passwordnew', variable: 'docker-credentials')]) {
                          bat 'docker login -u gauravews -p Gaurav@1061990'
                          // some block
                       }
                       bat 'docker push gauravews/devops-integration'
                }
            }
        }
    }
}