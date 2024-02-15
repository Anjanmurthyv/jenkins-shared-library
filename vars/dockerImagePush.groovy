def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 670855725719.dkr.ecr.ap-south-1.amazonaws.com
     docker push 670855725719.dkr.ecr.ap-south-1.amazonaws.com/testecr
    """
}
