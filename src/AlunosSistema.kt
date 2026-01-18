
fun main() {

    var alunos = ArrayList<String>()//cria lista vazia
    var alunosListaFeminina = listOf<String>("Gabriela Queiroz", "Luiza Gomes", "Monica Andrade")//cria lista com elementos
    var alunosListaMaculina = listOf<String>("Lucas Pereira", "Otavio Gomes", "Pedro Nascimento")// cria lista com outros elementos

    alunos.addAll(alunosListaFeminina + alunosListaMaculina) //adiciona todos os elementos das 2 listas

    var Quantiadade = alunos.count()//conta os elementos
    println(Quantiadade) // printa quantidade

    println(alunos)        // printa a lista

val mensagem="A Sala está vazia" // utiliza uma constante
    alunos.remove("Lucas Pereira") // remove um item
    var QuantidadeRenovada=alunos.count() // conta elementos de pois de remover
println(QuantidadeRenovada) // printa o novo valor
    if  (alunos.containsAll(alunosListaFeminina) ||  alunos.containsAll(alunosListaMaculina)) {
println("Lista contem alunas e alunos na Lista")} // condiciona se a lista que estava fazia contém as dua listas adicionadas
else {
    println("Sala Vazia") // senão : sala vazia
}
}