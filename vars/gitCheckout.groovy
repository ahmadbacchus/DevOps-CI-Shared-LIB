def call() {
    cloneRepo()
}


def cloneRepo(){
    sh "git tag -l"
    sh "pwd"
}