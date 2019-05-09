package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Artikel> lstArtikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstArtikel = new ArrayList<>();
        lstArtikel.add(new Artikel(
                "Kerajinan Tangan Motif Manik-manik Khas Suku Dayak Tamambalo",
                "Kompas.com",
                "KOMPAS.com – Selain kerajinan tenun, Suku Dayak punya jenis karya lainnya yang dapat dijadikan buah tangan wisatawan yang mengunjungi tanahnya, yakni kerajinan tangan berbahan manik-manik.\n" +
                        "\n" +
                        "Kerajinan itu dapat ditemukan pada Suku Dayak Tamambalo. Kerajinan berbahan manik-manik, umumnya digunakan sebagai pelengkap pakaian adat.\n" +
                        "\n" +
                        "Suku itu mendiami lokasi sekitar Danau Sentarum, Kalimantan Barat, sama seperti Suku Dayak iban. Bedanya, suku yang disebut kedua lebih dikenal dengan kerajinan tenun.\n" +
                        "\n" +
                        "Pengerjaan kerajinan manik-manik, pada dasarnya menjadi kegiatan para wanita Dayak Tamambalo sebagai pengisi waktu luang. Biasanya dilakukan setelah meladang.\n" +
                        "\n" +
                        "“Pengerjaannya butuh waktu yang cukup lama, dan untuk motif-motif tertentu tidak sembarang orang boleh melakukannya. Perlu ritual khusus sebelumnya. Seperti motif Kakaletau, yang menyerupai motif manusia,“ papar Hilaria, wanita paruh baya Dayak Tamambalo.\n" +
                        "\n" +
                        "Tidak heran harga yang ditawarkan jadi cukup mahal bergantung dari ukuran dan kerumitan motifnya.\n" +
                        "\n" +
                        "Namun  perlu diakui, paduan warna dan motif dari kerajinan manik-manik memang menarik perhatian. Selain manik-manik, ada lagi kerajinan dari biji arere pangkarabun.\n" +
                        "\n" +
                        "Biji berwarna abu-abu itu dijalin bersama manik-manik menjadi kalung atau gelang tangan maupun kaki. Umumnya digunakan pada bayi sebagai saran pengusir roh halus.\n" +
                        "\n" +
                        "“Percaya atau tidak, hanya garis keturunan tertentu yang bisa menanam tanaman ini. Saya sudah membuktikannya, mata saya sakit dan baru sembuh ketika tanaman ini saya cabut. Ini juga dialami dan terjadi pada beberapa orang yang mencoba menanamnya,“ tutur Hilaria.\n" +
                        "\n" +
                        "Memang sejak dulu, Suku Dayak dikenal sebagai suku yang unik karena histori-histori di belakangnya seperti itu.",
                "Diterbitkan : 14.38 WIB, 02/Mei/2019",
                R.drawable.a));

        lstArtikel.add(new Artikel(
                "Peserta Pelatihan Kerajinan Tangan Diharapkan Jadi Penggerak Ekonomi Desa",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.b));

        lstArtikel.add(new Artikel(
                "Limbah Kulit Sagu Disulap Menjadi Berbagai Kerajinan Tangan",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.c));

        lstArtikel.add(new Artikel(
                "Ekspor Produk Kerajinan Tangan RI Naik 4 Kali Lipat Dalam 20 Tahun",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.d));

        lstArtikel.add(new Artikel(
                "Kerajinan Tangan Batok Kelapa dan Tulang Ikan Sumenep Madura Tembus Eropa",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.e));

        lstArtikel.add(new Artikel(
                "PKK Sunter Agung Ubah Sampah Kantong Plastik Jadi Kerajinan Tangan",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.f));

        lstArtikel.add(new Artikel(
                "Ekspor Produk Kerajinan Tangan RI Naik 4 Kali Lipat Dalam 20 Tahun",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.d));

        lstArtikel.add(new Artikel(
                "Kerajinan Tangan Batok Kelapa dan Tulang Ikan Sumenep Madura Tembus Eropa",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.e));

        lstArtikel.add(new Artikel(
                "PKK Sunter Agung Ubah Sampah Kantong Plastik Jadi Kerajinan Tangan",
                "Catergory",
                "Describtion",
                "Tanggal",
                R.drawable.f));

        RecyclerView myrv = findViewById(R.id.recyclerView);
        ArtikelAdapter MyAdapter = new ArtikelAdapter(this, lstArtikel);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(MyAdapter);

    }
}
