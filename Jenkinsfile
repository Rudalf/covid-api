pipeline {
    agent any   
    stages {
        stage('Checkout') {
            steps {
                sh '''
                    git clone LIEN.git
                    docker run -it --rm myapp                   
                '''
            }
        }
    }
}