def js(message) {
    echo "rossjs: ${message}"
    stage('exammple') {
        data = libraryResource(resource: 'sample.sh', encoding: 'Base64')
        writeFile file: 'sample.sh', text: data, encoding: 'Base64'
        int wsstatus = sh(
        script: """
        echo "making script executable"
        chmod a+x ./sample.sh
        ./sample.sh
        """,
        returnStatus: true
        )
        }
    }

def converters(message) {
    echo "rossconverters: ${message}"
}