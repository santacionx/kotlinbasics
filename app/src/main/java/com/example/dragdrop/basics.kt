package com.example.dragdrop
//fun main(){
////   when new  obj creation constructor init variable and property : is called automatically : no return type
////    val kb=basics("object created") : only once
////    println("${basics("object created").i}  ")
////    println(" ${basics("object created").add(10, 20)}")
////    class basics (val a:String) {
////    println("${basics(10,20)}  ")
////   print("${basics().x} ")
////    print("${basics.add(10)}")
//
//}


//class basics  {

//    constructor(a:Int){
//        println("value ${a}")
//    }
//    constructor(a:Int,b:Int){
//        val sum=a+b;
//       println("addition ${sum}")
//    }
//var x=20
//    companion object {
//        val myProperty = "This is a property in companion object"
//        fun add(a:Int):Any{
//            return a
//        }
//fun main(){
//   val b=B();
////    val b=A();
//    println(b.add(10,20))
//}
//
//open class   A{
////    mom
//open var name="usha"
//    open fun add(a:Int,b:Int):Int{
//        print(name)
//        return a+b;
//    }
//}
//class B: A(){
//
//    override var name="san"
//    override fun add(a:Int,b:Int):Int{
//        val x=super.add(a,b)
//        return x*x
//    }
//
//}
//this and super
//fun main(){
//    val b=B(1000);
//    print(b.saygreet(20))
//}
//open class A(cno:Int){
//    init {
//        println(cno)
//    }
// fun brake(){
//     print("brake")
// }
//    fun clutch(){
//        print("clutch")
//    }
//    fun speed(meter:Int){
//        print(meter)
//    }
//}
//class B(cno:Int) : A(cno){
//    var sayhi=10
//    init{
//        println("B created")
//        println("1"+super.brake())
//        println("2"+super.clutch())
//        println("2"+super.speed(10))
//
//    }
//    fun saygreet(sayhi:Int){
//        print(this.sayhi)
//
//    }
//}

//interface : reference type
//fun main(){
// val a=A()
//    val b=B()
//    println(a.first)
//    println(b.first )
//}
//
//interface Add{
//    var first:Int
//    fun add(a:Int , b:Int):Int
//    fun add(a:Int , b:Int, c:Int):Int
//}
//
//class A:Add{
//    override  var first=10
//    override   fun add(a:Int , b:Int):Int{
//        return a+b
//    }
//    override  fun add(a:Int , b:Int, c:Int):Int{
//        return a+b+c
//    }
//
//}
//class B:Add{
//    override  var first=10
//    override   fun add(a:Int , b:Int):Int{
//        return 2*a+b
//    }
//    override  fun add(a:Int , b:Int, c:Int):Int{
//        return 2*a+b+c
//    }
//
//}


//interface  A{
//    var operator:String
//    fun square(a:Int,b:Int):Int{
//        return a*b
//    }
//}
//abstract class Shape {
//    abstract var color: String;
//
//    fun add(a:Int,b:Int):Int{
//        return a+b
//    }
//    abstract  fun operate(a:Int,b:Int,c:Int):Int
//}
//class B : Shape(){
//   override  var color="pink";
//    override fun operate(a:Int,b:Int,c:Int):Int{
//        return a+b+c
//    }
//}

//fun main(){
//   Hello<Int>(10);
//  Hello<String>("").greet("hello")
//}
//
//class Hello<T>(value:T){
//    init{
//        println(value)
//    }
//    fun <T> greet(text:T){
//        print(text)
//    }
//}

//fun main(){
//  for( i in A.values()){
//      if(i==A.SUN){
//          println(""+i+" is holiday")
//      }else{
//          print(" "+i+" ")
//      }
//
//  }
//}
//enum class A(value:Boolean=false){
//    MON,
//    TUE,
//    WED ,
//    THU,
//    FRI,
//    SAT(true),
//    SUN(true)
//}
//fun  main(){
////  print(add(10))
//  add()
//}
////val add:(Int)->Int={x->x*x}
//
////val add={x:Int,y:Int->x+y}
//val add={ print("hello ") }
//
//fun main(){
// println(sum(add))
//    diff(sub)
//}

//val greet={ println("helloo") }
//fun heelo(func: ()->Unit){
//   func()
//}

//val add={a:Int,b:Int->a+b}
//
//
//fun sum(add: (Int,Int)->Int):(Int,Int)->Int{
//
//}

//fun diff(sub:(Int,Int)->Int){
//    println(sub(10,20))
//}
//fun main(){
//    val a=A();
//    a.apply {
//        name="sandeep"
//        age=10
//        mob=123456577
//
//    }

//    println(mob1)
//    a.also {
//        it.name="san"
//        it.age=12
//        print("modified"+a.name)
//    }
//    print("done"+a.age)
//
//    var b=A()
//    val msg=b?.run{
//        println(name)
//    }
//    println(msg)
//
//}
//class A{
//    var name:String=""
//    var age:Int=0
//    var mob:Int=0
//}

//collection:group of objects
fun main(){
//    var list=listOf(1,2,3,4,5,"hello")
////    println(list.get(0))
////    println(list.get(1))
////    println(list.first())
//    var mlist= mutableListOf("hi","hello")
//    println(mlist)
    var name:String?=null;

    name?.let{
        print(name!!.length)
    }

}