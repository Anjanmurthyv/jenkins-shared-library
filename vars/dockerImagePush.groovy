def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     aws ecr get-login-password --region ap-south-1 | docker login --docker-ecr AWS --password-stdin $registry
     docker push ${registry}/${imagename}:${tagname}
    """
}
