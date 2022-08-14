def call() {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./hello-world.sh true false"
}
