// developed with love by: Salevieno
// december 06, 2022

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome : String, val id : Int)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel)
{

    val inscritos = mutableListOf<Usuario>()	// inscritos is immutable, but its list is mutable, so we can add users
    
    fun matricular(vararg usuario: Usuario)
    {
        for (user in usuario)
        	inscritos.add(user)
    }
}

fun main()
{
    // this function will simulate the creation of a formation and enrollment of two users
    
    // creating users
    val user1 = Usuario("Adam", 1)
    val user2 = Usuario("Mark", 2)
    println(user1.toString())
    println(user2.toString())
    
    // creating educational content
    val contEdu1 = ConteudoEducacional("Primeiros passos com Kotlin", 60)
    val contEdu2 = ConteudoEducacional("Sintaxe Kotlin", 120)
    val contEdu3 = ConteudoEducacional("Kotlin avançado", 60)
    
    // creating formations
    val KotlinContEdu = listOf(contEdu1, contEdu2, contEdu3)
    val formacaoKotlin = Formacao("Kotlin", KotlinContEdu, Nivel.AVANCADO)
    
    // enrolling users in formationKotlin
    formacaoKotlin.matricular(user1, user2)
    
    // printing the results
    println(user1.toString())
    println(user2.toString())
    println()
    
    println(contEdu1.toString())
    println(contEdu2.toString())
    println(contEdu3.toString())
    println()
    
    println(formacaoKotlin.toString())
    println(formacaoKotlin.inscritos)
}
