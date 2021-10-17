def call() {
    cloneRepo()
}


def cloneRepo(){
    dir("${env.SL_myCheckoutDir}"){
        sh "git tag -l"
        sh "pwd"
    }
}