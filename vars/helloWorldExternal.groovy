def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    // sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
    sh "./hello-world.sh true true"
}
