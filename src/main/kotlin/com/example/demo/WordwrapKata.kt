package com.example.demo

class WordwrapKata {
    fun wrap(s: String, i: Int): String {
        val cadena = s.split(" ")
        var result =""
        for ((index, palabra) in cadena.withIndex()){
            if(palabra.length <= i){
                result += palabra+"\n"
            }else{
                result += palabra.substring(0,i)+"\n"+palabra.substring(i, palabra.length)+"\n"
            }
            if ( index == cadena.size -1) result = result.substring(0, result.length-1)
        }
        println(result)
        return result
    }

}
