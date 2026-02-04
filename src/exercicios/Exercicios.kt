package exercicios

class Exercicios {


    // 1
    fun verificarImparPar(numero: Int){
        if(numero % 2 == 0){
            println("O numero $numero é par");
        } else {
            println("O numero $numero é impar");
        }
    }

    // 2
    fun verificarPositivoNegativo(numero: Int){
        if (numero < 0) {
            println("O numero $numero é negativo");
        } else if (numero > 0){
            println("O numero $numero é positivo");
        } else {
            println("O numero $numero é zero");
        }
    }

    // 3
    fun verificarIdade(idade: Int){
        when (idade) {
            in 0..12      -> println("A idade é $idade, então é criança");
            in 13 .. 17   -> println("A idade é $idade, então é adolescente");
            in 18 .. 59   -> println("A idade é $idade, então é adulto");
            in 60 .. 140  -> println("A idade é $idade, então é idoso");
            else -> println("Idade $idade invalida");
        }
    }

    // 4
    fun exibirTabuada(numero: Int){
        var total = 0;
        for (i in 0..10) {
            total = numero * i;
            println("$numero X $i = $total");
        }
    }

    // 5
    fun somaValoresArray(listaNumeros: Array<Int>){
        var i = 0;
        var totalSoma = 0;

        while (i < listaNumeros.size){
            totalSoma = totalSoma + listaNumeros[i];
            i++;
        }

        println("Total da soma dos valores informados: $totalSoma");
    }

    // 6
    fun maiorValorArray(listaNumeros: Array<Int>){

        //val resultadoSoma = listaNumeros.max()
        var i = 0;
        var maior = 0;

        while (i < listaNumeros.size){
            if (maior < listaNumeros[i]){
                maior = listaNumeros[i];
            }
            i++;
        }

        println("O maior valor informado foi: $maior");
    }

    // 7
    fun contagemRegressiva(numero: Int){
        var i = numero;
        while (i >= 0){
            println(i);
            i = i - 1;
        }
    }

    // 8
    fun somaParesArray(listaNumeros: Array<Int>){
        var i = 0;
        var totalSoma = 0;
        while (i < listaNumeros.size){
            if (listaNumeros[i] % 2 == 0){
                totalSoma = totalSoma + listaNumeros[i];
            }
            i++;
        }
        println("Valor total da soma dos números PARES: $totalSoma");
    }

    // 9
    fun dobrarValor(numero: Int){
        val valorDobrado = numero * 2;
        println("O dobro de $numero é: $valorDobrado");
    }

    // 10
    fun calcularMediaAluno(nota1: Int , nota2: Int, nota3: Int){
        val notaMedia = (nota1 + nota2 + nota3) / 3;
        println("A média do aluno é $notaMedia");
    }

    // 11
    fun converterTemperatura (temperaturaCelsius: Double){
        val temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        println("$temperaturaCelsius ºC é equivalente a $temperaturaFahrenheit ºF");
    }

}






