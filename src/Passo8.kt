import kotlin.random.Random

/*
* Faça um programa que preencha automaticamente um vetor numérico com 8 posições, conforme abaixo:
*
* 999 999 999 999 999 999 999 999
* */

fun eightPositionVector() {
    val vetor = IntArray(8) { 999 }
    println(vetor.joinToString(" "))
}

/*
* Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente)
* um vetor numérico com 10 posições, conforme abaixo:
*
* 5 10 15 20 25 30 35 40 45 50
* */

fun multipleVectorOfFive() {
    val vetor = IntArray(10) { (it + 1) * 5 }
    println(vetor.joinToString(" "))
}

/*
* Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente)
* um vetor numérico com 10 posições, conforme abaixo:
*
* 9 8 7 6 5 4 3 2 1 0
* */

fun vectorFromNineToZero() {
    val vetor = IntArray(10) { 9 - it }
    println(vetor.joinToString(" "))
}

/*
* Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente)
* um vetor numérico com 10 posições, conforme abaixo:
*
* 5 3 5 3 5 3 5 3 5 3
* */

fun vectorAlternatingFiveAndThree() {
    val vetor = IntArray(10) { if (it % 2 == 0) 5 else 3 }
    println(vetor.joinToString(" "))
}

/*
* Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente)
* um vetor numérico com 15 posições com os primeiros elementos da sequência de Fibonacci:
*
* 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
* */

fun fibonacciVector() {
    val vetor = IntArray(15)
    vetor[0] = 1
    vetor[1] = 1
    for (i in 2 until 15) {
        vetor[i] = vetor[i - 1] + vetor[i - 2]
    }
    println(vetor.joinToString(" "))
}

/*
* Crie um programa que preencha automaticamente um vetor numérico com 7 números
* gerados aleatoriamente pelo computador e depois mostre os valores gerados na tela.
* */

fun generatingSevenRandomNumbers() {
    val vetor = IntArray(7) { Random.nextInt(1, 101) }
    println("Números gerados: ${vetor.joinToString(" ")}")
}

/*
* Faça um programa que leia 7 nomes de pessoas e guarde-os em
* um vetor. No final, mostre uma listagem com todos os nomes
* informados, na ordem inversa daquela em que eles foram
* informados.
* */

fun displaysReverseNames() {
    val nomes = Array(7) { "" }

    for (i in nomes.indices) {
        print("Digite um nome: ")
        nomes[i] = readLine()!!
    }

    println("Nomes na ordem inversa:")
    println(nomes.reversed().joinToString(" "))
}

/*
* Escreva um programa que leia 15 números e guarde-os em um
* vetor. No final, mostre o vetor inteiro na tela e em seguida
* mostre em que posições foram digitados valores que são múltiplos
* de 10.
* */

fun filterMultiplesOfTen() {
    val vetor = IntArray(15)

    for (i in vetor.indices) {
        print("Digite um número: ")
        vetor[i] = readLine()!!.toInt()
    }

    println("Números digitados: ${vetor.joinToString(" ")}")

    println("Múltiplos de 10 encontrados nas posições:")
    vetor.forEachIndexed { index, value ->
        if (value % 10 == 0) {
            println("Valor $value na posição $index")
        }
    }
}

/*
* Desenvolva um programa que leia 10 números inteiros e guarde-os
* em um vetor. No final, mostre quais são os números pares que foram
* digitados e em que posições eles estão armazenados.
* */

fun displayEvenNumbersWithIndex() {
    val vetor = IntArray(10)

    for (i in vetor.indices) {
        print("Digite um número: ")
        vetor[i] = readLine()!!.toInt()
    }

    println("Números pares e suas posições:")
    vetor.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            println("Valor $value na posição $index")
        }
    }
}

/*
* Faça um algoritmo que preencha um vetor de 30 posições com
* números entre 1 e
* 15 sorteados pelo computador. Depois disso, peça para o usuário
* digitar um número (chave) e seu programa deve mostrar em que
* posições essa chave foi encontrada. Mostre também quantas vezes a
* chave foi sorteada.
* */

fun findKeyInRandomArray() {
    val vetor = IntArray(30) { Random.nextInt(1, 16) }
    println("Números sorteados: ${vetor.joinToString(" ")}")

    print("Digite um número (chave) para procurar: ")
    val chave = readLine()!!.toInt()

    val indices = mutableListOf<Int>()
    for (i in vetor.indices) {
        if (vetor[i] == chave) {
            indices.add(i)
        }
    }

    if (indices.isNotEmpty()) {
        println("O número $chave foi encontrado nas posições: ${indices.joinToString(", ")}")
        println("Ele apareceu ${indices.size} vezes.")
    } else {
        println("O número $chave não foi encontrado no vetor.")
    }
}

/*
* Crie um programa que leia a idade de 8 pessoas e guarde-as em
* um vetor. No final, mostre:
* • Qual é a média de idade das pessoas cadastradas
* • Em quais posições temos pessoas com mais de 25 anos
* • Qual foi a maior idade digitada (podem haver repetições)
* • Em que posições digitamos a maior idade
* */

fun processAges() {
    val idades = IntArray(8)

    for (i in idades.indices) {
        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
    }

    val soma = idades.sum()
    val mediaIdade = soma.toDouble() / idades.size
    println("A média de idade das pessoas cadastradas é: $mediaIdade")

    val pessoasMaiorQue25 = mutableListOf<Int>()
    for (i in idades.indices) {
        if (idades[i] > 25) {
            pessoasMaiorQue25.add(i)
        }
    }
    println("Pessoas com mais de 25 anos estão nas posições: ${pessoasMaiorQue25.joinToString(", ")}")

    val maiorIdade = idades.maxOrNull() ?: 0
    val posicoesMaiorIdade = mutableListOf<Int>()
    for (i in idades.indices) {
        if (idades[i] == maiorIdade) {
            posicoesMaiorIdade.add(i)
        }
    }
    println("A maior idade digitada foi: $maiorIdade")
    println("A maior idade foi digitada nas posições: ${posicoesMaiorIdade.joinToString(", ")}")
}

/*
* • Faça um algoritmo que leia a nota de 10 alunos de uma turma e
guarde-as em um vetor. No final, mostre:
• Qual é a média da turma
• Quantos alunos estão acima da média da turma
• Qual foi a maior nota digitada
• Em que posições a maior nota aparece
* */

fun processGrades() {
    val grades = DoubleArray(10)

    for (i in grades.indices) {
        print("Digite a nota do ${i + 1}º aluno: ")
        grades[i] = readLine()!!.toDouble()
    }

    val sum = grades.sum()
    val average = sum / grades.size
    println("A média da turma é: $average")

    val aboveAverageCount = grades.count { it > average }
    println("Quantidade de alunos com notas acima da média: $aboveAverageCount")

    val maxGrade = grades.maxOrNull() ?: 0.0
    val maxGradePositions = mutableListOf<Int>()
    for (i in grades.indices) {
        if (grades[i] == maxGrade) {
            maxGradePositions.add(i)
        }
    }
    println("A maior nota digitada foi: $maxGrade")
    println("A maior nota aparece nas posições: ${maxGradePositions.joinToString(", ")}")
}

/*
* [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições
* com números aleatórios (entre 0 e 99) gerados pelo computador.
* Logo em seguida, mostre os números gerados e depois coloque o
* vetor em ordem crescente, mostrando no final os valores ordenados.
* */

fun processRandomNumbers() {
    val randomNumbers = IntArray(20)

    for (i in randomNumbers.indices) {
        randomNumbers[i] = (0..99).random()
    }

    println("Números gerados aleatoriamente: ${randomNumbers.joinToString(", ")}")

    randomNumbers.sort()

    println("Números em ordem crescente: ${randomNumbers.joinToString(", ")}")
}

/*
* Crie um programa que leia o nome e a idade de 9 pessoas e
* guarde esses valores em dois vetores, em posições relacionadas. No
* final, mostre uma listagem contendo apenas os dados das pessoas
* menores de idade.
* */

fun processPeopleData() {
    val names = Array(9) { "" }
    val ages = IntArray(9)

    for (i in 0 until 9) {
        print("Digite o nome da ${i + 1}ª pessoa: ")
        names[i] = readLine()!!
        print("Digite a idade de ${names[i]}: ")
        ages[i] = readLine()!!.toInt()
    }

    println("\nPessoas menores de idade:")
    for (i in 0 until 9) {
        if (ages[i] < 18) {
            println("${names[i]}, ${ages[i]} anos")
        }
    }
}

/*
* Faça um algoritmo que leia o nome, o sexo e o salário de 5
* funcionários e guarde esses dados em três vetores. No final,
* mostre uma listagem contendo apenas os dados das funcionárias
* mulheres que ganham mais de R$5 mil.
* */

fun processEmployeeData() {
    val names = Array(5) { "" }
    val sexes = Array(5) { "" }
    val salaries = DoubleArray(5)

    for (i in 0 until 5) {
        print("Digite o nome do ${i + 1}º funcionário: ")
        names[i] = readLine()!!
        print("Digite o sexo de ${names[i]} (M/F): ")
        sexes[i] = readLine()!!
        print("Digite o salário de ${names[i]}: R$ ")
        salaries[i] = readLine()!!.toDouble()
    }

    println("\nFuncionárias mulheres que ganham mais de R$5.000:")
    for (i in 0 until 5) {
        if (sexes[i].equals("F", ignoreCase = true) && salaries[i] > 5000) {
            println("${names[i]}, Sexo: ${sexes[i]}, Salário: R$ ${salaries[i]}")
        }
    }
}
