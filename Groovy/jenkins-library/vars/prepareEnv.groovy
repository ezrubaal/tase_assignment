def call(Map params = [:]) {
    script {
        def commitAuthor = params.get('commitAuthor', env.GIT_AUTHOR_NAME ?: 'Unknown')
        def commitMessage = params.get('commitMessage', env.GIT_COMMIT ?: 'No Message')
        def branchName = params.get('branchName', env.BRANCH_NAME ?: 'Unknown')
        def commitHash = params.get('commitHash', env.GIT_COMMIT ?: 'Unknown')
        
        env.COMMIT_AUTHOR = commitAuthor
        env.COMMIT_MESSAGE = commitMessage
        env.BRANCH_NAME = branchName
        env.COMMIT_HASH = commitHash
        
        echo "SCM Triggered by: ${env.COMMIT_AUTHOR}"
        echo "Commit Message: ${env.COMMIT_MESSAGE}"
        echo "Branch Name: ${env.BRANCH_NAME}"
        echo "Commit Hash: ${env.COMMIT_HASH}"
    }
}