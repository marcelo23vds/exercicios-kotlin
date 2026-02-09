package exercicios

class Pessoa (var nome: String, var idade: Int, var cidade: String) {

    fun exibirDados (){
        println("$nome tem $idade anos e mora em $cidade")
    }
}