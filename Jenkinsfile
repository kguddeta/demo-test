pipeline {
    agents any
    stages {
	stage('Build') { 
	    steps {
		sh 'mvn -B -DskipTests clean package' 
	    }
	}
	stage('Build') { 
	    steps {
		echo 'Testing Staff...' 
	    }
	}
    }
}
