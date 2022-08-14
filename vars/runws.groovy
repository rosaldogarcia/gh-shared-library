def call() {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./hello-world.sh rossjs=true rossconverters=false"
}
