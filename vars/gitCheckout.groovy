//Load parametersß
def loads = "params.groovy"

def call() {
    cloneRepo()
}


def cloneRepo(){
    dir("${env.SL_myCheckoutDir}"){
        sh "echo pwd"
    }
}