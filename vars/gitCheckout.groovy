def call() {
    cloneRepo()
}


def cloneRepo(){
    dir("${env.SL_myCheckoutDir}"){
        sh "pwd"
    }
}