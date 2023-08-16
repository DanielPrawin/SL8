def newgit(Repo)
{
  git "https://github.com/DanielPrawin/${Repo}.git"
}

def built()
{
  sh "mvn package"
}
def deploy()
{
 scp ""
}
