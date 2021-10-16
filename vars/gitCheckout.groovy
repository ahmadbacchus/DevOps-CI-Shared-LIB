//Load parametersß
def parameters() = loads "params.groovy"

def call() {
    cloneRepo()
}


def cloneRepo(){
    dir("${SL_myCheckoutDir}"){
        sh "pwd"
    }
}