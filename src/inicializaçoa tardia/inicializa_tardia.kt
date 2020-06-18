

class carro(){
    lateinit var placa :String//so depois colar os caracteres


    fun gera_numero(){
        placa="545156"
    }


}
fun main(){
var p= carro()
    p.gera_numero()
    println(p.placa)


}