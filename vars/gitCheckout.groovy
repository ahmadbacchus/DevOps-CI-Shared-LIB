//Load parametersß
def parameters = loads "params.groovy"

def call() {
    cloneRepo()
}


def cloneRepo(){
    dir("${env.SL_myCheckoutDir}"){
        sh "pwd"
    }
}