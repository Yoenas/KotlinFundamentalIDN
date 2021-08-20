fun main(args: Array<String>) {
  
  // Nama seorang muslim
  val name = "Yusril"
  val age = 19

  salam(name)
  kebaikan(name)
  perlindunganSafar(name)
}

fun salam(name: String){
  // Salam sekaligus doa bagi sesama umat Islam
  // Semoga keselamatan, rahmat dan berkah dari Allah untukmu 
  println("Assalamu'alaikum Warahmatullahi Wabarakatuh, ${name}")
}

fun kebaikan(name: String){
  // Semoga Allah membalasmu dengan kebaikan
  println("Jazakallahu khairan, ${name}")
}

fun perlindunganSafar(name: String){
  // Semoga engkau dalam lindungan Allah
  println("Fii amanillah, ${name}")
}