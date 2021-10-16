//Load parametersß
def loads = "params.groovy"

def call {
    cloneRepo()
}


def cloneRepo(){
    dir(myCheckoutDir){
        //checkout scm
        sh "echo pwd"
    }
}