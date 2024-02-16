def call(String aws_account_id, String region, String ecr_repoName) {
    sh """
     docker image prune -a -f
    """
}
