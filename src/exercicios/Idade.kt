package exercicios

class Idade {
    fun verificarIdade(idade: Int){
        when {
            idade in 0..12      -> println("A idade é $idade, então é criança")
            idade in 13 .. 17   -> println("A idade é $idade, então é adolescente")
            idade in 18 .. 59   -> println("A idade é $idade, então é adulto")
            idade in 60 .. 140  -> println("A idade é $idade, então é idoso")
            else -> println("Idade $idade invalida")
        }
    }
}