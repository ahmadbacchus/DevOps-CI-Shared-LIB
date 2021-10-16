//Load parametersß
def parameters = loads "params.groovy"

def call() {
    parameters()
    cloneRepo()
}


def cloneRepo(){
    dir("${env.SL_myCheckoutDir}"){
        sh "pwd"
    }
}