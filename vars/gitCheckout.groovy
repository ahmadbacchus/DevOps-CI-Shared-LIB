def call() {
    cloneRepo()
}


def cloneRepo(){
    //Clone repo here
    checkout scm
    sh "ls -l"

}