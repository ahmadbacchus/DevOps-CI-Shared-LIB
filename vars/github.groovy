def myCheckoutDir = "appRepo"

def call {

    cloneRepo()

}


def cloneRepo(){
    dir(myCheckoutDir){
        checkout scm
    }
}

def getTag(){
    dir (myCheckoutDir){
        sh ""
    }
}