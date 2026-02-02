package exercicios

class Exercicios {

    fun verificarPositivoNegativo(numero: Int){
        if (numero < 0) {
            println("o numero $numero é negativo")
        } else if (numero > 0){
            println("o numero $numero é positivo")
        } else {
            println("o numero $numero é zero")
        }
    }

    fun verificarImparPar(numero: Int){
        if(numero % 2 == 0){
            println("numero $numero é par")
        } else {
            println("numero $numero é impar")
        }
    }

    fun verificarIdade(idade: Int){
        when {
            idade in 0..12      -> println("A idade é $idade, então é criança")
            idade in 13 .. 17   -> println("A idade é $idade, então é adolescente")
            idade in 18 .. 59   -> println("A idade é $idade, então é adulto")
            idade in 60 .. 140  -> println("A idade é $idade, então é idoso")
            else -> println("Idade $idade invalida")
        }
    }

    fun exibirTabuada(numero: Int){
        for (i in 0..10) {
            println(numero * i)
        }
    }

}