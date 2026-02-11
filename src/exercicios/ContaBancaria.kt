package exercicios

class ContaBancaria (nomeTitular: String) {

    private var saldo: Double = 0.0

    fun depositarValor(valorDeposito: Double){
        saldo += valorDeposito
        println("valor depositado: $valorDeposito")
    }

    fun sacarValor(valorSaque: Double){
        if (valorSaque > saldo){
            println("Saldo insuficiente")
        } else {
            saldo -= valorSaque
            println("Valor sacado: $valorSaque")
        }
    }

    fun consultarSaldo(){
        println("Saldo atual: $saldo")
    }


}