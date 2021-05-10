package com.hllbr.kotlinlearningv4_string

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*String
        Println gibi bir yapı içerisinde " " ifadelerin içerisinde yazan değerler String olarak nitelendirilir.
        String ifadelerinde değişkenleri bulunmaktadır.Bir değişkene atanabilirler toplanabilirler.2 veya daha fazla değişkeni toplayabiliriz

         */

        val myString :String = "HLLBR İS CONNECTED"//Burada önemli olan tırnak işaretlerini unutmamak

        var myString2 : String = "hllbr love the Women"

        var result : String

        result = myString+ myString2

        println(result)

        /*
        Biz burada String sınıfından bir obje oluşturuyoruz Kotlin Java gibi obje odaklı bire programlama dilidir.üst satırlarda oluşturmuş olduğum myString ve myString2 benim için String sınıfından oluşturlmuş objeler
        myString ve myString2 değişkenlerim artık String sınıfına ait objeler bu yüzden string sınıfının özelliklerini taşıyorlar
        bu özellikleri keşfetmek yada kullanmak için myString. demem yeterli olacaktir.

        * Bunların dışında bazı yazılım dilleri String ifadelerin toplanmasına izin vermezken Kotlin bu konuda JAVA programlama dilinin sunduğu esnekliğin bir benzerini bize sunuyor
        Stringler için boşluk(Space) ta bir String değer taşımaktadır.iki değeri toplarken aralarında boşluk bırakmak istersen bunun için bir değişken atayıp ona boşluk değerini atabiliriz yada toplama işleminin arasına bir " " ifadsesi bırakabiliriz


         */
        println("-------------------------------------------------")

        val name1 = "1903"
        val name2 = "BEŞİKTAŞ"
        val space_string =" "
        val rs = name1+space_string+name2
        println(rs)

        //******************************
        println("-------------------------------------------------")

        val sname = "SuperMassive"
        val sname2 = "E-Spor Club"
        var rs2 = sname +" " +sname2
        println(rs2)

        //TANIMLAMALAR ==

        val fullName = "hllbr is Developer"

        val fullExpert : String = "hllbr is Gamer"

        println("-------------------------------------------------")

        println(fullName)

        println("-------------------------------------------------")

        println(fullExpert)

        myString.capitalize()//ilk harfi nüyütmek için kullanılan bir String yöntemi

        //İnternetten veri çekmemiz gereken bir durumda alınan ilk verinin büyük harf ile ifade edilmesi gereken bir durum olabilir.Bu durumda bu method işimizi kolaylaştırıyor

        val pi = 3

        println( pi.compareTo(5))//3.14 değerim ile 5 değerimi karşılaştırmak için kullanabileceğim bir metod//1 0 -1 değerlerini dönüyor
        //çıkartma - toplama gibi işlemler içinde direkt metodlarım bulunuyor


        println(pi.div(5))

        println(pi.minus(8))//çıkartma işlemi
    }
}