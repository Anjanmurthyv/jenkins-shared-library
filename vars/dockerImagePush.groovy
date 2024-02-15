def call(String awsAccountId, String region, String ecrRepoName, String imageName, String tagName) {
    def registry = "670855725719.dkr.ecr.ap-south-1.amazonaws.com/testecr"
    
    // Log in to AWS ECR
    def loginCommand = "aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${registry}"
    sh(loginCommand)
    
    // Push the Docker image to AWS ECR
    def pushCommand = "docker push ${registry}/${imageName}:${tagName}"
    sh(pushCommand)
}
