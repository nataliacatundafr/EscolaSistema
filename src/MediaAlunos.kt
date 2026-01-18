
fun main(){

   val listaAlfabetica= listOf<String>("Gabriela Queiroz", "Luiza Gomes", "Monica Andrade","Lucas Pereira", "Otavio Gomes", "Pedro Nascimento")
    println(listaAlfabetica)
    println(listaAlfabetica.size)
    println("Digite aluno\n")
    val lista= listaAlfabetica.sorted()
    val alunoNome = readln()
    val listaSorteada =  lista + alunoNome
    alunoNome+listaAlfabetica
    println(listaSorteada)


    }

