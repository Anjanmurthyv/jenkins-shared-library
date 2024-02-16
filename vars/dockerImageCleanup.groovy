def dockerImageCleanup() {
    // Get a list of all image IDs
    def imageList = "docker images -q".execute().text.trim()

    // Split the list of image IDs by newline
    def imageIDs = imageList.tokenize('\n')

    // Iterate through each image ID and delete it
    imageIDs.each { imageID ->
        // Delete the image
        "docker rmi ${imageID}".execute().text.trim()
    }
}
