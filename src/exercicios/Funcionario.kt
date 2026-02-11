package exercicios

open class Funcionario (var nome: String, var salario: Double) {

    open fun exibirSalario(){
        println("$nome possui o salario de $salario")
    }

}