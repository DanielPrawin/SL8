def newgit(Repo)
{
  git "https://github.com/DanielPrawin/${Repo}.git"
}

def build()
{
  sh "mvn package"
}
def deploy()
{
 scp ""
}
