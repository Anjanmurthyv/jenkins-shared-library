def call(String aws_account_id, String region, String ecr_repoName) {
    // Get a list of all image IDs
    def imageList = sh(script: "docker images -q", returnStdout: true).trim()

    // Split the list of image IDs by newline
    def imageIDs = imageList.split('\n')

    // Iterate through each image ID and delete it
    for (def imageID in imageIDs) {
        // Delete the image
        sh "docker rmi ${imageID}"
    }
}
