/*Crie um programa que leia vários números pelo teclado e
mostre no final o somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado*/

fun main() {
    var soma = 0
    while (true) {
        println("Digite um número (ou 1111 para sair): ")
        val numero = readLine()!!.toInt()
        if (numero == 1111) break
        soma += numero
    }
    println("O somatório dos números digitados é: $soma")
}

/*Desenvolva um aplicativo que leia o salário e o sexo de vários
funcionários. No final, mostre o total de salários pagos aos homens
e o total pago às mulheres. O programa vai perguntar ao usuário se
ele quer continuar ou não sempre que ler os dados de um
funcionário.*/

fun salarios() {
    var totalHomens = 0.0
    var totalMulheres = 0.0
    var continuar: String

    do {
        println("Digite o sexo do funcionário (M/F): ")
        val sexo = readLine()?.toUpperCase()

        println("Digite o salário do funcionário: ")
        val salario = readLine()?.toDoubleOrNull()

        if (salario != null) {
            if (sexo == "M") {
                totalHomens += salario
            } else if (sexo == "F") {
                totalMulheres += salario
            }
        }

        println("Deseja continuar? (S/N)")
        continuar = readLine()?.toUpperCase() ?: "N"

    } while (continuar == "S")

    println("Total de salários pagos aos homens: R$ $totalHomens")
    println("Total de salários pagos às mulheres: R$ $totalMulheres")
}


/*• Faça um algoritmo que leia a idade de vários alunos de uma
turma. O programa vai parar quando for digitada a idade 999. No
final, mostre quantos alunos existem na turma e qual é a média de
idade do grupo.*/

fun idademedia() {
    var totalIdades = 0
    var contador = 0
    var idade: Int

    do {
        println("Digite a idade do aluno (999 para encerrar): ")
        idade = readLine()?.toIntOrNull() ?: 999

        if (idade != 999) {
            totalIdades += idade
            contador++
        }

    } while (idade != 999)

    val mediaIdade = if (contador > 0) totalIdades / contador else 0
    println("Quantidade de alunos: $contador")
    println("Média de idade dos alunos: $mediaIdade")
}

/*• Crie um programa que leia o sexo e a idade de várias pessoas. O
programa vai perguntar se o usuário quer continuar ou não a cada
pessoa. No final, mostre:
• qual é a maior idade lida
• quantos homens foram cadastrados
• qual é a idade da mulher mais jovem
• qual é a média de idade entre os homens*/

fun maiorIdade() {
    var maiorIdade = 0
    var contHomens = 0
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var totalIdadeHomens = 0
    var continuar: String

    do {
        println("Digite o sexo da pessoa (M/F): ")
        val sexo = readLine()?.toUpperCase()

        println("Digite a idade da pessoa: ")
        val idade = readLine()?.toIntOrNull()

        if (idade != null) {
            if (sexo == "M") {
                totalIdadeHomens += idade
                contHomens++
                if (idade > maiorIdade) {
                    maiorIdade = idade
                }
            } else if (sexo == "F") {
                if (idade < idadeMulherMaisJovem) {
                    idadeMulherMaisJovem = idade
                }
            }
        }

        println("Deseja continuar? (S/N)")
        continuar = readLine()?.toUpperCase() ?: "N"

    } while (continuar == "S")

    val mediaIdadeHomens = if (contHomens > 0) totalIdadeHomens / contHomens else 0

    println("Maior idade lida: $maiorIdade")
    println("Número de homens cadastrados: $contHomens")
    println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
    println("Média de idade entre os homens: $mediaIdadeHomens")
}


/*Desenvolva um algoritmo que leia o nome, a idade e o sexo de
várias pessoas. O programa vai perguntar se o usuário quer ou não
continuar. No final, mostre:
 O nome da pessoa mais velha
 O nome da mulher mais jovem
 A média de idade do grupo
 Quantos homens tem mais de 30 anos
 Quantas mulheres tem menos de 18 anos*/

fun medias() {
    var nomePessoaMaisVelha = ""
    var nomeMulherMaisJovem = ""
    var maiorIdade = 0
    var idadeMulherMaisJovem = Int.MAX_VALUE
    var totalIdades = 0
    var contHomensAcima30 = 0
    var contMulheresAbaixo18 = 0
    var contPessoas = 0
    var continuar = "S"

    while (continuar == "S") {
        println("Digite o nome da pessoa: ")
        val nome = readLine() ?: ""

        println("Digite a idade da pessoa: ")
        val idade = readLine()?.toIntOrNull()

        println("Digite o sexo da pessoa (M/F): ")
        val sexo = readLine()?.toUpperCase()

        if (idade != null && sexo != null) {
            totalIdades += idade
            contPessoas++

            if (idade > maiorIdade) {
                maiorIdade = idade
                nomePessoaMaisVelha = nome
            }

            if (sexo == "F" && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            }

            if (sexo == "M" && idade > 30) {
                contHomensAcima30++
            }

            if (sexo == "F" && idade < 18) {
                contMulheresAbaixo18++
            }
        }

        println("Deseja continuar? (S/N)")
        continuar = readLine()?.toUpperCase() ?: "N"
    }

    val mediaIdades = if (contPessoas > 0) totalIdades / contPessoas else 0

    println("Nome da pessoa mais velha: $nomePessoaMaisVelha")
    println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    println("Média de idade do grupo: $mediaIdades")
    println("Quantos homens têm mais de 30 anos: $contHomensAcima30")
    println("Quantas mulheres têm menos de 18 anos: $contMulheresAbaixo18")
}
