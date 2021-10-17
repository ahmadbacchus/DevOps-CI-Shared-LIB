import org.healthfirst.DevOps.*


def call() {
    utility()
    cloneRepo()
    gitLog()
}


def cloneRepo(){
    //Clone repo here
    checkout scm
}


def gitLog(){
    sh "git log >> gitLog-" + pipelineID + ".txt"
}