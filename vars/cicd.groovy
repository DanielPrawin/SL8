def newgit(Repo)
{
  git "https://github.com/DanielPrawin/${Repo}.git"
}

def createWar()
{
  sh "mvn package"
}
def deploy()
{
 scp ""
}
