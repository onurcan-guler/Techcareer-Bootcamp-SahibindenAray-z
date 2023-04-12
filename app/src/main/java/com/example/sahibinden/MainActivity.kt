package com.example.sahibinden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.sahibinden.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val items = listOf(
           Item(pictures = R.drawable.baseline_home_22,title = "Emlak", bottomTitle = "Konut,İşyeri,Arsa,Projeler,Bina:Devremülk,..."),
            Item(pictures = R.drawable.baseline_drive_eta_24,title = "Vasıta", bottomTitle = "Otomobil,Arazi,SUV & Pick-up,Motosiklet,..."),
            Item(pictures = R.drawable.baseline_build_24,title = "Yedek Parça, Aksesuar, Donanım", bottomTitle = "Otomotiv Ekipmanları,Motosiklet Ekipmanları,..."),
            Item(pictures = R.drawable.baseline_shopping_cart_24,title = "İkinci El ve Sıfır Alışveriş", bottomTitle = "Bilgisayar,Cep Telefonu,Fotoğraf & Kamera,..."),
            Item(pictures = R.drawable.baseline_fire_truck_24,title = "İş Makineleri & Sanayi", bottomTitle = "İş Makineleri,Tarım Makineleri,Sanayi,Elektri...") ,
            Item(pictures = R.drawable.baseline_electrical_services_24,title = "Ustalar ve Hizmetler", bottomTitle = "Ev Tadilat & Dekorasyon,Nakliye,Araç Servis...") ,
            Item(pictures = R.drawable.baseline_menu_book_24,title = "Özel Ders Verenler ", bottomTitle = "Lİse & Üniversite Hazırlık,İlköğretim,Yabancı...") ,
            Item(pictures = R.drawable.baseline_account_box_24,title = "İş İlanları", bottomTitle = "Avukatlık & Hukuki Danışmanlık,Eğitim,Eğlen...") ,
            Item(pictures = R.drawable.baseline_baby_changing_station_24,title = "Yardımcı Arayanlar ", bottomTitle = "Bebek & Çocuk Bakıcısı,Yaşlı ve Hasta Bakıcısı,...") ,
            Item(pictures = R.drawable.baseline_cruelty_free_24,title = "Hayvanlar Alemi", bottomTitle = "Evcil Hayvanlar,Akvaryum Balıkları,Aksesuarl...") ,


        )
        val adapterRow = MainAdapter(items,this)
        binding.mainAdapter = adapterRow

    }
}