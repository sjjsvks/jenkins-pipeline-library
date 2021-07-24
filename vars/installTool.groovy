def call(String pkgName) {
	String version = System.getProperty("java.version");
	print "Java Version : "+version
	
	if (pkgName=="jdk-11.0.12_linux-x64_bin") {
		java_home="/home/cloud_user/Desktop/jdk-11.0.12"
		withEnv(["JAVA_HOME=${java_home}/bin"]) {
			version = System.getProperty("java.version");
			print "Java Version : "+version
			sh "JAVA_HOME : ${JAVA_HOME}"
		}
	}else{
		print "Out of Scope"
	}
}