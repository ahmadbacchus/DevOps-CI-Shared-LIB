//Load parametersß
def loads = "params.groovy"

def call() {
    loads()
    cloneRepo()
}


def cloneRepo(){
    dir("${env.SL_myCheckoutDir}"){
        sh "pwd"
    }
}