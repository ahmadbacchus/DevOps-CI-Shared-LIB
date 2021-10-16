
def myCheckoutDir = "appRepo"




def call {
    cloneRepo()
}


def cloneRepo(){ß
    dir(myCheckoutDir){
        checkout scm
    }
}