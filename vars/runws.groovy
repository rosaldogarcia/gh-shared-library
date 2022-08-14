def call(x,y) {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./hello-world.sh $x $y"
}
