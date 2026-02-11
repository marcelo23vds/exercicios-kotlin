package exercicios

class Gerente(nome: String, salario: Double): Funcionario(nome, salario) {
    override fun exibirSalario() {
        salario += (salario * 0.20)
        println("O gerente $nome possui o salario de $salario")
    }
}