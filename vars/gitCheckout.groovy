def call() {
    cloneRepo()
}


def cloneRepo(){
    //Clone repo here
    checkout scm
    sh "git tag --list"
    sh "ls -l"

}