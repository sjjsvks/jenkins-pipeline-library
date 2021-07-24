def call(String pkgName) {
	withEnv() {
		print JAVA_HOME
	}
	if (pkgName=="jdk-11.0.12_linux-x64_bin") {
		java_home="/home/cloud_user/Desktop/jdk-11.0.12"
		withEnv(["JAVA_HOME=${java_home}/bin"]) {
			print JAVA_HOME
		}
	}else{
		print "Out of Scope"
	}
}