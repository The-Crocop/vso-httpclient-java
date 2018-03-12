//import com.microsoft.alm.teamfoundation.sourcecontrol.webapi

def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    sh "echo 'test ${config.pullRequestId} ${config.pullRequestStatus}'"

    //GitPullRequestStatus status = new GitPullRequestStatus();
    //GitStatusContext context = new GitStatusContext();
    //context.setGenre("Foo");
    //context.setName("Bar");
    //status.setContext(context);
    //status.setState(statusState);
    //status.setDescription(statusDescription);
    //status.setTargetUrl(targetUrl);
    //// Don't set iterationId on the status
    //gitHttpClient.createPullRequestStatus(status, gitRepo.getId(), pullRequest.getPullRequestId());
}