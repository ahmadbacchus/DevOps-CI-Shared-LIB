//Load parametersß

def call() {
    loads "params.groovy"
    cloneRepo()
}


def cloneRepo(){
    dir("${SL_myCheckoutDir}"){
        sh "pwd"
    }
}