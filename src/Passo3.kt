import java.util.*
import kotlin.random.Random

fun main() {
    compararNumeros()
    calculaMedia()
    classificaTerreno()
    novoSalario()
    triangulo()
    JoKenPo()
    sortearNumero()
    emprestimoBancario()
    calculaIMC()
    aluguelCarro()
    vidaSaudavel()
    reajustarSalario()
}

//26 - Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
//O primeiro valor é o maior
//O segundo valor é o maior
//Não existe valor maior, os dois são iguais
fun compararNumeros() {
    println("Numero 1: ")
    val num1 = readln().toInt()

    println("Numero 2: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        return println("O primeiro valor é o maior")
    }
    if(num2 > num1) {
        return println("O segundo valor é o maior")
    }
    return println("não existe valor maior, os dois são iguais")
}

//27 - Crie um programa que leia duas notas de um aluno e calcule
//a sua média, mostrando uma mensagem no final, de acordo com a
//média atingida:
//• Média até 4.9: REPROVADO
//• Média entre 5.0 e 6.9: RECUPERAÇÃO
//• Média 7.0 ou superior: APROVADO
fun calculaMedia() {
    println("Nota 1: ")
    val nota1 = readln().toDouble()

    println("Nota 2: ")
    val nota2 = readln().toDouble()

    val media = nota1 + nota2 / 2

    if (media <= 4.9) { return println("REPROVADO")}
    if (media <= 6.9 ) { return println("RECUPERAÇÃO")}
    return println("APROVADO")
}

//28 - Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m².
//
//O programa também deve mostrar a classificação do terreno:
//Abaixo de 100m² → TERRENO POPULAR
//Entre 100m² e 500m² → TERRENO MASTER
//Acima de 500m² → TERRENO VIP
fun classificaTerreno() {
    // Leitura da largura e comprimento do terreno
    println("Digite a largura do terreno (em metros):")
    val largura = readLine()!!.toDouble()

    println("Digite o comprimento do terreno (em metros):")
    val comprimento = readLine()!!.toDouble()

    // Cálculo da área do terreno
    val area = largura * comprimento

    // Exibindo a área
    println("A área do terreno é: %.2f m²".format(area))

    // Classificação do terreno
    when {
        area < 100 -> println("Classificação: TERRENO POPULAR")
        area in 100.0..500.0 -> println("Classificação: TERRENO MASTER")
        area > 500 -> println("Classificação: TERRENO VIP")
    }
}

//29 - Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de acordo com a tabela a seguir:
//Até 3 anos de empresa → aumento de 3%
//Entre 3 e 10 anos → aumento de 12.5%
//10 anos ou mais → aumento de 20%
fun novoSalario() {
    // Leitura do nome do funcionário
    println("Digite o nome do funcionário:")
    val nome = readLine()!!

    // Leitura do salário do funcionário
    println("Digite o salário do funcionário (em R$):")
    val salario = readLine()!!.toDouble()

    // Leitura dos anos de trabalho na empresa
    println("Digite quantos anos o funcionário trabalha na empresa:")
    val anosTrabalho = readLine()!!.toInt()

    // Cálculo do novo salário com base nos anos de trabalho
    val novoSalario = when {
        anosTrabalho <= 3 -> salario * 1.03  // Aumento de 3%
        anosTrabalho in 4..10 -> salario * 1.125  // Aumento de 12.5%
        anosTrabalho > 10 -> salario * 1.20  // Aumento de 20%
        else -> salario
    }

    // Exibindo o novo salário
    println("Funcionário: $nome")
    println("Salário atual: R$ %.2f".format(salario))
    println("Novo salário: R$ %.2f".format(novoSalario))
}

//30 - [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
//
//EQUILÁTERO → todos os lados iguais
//ISÓSCELES → dois lados iguais
//ESCALENO → todos os lados diferentes
fun triangulo() {
    // Solicita ao usuário os comprimentos dos três segmentos de reta
    print("Digite o comprimento do primeiro segmento: ")
    val a = readLine()!!.toDouble()

    print("Digite o comprimento do segundo segmento: ")
    val b = readLine()!!.toDouble()

    print("Digite o comprimento do terceiro segmento: ")
    val c = readLine()!!.toDouble()

    // Verifica se é possível formar um triângulo com os segmentos fornecidos
    if (a < b + c && b < a + c && c < a + b) {
        println("É possível formar um triângulo com esses segmentos.")

        // Classificação do triângulo
        when {
            a == b && b == c -> println("O triângulo é EQUILÁTERO (todos os lados iguais).")
            a == b || a == c || b == c -> println("O triângulo é ISÓSCELES (dois lados iguais).")
            else -> println("O triângulo é ESCALENO (todos os lados diferentes).")
        }
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}

//31 - [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura).
fun JoKenPo() {
    // Opções do jogo
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    // Exibindo as opções para o jogador
    println("Escolha uma opção:")
    println("1 - Pedra")
    println("2 - Papel")
    println("3 - Tesoura")

    // Lendo a escolha do jogador
    val escolhaJogador = readLine()?.toIntOrNull()

    // Verificando se a escolha é válida
    if (escolhaJogador == null || escolhaJogador !in 1..3) {
        println("Escolha inválida. Digite um número de 1 a 3.")
        return
    }

    // Obtendo a escolha do jogador (como string)
    val escolhaJogadorString = opcoes[escolhaJogador - 1]

    // A escolha do computador é aleatória
    val escolhaComputador = opcoes[Random.nextInt(0, 3)]

    // Exibindo as escolhas
    println("Você escolheu: $escolhaJogadorString")
    println("O computador escolheu: $escolhaComputador")

    // Determinando o vencedor
    when {
        escolhaJogadorString == escolhaComputador -> println("Empate!")
        (escolhaJogadorString == "Pedra" && escolhaComputador == "Tesoura") ||
                (escolhaJogadorString == "Papel" && escolhaComputador == "Pedra") ||
                (escolhaJogadorString == "Tesoura" && escolhaComputador == "Papel") -> println("Você venceu!")
        else -> println("O computador venceu!")
    }
}

//32 - [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5, e o jogador vai tentar descobrir qual foi o valor sorteado.
fun sortearNumero() {
    // Sorteando um número entre 1 e 5
    val numeroSorteado = Random.nextInt(1, 6)

    // Pedindo para o jogador tentar adivinhar o número
    println("Tente adivinhar o número sorteado entre 1 e 5:")

    // Lendo a tentativa do jogador
    val tentativa = readLine()?.toIntOrNull()

    // Verificando se a tentativa é válida
    if (tentativa == null || tentativa !in 1..5) {
        println("Por favor, digite um número entre 1 e 5.")
        return
    }

    // Comparando a tentativa do jogador com o número sorteado
    if (tentativa == numeroSorteado) {
        println("Parabéns! Você acertou! O número sorteado foi $numeroSorteado.")
    } else {
        println("Você errou. O número sorteado foi $numeroSorteado. Tente novamente!")
    }
}

// 33 - Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa.
//O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
//Calcule o valor da prestação mensal.
//A prestação não pode exceder 30% do salário, ou o empréstimo será negado.
fun emprestimoBancario() {
    // Solicita o valor da casa, salário do comprador e o número de anos para pagar
    println("Digite o valor da casa (R$):")
    val valorCasa = readLine()!!.toDouble()

    println("Digite o salário do comprador (R$):")
    val salario = readLine()!!.toDouble()

    println("Digite em quantos anos o comprador vai pagar a casa:")
    val anos = readLine()!!.toInt()

    // Cálculo do número de parcelas mensais
    val numeroParcelas = anos * 12

    // Cálculo da prestação mensal
    val prestacaoMensal = valorCasa / numeroParcelas

    // Verifica se a prestação mensal excede 30% do salário
    val limitePrestacao = salario * 0.30

    // Exibe o resultado
    if (prestacaoMensal <= limitePrestacao) {
        println("Empréstimo aprovado!")
        println("Valor da prestação mensal: R$ %.2f".format(prestacaoMensal))
    } else {
        println("Empréstimo negado!")
        println("A prestação mensal de R$ %.2f excede o limite de 30% do seu salário.".format(prestacaoMensal))
    }
}

// 34 - Calcule o Índice de Massa Corpórea (IMC) de uma pessoa e classifique conforme a tabela:
//Abaixo de 18.5 → Abaixo do peso
//Entre 18.5 e 25 → Peso ideal
//Entre 25 e 30 → Sobrepeso
//Entre 30 e 40 → Obesidade
//Acima de 40 → Obesidade mórbida
fun calculaIMC() {
    // Solicita o peso e a altura da pessoa
    println("Digite o seu peso (kg):")
    val peso = readLine()!!.toDouble()

    println("Digite a sua altura (m):")
    val altura = readLine()!!.toDouble()

    // Cálculo do IMC
    val imc = peso / (altura * altura)

    // Exibe o valor do IMC
    println("Seu IMC é: %.2f".format(imc))

    // Classificação do IMC
    when {
        imc < 18.5 -> println("Classificação: Abaixo do peso")
        imc in 18.5..24.9 -> println("Classificação: Peso ideal")
        imc in 25.0..29.9 -> println("Classificação: Sobrepeso")
        imc in 30.0..39.9 -> println("Classificação: Obesidade")
        imc >= 40 -> println("Classificação: Obesidade mórbida")
    }
}

// 35 - Uma empresa de aluguel de carros cobra preços diferenciados para carros populares e de luxo.
//Carros populares (R$90/dia):
//Até 100Km percorridos → R$0,20 por Km
//Acima de 100Km percorridos → R$0,10 por Km
//Carros de luxo (R$150/dia):
//Até 200Km percorridos → R$0,30 por Km
//Acima de 200Km percorridos → R$0,25 por Km
fun aluguelCarro() {
    // Solicita o tipo de carro escolhido (popular ou luxo)
    println("Escolha o tipo de carro:")
    println("1 - Carro Popular")
    println("2 - Carro de Luxo")
    val tipoCarro = readLine()?.toIntOrNull()

    if (tipoCarro == null || tipoCarro !in 1..2) {
        println("Opção inválida. Digite 1 para Carro Popular ou 2 para Carro de Luxo.")
        return
    }

    // Solicita o número de dias de aluguel e a quantidade de km percorridos
    println("Digite o número de dias de aluguel:")
    val dias = readLine()!!.toInt()

    println("Digite a quantidade de km percorridos:")
    val kmPercorridos = readLine()!!.toInt()

    // Variáveis para armazenar o preço diário e o valor total
    var precoDiario = 0.0
    var custoKm = 0.0

    if (tipoCarro == 1) {
        // Carro popular
        precoDiario = 90.0
        custoKm = if (kmPercorridos <= 100) {
            kmPercorridos * 0.20
        } else {
            (100 * 0.20) + ((kmPercorridos - 100) * 0.10)
        }
    } else if (tipoCarro == 2) {
        // Carro de luxo
        precoDiario = 150.0
        custoKm = if (kmPercorridos <= 200) {
            kmPercorridos * 0.30
        } else {
            (200 * 0.30) + ((kmPercorridos - 200) * 0.25)
        }
    }

    // Cálculo do valor total do aluguel
    val valorTotal = (precoDiario * dias) + custoKm

    // Exibe o valor total
    println("O valor total do aluguel será: R$ %.2f".format(valorTotal))
}

//36 - Um programa de vida saudável quer dar pontos por atividades físicas. O sistema funciona assim:
//Até 10h de atividade no mês → 2 pontos por hora
//De 10h até 20h → 5 pontos por hora
//Acima de 20h → 10 pontos por hora
//Cada ponto vale R$0,05

fun vidaSaudavel() {
    // Solicita o número de horas de atividade no mês
    println("Digite o número de horas de atividade física no mês:")
    val horasAtividade = readLine()!!.toInt()

    // Variável para armazenar os pontos
    var pontos = 0

    // Calcula os pontos com base nas horas de atividade
    when {
        horasAtividade <= 10 -> pontos = horasAtividade * 2
        horasAtividade in 11..20 -> pontos = horasAtividade * 5
        horasAtividade > 20 -> pontos = horasAtividade * 10
    }

    // Calcula o valor em reais
    val valorEmReais = pontos * 0.05

    // Exibe os pontos e o valor
    println("Você acumulou $pontos pontos.")
    println("O valor correspondente é R$ %.2f".format(valorEmReais))
}

//37 - Uma empresa precisa reajustar o salário dos funcionários conforme gênero e tempo de empresa:
//
//Mulheres:
//Menos de 15 anos → +5%
//De 15 até 20 anos → +12%
//Mais de 20 anos → +23%
//Homens:
//Menos de 20 anos → +3%
//De 20 até 30 anos → +13%
//Mais de 30 anos → +25%
fun reajustarSalario() {
    // Solicita o gênero do funcionário
    println("Digite o gênero do funcionário (M para Masculino ou F para Feminino):")
    val genero = readLine()?.uppercase()

    if (genero != "M" && genero != "F") {
        println("Gênero inválido. Digite 'M' para Masculino ou 'F' para Feminino.")
        return
    }

    // Solicita o tempo de empresa e o salário atual
    println("Digite o tempo de empresa em anos:")
    val tempoDeEmpresa = readLine()!!.toInt()

    println("Digite o salário atual (R$):")
    val salarioAtual = readLine()!!.toDouble()

    // Variável para armazenar o percentual de reajuste
    var percentualReajuste = 0.0

    if (genero == "F") {
        // Reajuste para mulheres
        percentualReajuste = when {
            tempoDeEmpresa < 15 -> 5.0
            tempoDeEmpresa in 15..20 -> 12.0
            else -> { 23.0 }
        }
    } else if (genero == "M") {
        // Reajuste para homens
        percentualReajuste = when {
            tempoDeEmpresa < 20 -> 3.0
            tempoDeEmpresa in 20..30 -> 13.0
            else -> {25.0}
        }
    }

    // Calcula o valor do reajuste
    val reajuste = salarioAtual * (percentualReajuste / 100)
    val salarioReajustado = salarioAtual + reajuste

    // Exibe o resultado
    println("Percentual de reajuste: $percentualReajuste%")
    println("Valor do reajuste: R$ %.2f".format(reajuste))
    println("Salário reajustado: R$ %.2f".format(salarioReajustado))
}
