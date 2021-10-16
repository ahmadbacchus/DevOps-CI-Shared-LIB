
def myCheckoutDir = "appRepo"




def call {
    cloneRepo()
}


def cloneRepo(){
    dir(myCheckoutDir){
        checkout scm
    }
}