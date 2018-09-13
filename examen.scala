// EJERCICIO 1 
def espar (num: Int): Boolean= {
     if(num % 2 == 0){
     return true}
     return false}
     
     val numeroingresada = 4
     println(espar(numeroingresada))
     
 //EJERCICIO 2
  def ESONOES (n: Int): Boolean={
     if (n % 2 == 0) {
     return true}
       return false
       }
       
       val l = List(1,2,3,4,5,6,7,8,9,10)
       var i = 0
   for (i <- l){
     if (i<=i){
     println("Este numero NO ES PAR = "+i)
     println(ESONOES(i))
      }
    }
   
 //EJERCICIO 3
val isaias = List(1,4,5,7,7)
val s = 0
def ejercicio3(n:Int):Int={
     if (n == 7){
          s = n*2
     }
     else{
          s = s+n
     }
     
}
return s
}
ejercicio3(isaias(s))

//Ejercicio 4
val list= List(1,2,4,5,6) 

def ejerci4(lista: List(Int):Boolean={
 var inicio = 0
 var final = 0
     final = list.sum
     
     for(i<-Range(0,list.lenght)){
     inicio = inicio+list(i)
          final = final -list(i)
          
          if (inicio == final){
          return true
          }
          else {return false
                         
     }
          
     }
     
}
            



//Ejercicio 5
def palindromo(palabra:String):Boolean={
     return(palabra==palabra.reverse)}

val palabra2 = "anna"
val palabra3 = "isaias"

       
