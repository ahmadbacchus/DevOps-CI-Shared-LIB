import org.healthfirst.DevOps.*


def call() {
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