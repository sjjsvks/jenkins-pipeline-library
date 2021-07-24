def call(String pkgName) {
	String javaHome = System.getenv("JAVA_HOME");
	print "JAVA_HOME : "+javaHome
	javaHome = System.getProperty("java.home");
	print "JAVA_HOME : "+javaHome
	
	if (pkgName=="jdk-11.0.12_linux-x64_bin") {
		java_home="/home/cloud_user/Desktop/jdk-11.0.12"
		withEnv(["JAVA_HOME=${java_home}/bin"]) {
			print "JAVA_HOME : "+JAVA_HOME
		}
	}else{
		print "Out of Scope"
	}
}