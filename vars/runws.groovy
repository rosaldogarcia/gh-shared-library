def call() {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./hello-world.sh true true"
// }
stage('Example') {
        {
          int appscanStatus = sh(
            script: """
            echo "Making script executable"
            chmod a+x ../RunAppScanAutomation.sh
            ../RunAppScanAutomation.sh ${ctx.job} ${ctx.appsid}
            """,
            returnStatus: true
          )
        }
   }
}