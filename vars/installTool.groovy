def call(String pkgName) {
	String version = System.getProperty("java.version");
	print "Java Version : "+version
	print "JAVA_HOME : "+JAVA_HOME
	if (pkgName=="jdk-11.0.12_linux-x64_bin") {
		print "Package Name : "+pkgName
		export JAVA_HOME="/home/cloud_user/Desktop/jdk-11.0.12"
		export PATH=$JAVA_HOME/bin:$PATH
		
		String version = System.getProperty("java.version");
		print "Java Version : "+version
		print "JAVA_HOME : "+JAVA_HOME
	}else{
		print "Out of Scope"
	}
}