def newgit(Repo)
{
  git "https://github.com/DanielPrawin/${Repo}.git"
}

def built()
{
  sh "mvn package"
}
def deploy(jobName,idAddress,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobName}/webapp/target/webapp.war ubuntu@${idAddress}:/var/lib/tomcat9/webapps/${context}.war"
}

def deploy(jobName)
{
  sh 'java -jar /var/lib/jenkins/workspace/${jobName}/testing.jar'
}
