object assignment4{
  
          val Encryption = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
          val Decryption = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
          val  cipher    = (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
   def main(args: Array[String]) {  
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        println("Enter your word")
        var mark=scala.io.StdIn.readLine()
        
       
        val ct = cipher(Encryption,mark,5,alphabet)
        val pt = cipher(Decryption,ct,5,alphabet)
        println(ct)
        println(pt)
   } 

}