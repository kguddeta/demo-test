pipeline {
    agent any
    stages {
		stage('Build') { 
			steps {
			sh 'mvn -B -DskipTests compile' 
			}
		}
		stage('Test') { 
			steps {
			echo 'Testing Staff...' 
			}
		}
    }
}
