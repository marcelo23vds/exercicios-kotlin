package exercicios

class PositivoOuNegativo {
    fun verificarPositivoNegativo(numero: Int){
        if (numero < 0) {
            println("o numero $numero é negativo")
        } else if (numero > 0){
            println("o numero $numero é positivo")
        } else {
            println("o numero $numero é zero")
        }
    }
}