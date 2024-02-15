def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     docker rmi ${registry}
    """
}
