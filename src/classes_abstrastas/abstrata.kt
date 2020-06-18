package classes_abstrastas

abstract class Mamifero(var nome:String) {
    abstract fun falar() //classe abstarata presisa ser modificada a cada chamada +++ nao contem {}
   //classe pode ser acessada
}
class cachorro (nome :String):Mamifero(nome){
    override fun falar() {//modificando classe abstrata
        println("bbbb")
    }
}//pegando nome da classe mamifero
    fun main(){
    cachorro("pt").falar()


}