package exercicios

class Produtos (var nome: String, var preco: Double) {
    fun exibirProduto(){
        println("Produto: $nome - Preço: R$ $preco")
    }
}