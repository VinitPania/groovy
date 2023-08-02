def xml_files_array = ['standalone.xml' , 'standalone-full.xml' , 'standalone-ha.xml' , 'standalone-load-balancer.xml'] as String[]
def Xml_files = "E:\\devops\\wildfly\\wildfly-15.0.0.Final\\standalone\\configuration"
println xml_files_array
for (e in xml_files_array) {
    println e
    def result   = "${Xml_files}" + '\\' + "${e}"
    print result
}
