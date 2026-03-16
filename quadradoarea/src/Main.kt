//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("\n --- ÁREAS DE FUGURAS PLANAS---")
    println("Escolha a figura que deseja calcular:")
    println("1- Retângulo")
    println("2- Quadrado")
    println("3- Losango")
    println("4- Trapézio")
    println("5- Paralelogramo")
    println("6 - Triângulo")
    println("7- Círculo")
    print("Digite sua opção:")

    val opcao = readln().toInt()

    when (opcao) {
        1 -> calcularRetangulo()
        2 -> calcularQuadrado()
        3 -> calcularLosango()
        4 -> calcularTrapezio()
        5 -> calcularParalelogramo()
        6 -> calcularTriangulo()
        7 -> calcularCirculo()
        else -> println("Opção inválida!")
    }
}

fun calcularRetangulo() {
        println("digite a base:")
        val base = readln().toDouble()

        println("digite a altura:")
        val altura = readln().toDouble()

        val area = base * altura
        println("O valor da área do retângulo é: $area")
    }




    fun  calcularQuadrado () {

        println("Digite o lado:")
        val lado = readln().toDouble()

        val area = lado * lado
        println ("O valor do cálculo do quadrado é: $area")

    }

    fun calcularLosango (){

        println("digite a diagonal maior:")
        val diagonalmaior = readln().toDouble()

        println("digite a diagonal menor:")
        val diagonalmenor = readln().toDouble()

        val area = diagonalmaior * diagonalmenor /2
        println ("O valor do cálculo da área do losango é: $area²")

    }
    fun calcularTrapezio (){

        println("digite a base maior:")
        val basemaior = readln().toDouble()

        println("digite a base menor:")
        val basemenor = readln().toDouble()

        println("digite a altura:")
       val altura = readln().toDouble()


        val area = (basemaior + basemenor) * altura /2
        println ("O valor do cálculo da área do trapézio é: $area²")


    }
    fun calcularParalelogramo() {
        println("digite a base:")
        val base = readln().toDouble()

        println("digite a altura:")
        val altura = readln().toDouble()

        val area = base * altura
        println("O valor da área do paralelograma é: $area")
    }
    fun calcularTriangulo () {
        println("digite a base:")
        val base = readln().toDouble()

        println("digite a altura:")
        val altura = readln().toDouble()

        val area = base * altura /2
        println("O valor da área do triângulo é: $area")
    }

        fun calcularCirculo() {
            println("--- CÁLCULO DA ÁREA DO CÍRCULO ---")

            print("Digite o valor do raio (r): ")
            val raio = readln().toDouble()

            val pi = 3.14

            val area = pi * (raio * raio)

            println("A área do círculo é: $area")
        }


