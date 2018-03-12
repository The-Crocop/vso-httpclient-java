def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    sh "echo 'test ${config.pullRequestId} ${config.pullRequestStatus}'"
}