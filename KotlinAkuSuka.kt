import kotlin.math.PI
fun main() {
    println("AUTHOR : RADITHYA MAHESA SYABIL")
    println("KELAS  : XI RPL 2")
    println()

    fibonacci(9)

    luasPersegi(5, 5)
    kelilingPersegi(4)

    luasPersegiPanjang(12, 25)
    kelilingPersegiPanjang(25, 12 )

    luasjajarGenjang(7, 9)
    kelilingJajarGenjang(12, 6)

    luasSegitiga(9, 13)
    kelilingSegitiga(4, 4, 4)

    luasBelahKetupat(6, 6)
    kelilingBelahKetupat(6)

    luasLayang2(8, 8)
    kelilingLayang2(4, 6, 4, 6)

    luasTrapesium(4, 6, 8)
    kelilingTrapesium(6, 8, 6, 8)

    luasLingkaran(7)
    kelilingLingkaran(7)

    println()
}

//function fibonacci
fun fibonacci(vararg n: Int) {
    for (num in n) {
        var fibo = 0
        var nacci = 1
        print("Deret Fibonacci ($num) = ")
        for (i in 1..num) {
            val sum = fibo + nacci
            fibo = nacci
            nacci = sum
            print("$fibo ")
        }
        println()
        println("----------------------------------------")
    }
}



//function Persegi
fun luasPersegi(sisi : Int, sisi1 : Int){
    var luas = sisi * sisi1
    println("Luas Persegi kami")
    println("$sisi")
    println("Sisi = $sisi1")
    println("$sisi x $sisi1 = $luas")
    println()
}
fun kelilingPersegi(sisi :Int){
    var empat = 4
    var keliling = empat * sisi
    println("Kel. Persegi kami")
    println("$empat")
    println("sisi = $sisi")
    println("$empat x $sisi = $keliling" )
    println()
}

//function Persegi panjang
fun luasPersegiPanjang(panjang : Int, lebar : Int){
    var luas = panjang * lebar
    println("----------------------------------------")
    println("Luas Persegi panjang kami | p x l")
    println("panjang = $panjang")
    println("lebar = $lebar")
    println("$panjang x $lebar = $luas")
    println()
}
fun kelilingPersegiPanjang(panjang : Int, lebar : Int){
    var keliling = 2 * (panjang + lebar)
    println("Kel. Persegi panjang kami | 2 x (p + l)")
    println("panjang = $panjang")
    println("lebar = $lebar")
    println("2 x ($panjang + $lebar) = $keliling")
    println()
}

//function Jajar Genjang
fun luasjajarGenjang(a : Int, t : Int){
    var luas = a * t
    println("----------------------------------------")
    println("Luas Jajar genjang kami | L = a x t")
    println("a = $a")
    println("t = $t")
    println("$a x $t = $luas")
    println()
}
fun kelilingJajarGenjang(a : Int, b : Int){
    var keliling = 2 * (a + b)
    println("Kel. Jajar genjang kami | K = 2 x (a + b)")
    println("a = $a")
    println("b = $b")
    println("2 x ($a + $b) = $keliling")
    println()
}

//function Segitiga
fun luasSegitiga(a : Int, t : Int){
    var luas = 0.5 * a * t
    println("----------------------------------------")
    println("Luas Segitiga kami | L = 1/2 x a x t")
    println("0.5")
    println("a = $a")
    println("t = $t")
    println("0.5 x $a x $t = $luas")
    println()
}
fun kelilingSegitiga(a : Int, b : Int, c : Int){
    var keliling = a + b + c
    println("Kel. Segitiga kami | K = a + b + c")
    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("$a + $b + $c = $keliling")
}

//function belah ketupat
fun luasBelahKetupat(d1 : Int, d2 : Int){
    var luas = 0.5 * d1 * d2
    println("----------------------------------------")
    println("Luas Belah ketupat kami | L  1/2 x d1 x d2")
    println("d1 = $d1")
    println("d2 = $d2")
    println("0.5 x $d1 x $d2 = $luas")
    println()
}

fun kelilingBelahKetupat(s : Int){
    var keliling = 4 * s
    println("Kel. Belah ketupat kami | K = 4 x s")
    println("s = $s")
    println("4 x $s = $keliling")
    println()
}

//function layang2
fun luasLayang2(d1 : Int, d2 : Int){
    var luas = 0.5 * d1 * d2
    println("----------------------------------------")
    println("luas Layang2 kami | L = 1/2 x d1 x d2")
    println("d1 = $d1")
    println("d2 = $d2")
    println("0.5 x $d1 x $d2 = $luas")
    println()
}
fun kelilingLayang2(a : Int, b : Int, c : Int, d : Int){
    var keliling = a + b + c + d
    println("Kel. Layang2 kami | K = a + b + c + d")
    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d = $d")
    println("$a + $b + $c + $d = $keliling")
    println()
}
//function Trapesium
fun luasTrapesium(a: Int, b: Int, t: Int){
    var luas = 0.5 * (a + b) * t
    println("----------------------------------------")
    println("Luas Trapesium kami | L = 1/2 x (a + b) x t")
    println("a = $a")
    println("b = $b")
    println("c = $t")
    println("0.5 x ($a + $b) x $t")
    println()
}

fun kelilingTrapesium(a : Int, b : Int, c : Int, d : Int){
    var keliling = a + b + c + d
    println("Kel. Trapesium kami | K = a + b + c + d")
    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d = $d")
    println("$a + $b + $c + $d = $keliling")
    println()
}

//function lingkaran
fun luasLingkaran(r : Int){
    var luas = PI * r * r
    println("----------------------------------------")
    println("Luas lingkaran kami | L = phi x r x r")
    println("r = $r")
    println("3.14 x $r x $r = $luas")
    println()
}

fun kelilingLingkaran(r : Int){
    var keliling = 2 * PI * r
    println("Keliling lingkaran kami | K = 2 x phi x r")
    println("r = 7")
    println("2 x 3.14 x $r = $keliling")
    println()
}

