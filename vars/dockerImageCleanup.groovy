static def cleanup(String registry, String repository, String imageTag) {
        // Execute Docker commands to remove the specified image
        sh """
            docker rmi ${registry}
        """
    }
