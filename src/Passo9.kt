/*
* Crie um programa que tenha um procedimento Gerador() que,
quando chamado, mostre a mensagem "Olá, Mundo!" com algum
componente visual (linhas)
Ex: Ao chamar Gerador() aparece:
+ ======= +
Olá, Mundo!
+ ======= +
* */

fun Gerador() {
    println("+ ======= +")
    println("Olá, Mundo!")
    println("+ ======= +")
}

/*
* Crie um programa que melhore o procedimento Gerador() da
questão anterior para que mostre uma mensagem personalizada,
passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+ ======= +
Aprendendo Portugol
+ ======= +
* */

fun Gerador(mensagem: String) {
    // Exibindo o componente visual antes e depois da mensagem personalizada
    println("+ ======= +")
    println(mensagem)
    println("+ ======= +")
}

/*
* Crie um programa que melhore o procedimento Gerador() da
questão anterior para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+ ======= +
Aprendendo
Portug
ol
Aprend
endo
Portug
ol
Aprend
endo
Portug
ol
Aprend
endo
Portug
ol
+ ======= +
* */

fun Gerador(mensagem: String, vezes: Int) {
    println("+ ======= +")

    for (i in 1..vezes) {
        val partes = mensagem.chunked(6) // 6 caracteres por parte

        for (parte in partes) {
            println(parte)
        }
    }

    println("+ ======= +")
}

/*
* Crie um programa que melhore o procedimento Gerador() da
questão anterior para que o programador possa escolher uma entre
três bordas:

+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador(&quot;Portugol Studio&quot;, 3, 2)
~~~~~~~~:::::::~~~~~~~
Portugol
Studio
Portugol
Studio
Portugol
Studio
~~~~~~~~:::::::~~~~~~~
* */

fun Gerador(mensagem: String, vezes: Int, borda: Int) {
    val bordas = arrayOf(
        "+-------=======------+",
        "~~~~~~~~:::::::~~~~~~~",
        "<<<<<<------->>>>>>>>>"
    )

    println(bordas[borda - 1])

    for (i in 1..vezes) {
        val partes = mensagem.chunked(6)

        for (parte in partes) {
            println(parte)
        }
    }

    println(bordas[borda - 1])
}

/*
* Desenvolva um algoritmo que leia dois valores pelo teclado e
passe esses valores para um procedimento Somador() que vai
calcular e mostrar a soma entre eles.
* */

fun Somador(valor1: Int, valor2: Int) {
    val soma = valor1 + valor2
    println("A soma entre $valor1 e $valor2 é: $soma")
}

/*
* Desenvolva um algoritmo que leia dois valores pelo teclado e
passe esses valores para um procedimento Maior() que vai
verificar qual deles é o maior e mostrá-lo na tela. Caso os dois
valores sejam iguais, mostrar uma mensagem informando essa
característica.
* */

fun Maior(valor1: Int, valor2: Int) {
    if (valor1 > valor2) {
        println("O maior valor é: $valor1")
    } else if (valor2 > valor1) {
        println("O maior valor é: $valor2")
    } else {
        println("Os dois valores são iguais!")
    }
}

/*
* Crie uma lógica que leia um número inteiro e passe para um
procedimento ParOuImpar() que vai verificar e mostrar na tela
se o valor passado como parâmetro é PAR ou ÍMPAR.
* */

fun ParOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("O número $numero é PAR.")
    } else {
        println("O número $numero é ÍMPAR.")
    }
}

/*
* Faça um programa que tenha um procedimento chamado Contador()
que recebe três valores como parâmetro: o início, o fim e o
incremento de uma contagem. O programa principal deve solicitar a
digitação desses valores e passá-los ao procedimento, que vai
mostrar a contagem na tela.
* */

fun Contador(inicio: Int, fim: Int, incremento: Int) {
    var contagem = inicio
    while (contagem <= fim) {
        print("$contagem ")
        if (contagem + incremento <= fim) {
            print(">> ")
        }
        contagem += incremento
    }
    println("FIM")
}

/*[DESAFIO] Desenvolva um aplicativo que tenha um procedimento
chamado Fibonacci() que recebe um único valor inteiro como
parâmetro, indicando quantos termos da sequência serão mostrados
na tela. O seu procedimento deve receber esse valor e mostrar a
quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar
na solução Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34
>> FIM*/

fun Fibonacci(n: Int) {
    var a = 0
    var b = 1
    var contador = 1

    while (contador <= n) {
        print("$a ")
        if (contador < n) {
            print(">> ")
        }
        val proximo = a + b
        a = b
        b = proximo
        contador++
    }
    println("FIM")
}

fun main() {
    Gerador()
    Gerador("Kotlin")
    Gerador("Aprendendo Portugol", 4)
    Gerador("Portugol Studio", 3, 2)

    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()

    Somador(valor1, valor2)

    print("Digite o primeiro valor: ")
    val valor3 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val valor4 = readLine()!!.toInt()

    Maior(valor3, valor4)

    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    ParOuImpar(numero)

    print("Digite o valor de início: ")
    val inicio = readLine()!!.toInt()

    print("Digite o valor de fim: ")
    val fim = readLine()!!.toInt()

    print("Digite o valor do incremento: ")
    val incremento = readLine()!!.toInt()

    Contador(inicio, fim, incremento)

    print("Digite o número de termos da sequência Fibonacci: ")
    val numeroTermos = readLine()!!.toInt()

    Fibonacci(numeroTermos)
}

