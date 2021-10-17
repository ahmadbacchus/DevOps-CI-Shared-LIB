def call() {
    if (pipelineID == ''){
        env.pipelineID = UUID.randomUUID().toString()
    }
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