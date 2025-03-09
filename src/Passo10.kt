//• Refaça o exercício 90, só que agora em forma de função
//Somador(), que vai receber dois parâmetros e vai retornar o
//resultado da soma entre eles para o programa principal.

//fun Somador (a: Int , b: Int): Int {
//    return a + b
//}
//
//fun main (){
//    print("Digite um numero inteiro: ")
//    var n1 =  readln()!!.toInt()
//    print("Digite o segundo numero inteiro: ")
//    var n2 = readln()!!.toInt()
//    var resultado = Somador (n1 , n2)
//    print("o resultador é $resultado")
//}



//• Crie um programa que tenha uma função Media(), que vai receber
//as 2 notas de um aluno e retornar a sua média para o programa
//principal.

//fun Media (n1: Int , n2: Int): Int{
//    return (n1 + n2) / 2
//}
//
//fun main(){
//    print("Digite sua nota: ")
//    var nota1 = readln()!!.toInt()
//    print("Digite sua segunda nota: ")
//    var nota2 = readln()!!.toInt()
//    var soma = Media(nota1 , nota2)
//    print("A sua media é: $soma")
//}



//• Refaça o exercício 91, só que agora em forma de função Maior(),
//mas faça uma adaptação que vai receber TRÊS números como parâmetro
//e vai retornar qual foi o maior entre eles.

//fun Maior(a:Int , b:Int , c:Int):Int {
//    return maxOf(a , b , c)
//}
//
//fun main(){
//    print("Digite um numero inteiro: ")
//    var n1 = readln()!!.toInt()
//    print("Digite um segundo valor: ")
//    var n2 = readln()!!.toInt()
//    print("Digite um terceiro valor: ")
//    var n3 = readln()!!.toInt()
//    var resultado = Maior(n1 , n2 , n3)
//    print("o maior numero citado é $resultado")
//}



//• Crie um programa que tenha uma função SuperSomador(), que vai
//receber dois números como parâmetro e depois vai retornar a soma
//de todos os valores no intervalo entre os valores recebidos.
//Ex:
//SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
//SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar
//85

//fun SuperSomador(a:Int , b:Int):Int{
//    val maior = maxOf(a , b)
//    val menor = minOf(a, b)
//
//    var soma = 0
//    for (num in menor..maior){
//        soma += num
//    }
//    return soma
//}
//
//fun main(){
//    print("Digite um numero: ")
//    var n1 = readln()!!.toInt()
//    print("Digite um segundo numero: ")
//    var n2 = readln()!!.toInt()
//    var resultado = SuperSomador(n1 , n2)
//    print("a soma dos intervalos entre os valores de $n1 a $n2 é: $resultado")
//}



//• Faça um programa que possua uma função chamada Potencia(),
//que vai receber dois parâmetros numéricos (base e expoente) e vai
//calcular o resultado da exponenciação.
//Ex: Potencia(5,2) vai calcular 5**2 = 25

//fun potencia(base: Int, expoente: Int): Int {
//    var resultado = 1
//    for (i in 1..expoente) {
//        resultado *= base
//    }
//    return resultado
//}
//
//fun main() {
//    print("Digite um numero inteiro que voce quer como Base: ")
//    var base = readln()!!.toInt()
//    print("Digite um numero inteiro que voce quer como expoente: ")
//    var expoente = readln()!!.toInt()
//    var resultado = potencia(base , expoente)
//    print("o resultado da exponenciação é: $resultado")
//}



//• Melhore o exercício 96, criando além da função Media() uma
//outra função chamada Situacao(), que vai retornar para o programa
//principal se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO.
//Essa nova função, vai receber como parâmetro o resultado
//retornado pela função Media().

//fun Media (n1: Int , n2: Int): Int{
//    return (n1 + n2) / 2
//}
//
//fun Situação(resultado: Int):String {
//
//    if(resultado >=6){
//        return "APROVADO"
//    }else if(resultado ==5) {
//        return "FAZER PROVA SUBSTITUTIVA "
//    }else{
//        return "REPROVADO"
//    }
//}
//
//fun main(){
//    print("Digite sua nota: ")
//    var nota1 = readln()!!.toInt()
//    print("Digite sua segunda nota: ")
//    var nota2 = readln()!!.toInt()
//    var soma = Media(nota1 , nota2)
//    var resultado = Situação(soma)
//    println("A sua media é: $soma")
//    println("Resultado: $resultado")
///}