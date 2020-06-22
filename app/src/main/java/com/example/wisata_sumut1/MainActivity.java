package com.example.wisata_sumut1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> deskripsi= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.imgur.com/MVC2xVH.jpg");
        mNames.add("Danau Toba");
        deskripsi.add("Danau Toba adalah danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Berapi Super. Danau ini memiliki panjang 100 kilometer (62 mil), lebar 30 kilometer (19 mi), dan kedalaman 1600 meter (5200 ft)." +
                "Danau ini terletak di tengah pulau Sumatra bagian utara dengan ketinggian permukaan sekitar 900 meter (2953 ft)." +
                "\n" +
                "\n" +
                "dan juga ada wisata yang terkenal yaitu wisata air rangat tepatnya dibawah kaki gunung pusuk buhit, " +
                "air rangat itu adalah air hangat yang berasal dari gunung yang meletus dan Pusuk Buhit sendiri adalah sebuah gunung aktif yang " +
                "sangat disakralkan oleh etnis Batak sehingga beragam cerita mistis pun terdapat di gunung ini. Gunung ini terletak di Pulau Samosir," +
                "dan merupakan puncak tertinggi dari semua dataran tinggi di Pulau Samosir. Dengan ketinggian sekitar 1077 meter dari Danau Toba," +
                "gunung ini terlihat berdiri dengan gagahnya. Sehingga apabila Anda sedang berada di sekitar perairan Danau Toba, maka Gunung Pusuk Buhit ini akan " +
                "terlihat sangat jelas sekali dengan puncaknya yang berwarna hijau dengan kombinasi warna abu-abu dan ditutupi oleh awan di sekitarnya. lalu keetika kita beerenang " +
                "di air rangat itu tidak membayar uang masuk, tinggal masuk saja tapi setelah kita selesai mandi atau selesai berenang kita diharuskan makan ditempat permandian air rangat." +
                ".\n" +
                "\n" +
                "Danau Toba juga dikelilingi oleh hutan pinus dan beberapa air terjun dan juga pemandian air hangat di dalam hutan. Pemandangan di sekeliling danau ini sangat indah dengan udara yang relatif sejuk sehingga Anda akan betah berlama-lama di sini.\n" +
                "\n" +
                "Bagi masyarakat Batak yang berada di sekitar lokasi danau ini, Danau Toba bukan hanya tempat wisata alam yang memiliki keindahan luar biasa. " +
                "Mereka percaya bahwa Danau Toba menjadi tempat bersemayamnya tujuh dewi suku Batak atau yang biasa disebut dengan Namborru. Setiap kali akan melakukan kegiatan di sekitar danau, " +
                "masyarakat akan berdoa dan meminta izin terlebih dahulu agar acara mendapat berkah dan dapat berjalan dengan lancar."+ "\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");

        mImageUrls.add("https://www.azwisata.com/wp-content/uploads/2018/07/Tempat-Wisata-di-Sumatera-Utara-Pantai-Pandan.jpg");
        mNames.add("Pantai Pandan");
        deskripsi.add("Pantai Pandan adalah salah satu pantai yang paling popular di Sibolga. Sibolga sendiri adalah nama sebuah kota kecil yang terletak di pesisir Kabupaten Tapanuli Tengah, Sumatera Utara. " +
                "Sibolga cukup terkenal dengan wisata baharinya. Pantai Pandan terletak di pesisir Sibolga, selalu ramai dikunjungi baik hari biasa maupun hari libur. Pantai ini di kelola oleh pemerintah setempat.\n" +
                "\n" +
                "Ketika berada di pantai ini, sejauh mata memandang yang akan terlihat hanyalah perairan yang membentang di laut lepas. Di sebelah kanannya terdapat sebuah bukit yang cukup tinggi yang merupakan daratan " +
                "wilayah Sibolga. Di Pantai Pandan ini air lautnya berwarna hijau kebiru-biruan dan cukup jernih. Airnya tenang, bahkan tanpa ombak. Jadi, Anda bisa dengan bebasa berenang sejauh beberapa meter dari mulut pantai " +
                "dengan aman. Pasir di Pantai Pandan berwarna putih dan sangat lembut. Di sekitar pantai juga sangat bersih, sehingga sekalipin Anda berkeliling pantai Anda tidak akan menemukan sampah-sampah yang berserakan.\n" +
                "\n" +
                "Di sepanjang pinggiran pantai terdapat beberapa pohon-pohon yang tumbuh rindang. Diantara pepohonan itu terdapat beberapa gazebo dan tikar yang bisa Anda manfaatkan sebagai tempai beristirahat setelah Anda lelah menikmati pantai." +
                " Saat senja Anda bisa menikmati panorama matahari tenggelam di pantai ini. Warnanya yang orange kemerahan membuat pemandangan di sekitar pantai bak lukisan.\n" +
                "\n"+"Fasilitas\n" +
                "Urusan perut Anda tak usah khawatir karena di Pantai Pandan banyak pedagang makanan yang menjajakan dagangannya dengan berkeliling atau warung-warung yang ada di sekitar pantai. Jangan lupa juga untuk membeli souvenir khas Pantai Pandan . " +
                "bagi Anda wisatawan yang ingin menginap di pantai ini juga bisa, karena pihak mengelola juga sudah mebangun penginapan berkelas Internasional bernama Hotel Bumi Asih Pandan Beach Resort."+ "\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/2/2b/Taman_Nasional_Gunung_Leuser.jpg");
        mNames.add("Taman Nasional Gunung Lauser");
        deskripsi.add("Taman Nasional Gunung Leuser biasa disingkat TNGL adalah salah satu Kawasan Pelestarian Alam di Indonesia seluas 1.094.692 hektare yang secara administrasi pemerintahan terletak di Provinsi Aceh dan Sumatera Utara. Provinsi Aceh yang " +
                "terdeliniasi TNGL meliputi Kabupaten Subulussalam, Aceh Selatan, Aceh Singkil, Aceh Tengah, Aceh Tenggara, Gayo Lues, Bener Meriah, Aceh Tamiang, sedangkan Provinsi Sumatera Utara yang terdeliniasi TNGL meliputi Kabupaten Dairi, Karo, dan Langkat.\n" +
                "\n" +
                "Taman nasional ini mengambil nama dari Gunung Leuser yang menjulang tinggi dengan ketinggian 3404 meter di atas permukaan laut di Aceh. Taman nasional ini meliputi ekosistem asli dari pantai sampai pegunungan tinggi yang diliputi oleh hutan lebat khas hujan tropis, " +
                "dikelola dengan sistem zonasi yang dimanfaatkan untuk tujuan penelitian, ilmu pengetahuan, pendidikan, menunjang budidaya, pariwisata, dan rekreasi.\n" +
                "\n" +
                "Taman Nasional Gunung Leuser memiliki 3 (tiga) fungsi yaitu :\n" +
                "\n" +
                "perlindungan sistem penyangga kehidupan;\n" +
                "pengawetan keanekaragaman jenis tumbuhan dan satwa beserta ekosistemnya\n" +
                "pemanfaatan secara lestari sumber daya alam hayati dan ekosistemnya.\n" +
                "\n" +
                "Secara yuridis formal keberadaan Taman Nasional Gunung Leuser untuk pertama kali dituangkan dalam Pengumuman Menteri Pertanian Nomor: 811/Kpts/Um/II/1980 tanggal 6 Maret 1980 tentang peresmian 5 (lima) Taman Nasional di Indonesia, yaitu; TN.Gunung Leuser, TN. Ujung Kulon," +
                " TN. Gede Pangrango, TN. Baluran, dan TN. Komodo. Berdasarkan Pengumuman Menteri Pertanian tersebut, ditunjuk luas TN. Gunung Leuser adalah 792.675 ha. Pengumuman Menteri Pertanian tersebut ditindaklanjuti dengan Surat Direktorat Jenderal Kehutanan Nomor: 719/Dj/VII/1/80, " +
                "tanggal 7 Maret 1980 yang ditujukan kepada Sub Balai KPA Gunung Leuser. Dalam surat tersebut disebutkan bahwa diberikannya status kewenangan pengelolaan TN. Gunung Leuser kepada Sub Balai KPA Gunung Leuser. " + "\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");

        mImageUrls.add("https://www.pegipegi.com/travel/wp-content/uploads/2019/01/shutterstock_1205910349.jpg");
        mNames.add("Pulau Samosir");
        deskripsi.add("Pulau Samosir adalah sebuah pulau vulkanik di tengah Danau Toba di provinsi Sumatra Utara. Sebuah pulau dalam pulau dengan ketinggian 1.000 meter " +
                "di atas permukaan laut menjadikan pulau ini menjadi sebuah pulau yang menarik perhatian para turis.\n" +
                "\n" +
                "Tuktuk adalah pusat konsentrasi turis di Pulau Samosir. Dari Parapat, Tuktuk dapat dihubungkan dengan feri penyeberangan. Selain perhubungan air, Pulau Samosir " +
                "juga dapat dicapai lewat jalan darat melalui Pangururan yang menjadi tempat di mana Pulau Samosir dan Pulau Sumatra berhubungan.\n" +
                "\n" +
                "Pulau Samosir sendiri terletak dalam wilayah Kabupaten Samosir yang baru dimekarkan pada tahun 2003 dari bekas Kabupaten Toba-Samosir.\n" +
                "\n" +
                "Di pulau ini juga terdapat dua buah danau kecil sebagai daerah wisata yaitu Danau Sidihoni dan Danau Aek Natonang yang mendapat julukan \"danau di atas danau"+"\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/id/5/52/Kawah_putih_tinggi_raja.JPG");
        mNames.add("Taman Salju Tinggi Raja");
        deskripsi.add("Dolok tinggi raja ditetapkan sebagai cagar alam dengan keputusan Zelfbestuur Besluit (ZB) Nomor 24 Tangga 16 April 1924, pada masa pemerintahan kolonial Belanda. Hingga sekarang, kawasan ini masih berstatus cagar alam.\n" +
                "\n" +
                "Sejarah terbentuknya Kawah putih dolok tinggi raja belum diketahui dengan pasti. Warga Simalungun masih percaya terbentuknya kawah putih dan mata air panas dolok tinggi raja berdasarkan legenda rakyat.\n" +
                "\n" + "Legenda\n" +
                "Dahulu kala daerah tinggi raja ini merupakan sebuah daerah raja-raja yang makmur. Ada seorang Raja yang mempunyai orang tua yang sudah tua renta, suatu ketika Raja tersebut hendak mengirim makanan lezat kepada orang tua nya " +
                "yang sudah tua tersebut, maka sang Raja memerintahkan seorang petani Aren yang kala itu hendak pulang kedaerah tempat orang tua sang Raja tinggal. Ditengah perjalanan pesuruh raja tersebut lapar, dia memakan semua bekal ibu sang Raja " +
                "dan hanya menyisakan makanan yang tidak layak, yakni berupa tulang belulang. Mendapati bekal makanan yang tidak layak hasil kiriman sang Raja, ibu sang raja pun murka, si ibu memanggil anak-anak nya yang lain untuk mengadakan sebuah acara " +
                "tari-tarian dengan media seekor kucing. Ditengah acara tersebut terjadi sebuah insiden, dimana air panas yang sedah dimasak tumpah. Air panas yang tumpah tersebut meluas keseluruh daerah dan membanjiri daerah tersebut. Daerah yang dibanjiri air " +
                "panas tersebut inilah yang kini kita dapati menjadi sebuah kawah air panas dan nama Tinggi Raja juga diambil karena cerita legenda ini dimana daerah ini dahulu kala adalah Kerajaan nya para Raja-raja.Akses\n" +
                "\n" +
                "Tinggi Raja sudah ditemukan sejak ratusan tahun lalu, tetapi karena akses menuju tempat ini sangat memprihatinkan. Akses jalan menuju ke cagar alam ini yang sangat terjal dan rusak parah. Sampai saat ini belum ada perhatian dari pemerintah setempat untuk memperbaiki akses jalan ke tempat ini.\n" +
                "\n" +
                "Untuk sampai ke daerah cagar alam dolok tinggi raja, pengunjung dapat menggunakan kendaraan roda empat atau roda dua, yang kemudian menempuh jarak sejauh 95 Km dari pusat kota Medan dengan rute perjalanan sebagai berikut: Medan melewati perisimpangan Kota Lubuk Pakam lalu menuju Galang kemudian melewati Dolok Masihul lalu masuk kepersimpangan Nagori Dolok dan sampailah ke kawasan cagar alam Dolok Tinggi Raja.\n" +
                "\n" +
                "Sampai saat ini belum ada kendaraan umum untuk mencapai ke kawasan ini"+"\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");

        mImageUrls.add("https://www.azwisata.com/wp-content/uploads/2018/07/Tempat-Wisata-di-Sumatera-Utara-Hillpark-Sibolangit.jpg");
        mNames.add("Hill Park Sibolangit");
        deskripsi.add("Hillpark Sibolangit terletak di Medan, Hillpark sendiri adalah salah satu daerah di Sumatera Utara yang terletak 45 km dari Medan atau membutuhkan perjalanan sekitar dua jam.  Lebih tepatnya Hillpark Sibolangit terletak di Jalan Let. Jend. Jamin Ginting, Sibolangit, Sikeben, Sibolangit, Kabupaten Deli Serdang, Sumatera Utara.\n" +
                "\n" +
                "Karena terletak di kawasan perumahan elit di Green Hill City, taman bermain yang memiliki sejumlah wahana ini sangat cocok untuk liburan bersama keluarga. Liburan menyenangkan akan menjadi hal yang hanya bisa Anda dapatkan di Hillpark Sibolangit.\n" +
                "\n" +
                "Ketika Anda berkunjung ke tempat ini, Anda akan melewati rute perjalanan yang sangat indah. Anda akan melewati hamparan perbukitan berwarna hijau. Hamparan permadani hijau inilah yang membuat udara di Sibolangit terasa sangat sejuk dan bersih.Selain itu, Anda hanya perlu berkendara selama 45 menit jika ingin melanjutkan wisata ke Berastagi. Ada banyak wisata yang juga memiliki pemandangan alam yang tidak kalah menarik.\n" +
                "\n" +
                "Di Berastagi sendiri terdapat Taman Alam Lumbini, Bukit Gundaling, Berastagi dan Air Terjun Sikulikap yang terkenal keindahannya. Berkunjung ke Hillpark Siboangt dan mampir ke Berastagi sepertinya akan menjadi tujuan wisata yang sangat cocok untuk mengisi liburan Anda!\n" +
                "\n" +
                "Hillpark Sibolangit berdiri di atas lahan seluas 110 hektar. Sejarah Hillpark Sibolangit ini berasal dari seorang ide kontraktor yang ingin membangun taman bermain yang sangat besar. Ide itu pertama kali berasal dari perusahaan yang membangun perumahan Green Hill City.\n" +
                "\n" +
                "Perusahaan  ingin membuat taman bermain yang jarang ada di Sumatera, meskipun tidak bermaksud untuk meniru beberapa objek wisata yang ada di Pulau Jawa. Maka ide itupun terealisasikan dan berdirilah sebuah tempat wisata yang memiliki wahana permainan banyak sekali.\n" +
                "\n" +
                "\n" +
                "Hillpark Sibolangit adalah destinasi wisata pertaman yang harus Anda kunjungi jika Anda bepergian ke kota Medan. Hillpark Sibolangit adalah themepark yang terletak di Sibolangit dan diklaim sebagai themepark terbesar yang ada di pulau Sumatera.\n" +
                "\n" +
                "Hillpark Sibolangit dibagi menjadi tiga tema yaitu The Lost City, Toon Town, dan The Heritage. Mau tahu lokasi Hillpark Sibolangit dan berapa harga tiket masuk dan wahana yang dijual? Simak ulasannya di bawah ini.\n" +
                "\n" +
                "Daftar Isi\n" +
                "\n" +
                "Lokasi Hillpark Sibolangit\n" +
                "Harga Tiket Hillpark Sibolangit 2018\n" +
                "Wahana di Hillpark Sibolangit\n" +
                "1. The Heritage\n" +
                "2. The Lost City\n" +
                "3. Toon Town\n" +
                "\n" +
                "Hillpark Sibolangit terletak di Medan, Hillpark sendiri adalah salah satu daerah di Sumatera Utara yang terletak 45 km dari Medan atau membutuhkan perjalanan sekitar dua jam.  Lebih tepatnya Hillpark Sibolangit terletak di Jalan Let. Jend. Jamin Ginting, Sibolangit, Sikeben, Sibolangit, Kabupaten Deli Serdang, Sumatera Utara.\n" +
                "\n" +
                "Karena terletak di kawasan perumahan elit di Green Hill City, taman bermain yang memiliki sejumlah wahana ini sangat cocok untuk liburan bersama keluarga. Liburan menyenangkan akan menjadi hal yang hanya bisa Anda dapatkan di Hillpark Sibolangit.\n" +
                "\n" +
                "Ketika Anda berkunjung ke tempat ini, Anda akan melewati rute perjalanan yang sangat indah. Anda akan melewati hamparan perbukitan berwarna hijau. Hamparan permadani hijau inilah yang membuat udara di Sibolangit terasa sangat sejuk dan bersih.\n" +
                "\n" +
                "Selain itu, Anda hanya perlu berkendara selama 45 menit jika ingin melanjutkan wisata ke Berastagi. Ada banyak wisata yang juga memiliki pemandangan alam yang tidak kalah menarik.\n" +
                "\n" +
                "Di Berastagi sendiri terdapat Taman Alam Lumbini, Bukit Gundaling, Berastagi dan Air Terjun Sikulikap yang terkenal keindahannya. Berkunjung ke Hillpark Siboangt dan mampir ke Berastagi sepertinya akan menjadi tujuan wisata yang sangat cocok untuk mengisi liburan Anda!\n" +
                "\n" +
                "Hillpark Sibolangit berdiri di atas lahan seluas 110 hektar. Sejarah Hillpark Sibolangit ini berasal dari seorang ide kontraktor yang ingin membangun taman bermain yang sangat besar. Ide itu pertama kali berasal dari perusahaan yang membangun perumahan Green Hill City.\n" +
                "\n" +
                "Perusahaan  ingin membuat taman bermain yang jarang ada di Sumatera, meskipun tidak bermaksud untuk meniru beberapa objek wisata yang ada di Pulau Jawa. Maka ide itupun terealisasikan dan berdirilah sebuah tempat wisata yang memiliki wahana permainan banyak sekali.\n" +
                "\n" +
                "\n" +
                "Untuk bisa masuk ke Hillpark Sibolangit sendiri Anda hanya perlu membayar Rp 10.000 saja. Namun harga tersebut belum termasuk tiket untuk menaiki wahana-wahana permainan yang ada. Nah, untuk bisa menikmati semua wahana yang ada di Hillpark Sibolangit, Anda bisa mengeluarkan biaya sebesar Rp. 75.000 saja.\n" +
                "\n" +
                "Dengan Anda mengeluarkan biaya Rp 75.000 maka Anda bisa mendapatkan tiket masuk dan naik tiket wahana sebanyak 15 kali permainan. Jika Anda ingin lebih hemat, Anda bisa memblei promo tiket masuk sebesar Rp. 90.000 per orang.\n" +
                "\n" +
                "Dengan harga Rp.90.000 maka Anda sudah bisa menikmati semua wahana permainan yang ada di Hillpark Sibolangit. Harga tersebut tentunya sudah sangat murah bukan jika dibandingkan dengan tempat wisata yang ada di tempat lain?\n" +
                "Wahana di Hillpark Sibolangit\n" +
                "\n" +
                "Ada beberapa wahana yang ada di Hillpark Sibolangit seperti Roller Coaster (Extravagance), Ferries Wheel (Ferris wheel), teater 4D, dan amphiteathre dengan kapasitas ruangan mencapai  1.200. Amphiteathre  di Hillpark Sibolangit sendiri bisa digunakan untuk pertunjukan dan konser.\n" +
                "\n" +
                "Bisa dikatakan Hillpark Sibolangit yang ada di Medan ini memiliki konsep taman hiburan yang hampir mirip dengan Dunia Fantasi (Dufan) di Jakarta, atau Trans Studio yang ada di Bandung.\n" +
                "\n" +
                "Namun berbeda dengan Dufan dan Trans Studio, Hillpark Sibolangit memiliki area yang lebih kecil. Nama Hillpark sendiri diambil kareana lokasi tempat wisata ini terletak di pegunungan Sibolangit. Untuk bisa mencapai disini, Anda akan membutuhkan perjalanan yang memakan waktu sekitar satu jam menggunakan mobil atau sepeda motor dari pusat kota Medan.\n" +
                "\n" +
                "Sejumlah wahana Sibolangit Hillpark tentu sangat menyenangkan untuk dimainkan. Keunikan taman bermain ini adalah pembagian arena yang masing-masing membawa keunikan temanya sendiri. Hal ini terlihat dari kendaraan yang terdapat di arena."+ "\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");


        mImageUrls.add("https://www.azwisata.com/wp-content/uploads/2018/07/Tempat-Wisata-di-Sumatera-Utara-Cagar-Alam-Sibolangit.jpg");
        mNames.add("Cagar Alam Sibolangit");
        deskripsi.add("Menjelajahi Indonesia, ada satu maksud yang mempunyai pesona mengagumkan, yakni Cagar Alam Sibolangit, di Sumatera Utara. Cagar alam ini terdapat di kecamatan Sibolangit, Kabupaten Deli Serdang, Propinsi Sumatera Utara. Di dalamnya, ada flora yang bermacam, juga faunanya tidak kalah bermacam. Panorama asri serta hawa fresh begitu dapat dijumpai di sana.\n" +
                "\n" +
                "taman wisata alam, cagar alam sibolangit, sibolangit, kecamatan sibolangit, sumut, berita sumut, berita siantar, berita simalungun, wisata, Taman Wisata Alam Sibolangit jadikan Taman lantaran banyak flora serta fauna yang berguna untuk kepentingan pendidikan Daerah ini memiliki tofografi alam yang berbukit-bukit,yang memiliki pemandangan alam yang cukup indah dan berhawa sejuk . " +
                "Kawasan ini merupakan salah satu tempat tujuan wisata warga kota medan yang favorit Sibolangit juga merupakan kawasan perkemahan Pramuka yang populer. Sibolangit pernah menjadi tuan rumah penyelenggaraan Jambore Nasional Gerakan Pramuka Indonesia Tahun 1977. Jambore tersebut dilaksanakan pada tanggal 1-20 Juli 1977.\n" +
                "\n" +
                "Di kawasan ini pernah jatuh sebuah pesawat Garuda Indonesia nomor penerbangan 152, tepatnya pada tanggal 26 September 1997 di desa Buah Nabar yang rencananya akan mendarat di bandara Polonia, Medan. “Menurut sejarah cagar alam ini merupakan cabang dari Kebun Raya Bogor yang didirikan oleh Tuan J. A. Lorzing dengan luas lebih dari 100 hektar pada tahun 1914. Kemudian cagar alam ini " +
                "diresmikan tanggal 10 Maret 1938 melalui Surat Keputusan Z.B. No.37/PK”.\n" +
                "\n" +
                "Wisata yang berjarak 40 Km dari kota Medan ini bisa ditempuh kurang lebih 1 jam dengan menggunakan kendaraan pribadi loh sobat travelers. Akan tetapi jaraknya yang begitu dekat dengan perkotaan menjadikan kawasan konservasi ini relatif terancam dengan aktivitas manusia. Sibolangit sebagai kawasan konservasi memiliki fungsi penting diantaranya adalah perlindungan sistem penyangga kehidupan, " +
                "yaitu menjaga keseimbangan lingkungan hidup, mengatur tata air dan iklim mikro. Kawasan ini juga menjaga kesuburan tanah sebagai daerah resapan air hujan untuk mencegah banjir dan menjadi sumber air bagi daerah sekitarnya sampai kota Medan.Daya tarik dari cagar alam ini adalah keanekaragaman flora dan fauna yang dimilikinya hal ini karena kawasan Sibolangit merupakan kawasan hutan hujan tropis " +
                "yang memiliki beragam jenis tumbuhan dan hewan yang hidup di dalamnya. Flora yang tumbuh disini didominasi oleh pohon-pohon besar seperti Angsana  (Pterocarpus indicus), Nyamplung (Calophyllum Inophillum), Meranti (Shorea sp) #nggak cuma nama bolu ternyata meranti juga jadi nama pohon hehe. Selain itu juga di kawasan ini terdapat jenis tanaman palem dan pinang, durian hutan, bunga bangkai (Amorphophallus titanium)" +
                " dan tumbuhan menjalar. Suasana yang tenang, sejuk, dan jauh dari hiruk pikuk ini yang bikin refresh pikiran. Hewan –hewan yang sering dijumpai di kawasan ini adalah jenis kera dan lutung, selain itu juga terdapat jenis-jenis hewan lainnya seperti babi hutan, kancil, trenggiling, kus-kus, burung rangkong dan lain-lain. Karena keanekaragaman inilah yang membuat kawasan Cagar Alam Sibolangit banyak dijadikan objek penelitian."+
                "\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");

        mImageUrls.add("https://www.azwisata.com/wp-content/uploads/2018/07/Tempat-Wisata-di-Sumatera-Utara-Pagoda-Taman-Alam-Lumbini.jpg");
        mNames.add("Pagoda Taman Alam Lumbini");
        deskripsi.add("Pagoda merupakan tempat ibadah bagi umat Buddha dengan arsitektur meninggi yang cantik. Beberapa tempat memang ada yang dibuka untuk umum, salah satunya di Taman Alam Lumbini, Karo, Sumatera Utara. Berbeda dengan yang lain, pagoda yang terletak di sini merupakan yang tertinggi di Indonesia sehingga mendapatkan rekor MURI. Bangunan yang Megah\n" +
                "\n" +
                "Pagoda Taman Lumbini ini merupakan replika dari Pagoda Shwedagon yang berada di Bhurma, Myanmar. Bangunannya pun sangat indah dan megah karena dilapisi oleh cat berwarna emas. Memasuki kawasan Pagoda, pengunjung akan disambut dengan pintu dengan desain etnik hasil pahatan seniman di Myanmar. Tempat ibadah ini juga menyimpan banyak relik yang merupakan sisa " +
                "abu pembakaran orang sui dan diletakkan di atas bangunan pagoda. Para wisatawan selain agama Buddha boleh berkunjung dan berkeliling ke sini jika sedang tidak ada kegiatan ibadah.Keindahan Selain Pagoda\n" +
                "\n" + "Taman bunga di sekitar kawasan pagoda\n" +
                "\n" +
                "Tak hanya keindahan pagoda saja yang bisa dinikmati wisatawan, mereka juga dapat mengagumi suasana di sekitar bangunan. Untuk menuju Taman Alam Lumbini, Teman Traveler harus terlebih dahulu melewati jembatan gantung untuk penyeberangan. Jembatan gantung ini lebih dikenal dengan nama Titi Lumbini dan memiliki panjang sekitar 20 meter. Wisatawan dapat dengan bebas " +
                "melihat taman dengan bunga-bunga cantik yang berada di bawah jembatan. Pengunjung juga diberi pengetahuan mengenai beberapa tanaman tersebut karena terdapat papan keterangan.\n" +
                "\n" + "Lokasi dan rute\n" +
                "\n" +
                "Pagoda Taman Lumbini berada di Desa Tongkoh, Kecamatan Dolat Rakyat, Sumatera Utara. Berada di kawasan pedesaan, tempat ibadah satu ini memiliki pemandangan yang asri dan udara yang sejuk. Jika berangkat dari kota Medan akan membutuhkan waktu selama 2 hingga 3 jam untuk sampai ke Berastagi. Bagi yang menggunakan transportasi umum, Teman Traveler bisa menggunakan angkutan umum dengan arah ke Tugu Buah Jeruk. Setelahnya berjalan kaki selama 30 menit untuk sampai ke Taman Alam Lumbini.\n" +
                "\n" +
                "Indonesia memiliki keberagaman budaya yang melimpah dan menarik untuk dibahas. Tidak sedikit pula tempat ibadah yang sangat cantik sehingga mengundang banyak wisatawan untuk melihat lebih dekat." +
                "\n" +"\n" +"\n" +"\n" +"\n" +"\n" +"\n ");

        mImageUrls.add("https://www.azwisata.com/wp-content/uploads/2018/07/Tempat-Wisata-di-Sumatera-Utara-Funland-Mickey-Holiday.jpg");
        mNames.add("Funland Mickey Holiday");
        deskripsi.add("Funland mulai hadir sebagai salah satu fasilitas Mikie Holiday Resort sejak 10 Oktober 2000 melayani pengunjung yang menginap di Mikie Holiday Resort dan tamu yang tidak menginap. Terletak di pinggir jalan raya Medan Berastagi, Funland menjadi salah satu pilihan daya tarik wisata dalam negeri untuk kota Berastagi yang berhawa sejuk diatas ketinggian 1.400 meter diatas permukaan laut. Funland juga merupakan tempat wisata keluarga dengan konsep outdoor yang pertama di Sumatera Utara.\n" +
                "\n" +
                "Kesibukan rutinitas yang dijalani sehari-hari dan keramaian kota membuat orang lupa akan canda tawa dan hiburan sehingga bisa membuat orang stress. Waktu luang bersama keluarga, orang tercinta, teman-teman menjadi sulit untuk didapat. Untuk merefresh suasana hari anda bersama keluarga perlu suasana tempat rekreasi yang santai, nyaman dan harmonis.\n" +
                "\n" +
                "Funland menawarkan pilihan lebih dari 30 macam wahana yang dapat dimainkan hanya dengan menggunakan 1 tiket saja ditengah pesona alam yang bisa membangun kembali keharmonisan dan keceriaan anda bersama keluarga.\n" +
                "\n" +
                "Untuk memanjakan dan menambah keceriaan saat santai keluarga, Funland menyediakan outlet penjualan berbagai aneka hidangan yang lezat dan bercita rasa tinggi di Frisbee, more than Fried chicken, Snack Bar, Jungle Resto, Dome dan Bumper Bonanza.\n" +
                "\n" +
                "Dengan motto \"We Give You The Best in Family Entertainment\" kami akan selalu memberikan yang terbaik untuk keluarga Anda.\n" +"\n"+
                "History\n" +
                "Funland mulai dioperasikan sejak mulai tanggal 10 Oktober 2000.\n" +"\n"+
                "Luas\n" +
                "Lebih kurang 13,5 Hektar.\n" +"\n"+
                "Visi\n" +
                "Untuk menjadi taman resort nomor 1 di Indonesia yang memberikan yang terbaik, pengalaman yang unik dan berkesan.\n" +"\n" +
                "Funland Mikie Holiday ini sebagai salah satu fasilitas dari Mikie Holiday Resort sejak 10 Oktober 2000. Luasnya sendiri mencapai 13,5 hektar. Ini merupakan taman rekreasi keluarga yang pertama di Sumatra Utara dengan pilihan 35 lebih wahana menggunakan satu tiket saja. Jadi, jika ingin main berbagai wahana, Teman Traveler tidak perlu ribet bayar lagi dan lagi. Lokasi awalnya berada di Kabupaten Karo, Sumatra Utara. Sekarang ini pindah " +
                "ke Kompleks Multatuli Indah Blok B No. 45-46, Medan.Wisata di Medan ini sangat tepat untuk dikunjungi. Seperti yang telah disebutkan, Funland Mikie Holiday ini memiliki puluhan wahana yang bisa dicoba. Dari 35 wahana ini, ada tiga sub kategori yang bisa dipilih, ada anak-anak, remaja dan juga dewasa. Tidak hanya sub kategori saja yang dibagi, konsep-konsepnya juga berbeda. Ada Adventure, Atlantis, dan permainan berbayar.Dari 35 wahana yang disuguhkan, ada beberapa permainan ekstrem yang bisa dicoba." +
                " Sebut saja Tsunami yang membawa para wisatawan duduk di gondola berputar 360 derajat dengan ketinggian 25 meter, ngeri-ngeri menantang. Wahana menantang lainnya adalah Jurassic Tree yakni ayunan raksasa yang berada di ketinggian 33 meter. Ada yang lainnya yakni Twister yang akan membawamu berputar-putar dengan kecepatan tinggi dan akan terus berputar 360 derajat pada 2 poros. Dan masih banyak lagi yang lainnya." +
                "\n" +"\n\" +\n" +"\n" +"\n\" +\n" +"\n ");


        mImageUrls.add("https://www.azwisata.com/wp-content/uploads/2018/07/Tempat-Wisata-di-Sumatera-Utara-Pulau-Nias.jpg");
        mNames.add("Pulau Nias");
        deskripsi.add("Nias (bahasa Nias:Tanö Niha) adalah kepulauan yang terletak di sebelah barat pulau Sumatra, Indonesia, dan secara administratif berada dalam wilayah Provinsi Sumatra Utara. Pulau ini merupakan pulau terbesar dan paling maju di antara jejeran pulau-pulau di pantai barat Sumatra, dihuni oleh mayoritas suku Nias (Ono Niha) yang masih memiliki budaya megalitik. Daerah ini memiliki objek wisata penting seperti selancar, rumah tradisional, penyelaman, hombo batu (lompat batu).\n" +
                "\n" +
                "Pulau dengan luas wilayah 5.625 km² ini berpenduduk hampir 1.000.000 jiwa.\n" +
                "\n" +
                "Agama mayoritas di daerah ini adalah Kristen Protestan dimana 90% penduduknya memeluk agama ini, sedangkan sisanya beragama Katolik, Islam, dan Budha. Penduduk yang memeluk agama Islam pada umumnya berada di wilayah pesisir Kepulauan Nias.\n" +
                "\n" +
                "Pulau Nias yang sebelumnya hanya terdiri atas 1 kabupaten saja, telah dimekarkan menjadi empat kabupaten dan 1 kota, yaitu Kabupaten Nias, Kabupaten Nias Selatan, Kabupaten Nias Barat, Kabupaten Nias Utara, dan Kota Gunungsitoli. .\n" +
                "Transportasi Menuju Pulau Nias\n" +
                "\n" +
                "Perjalanan menuju Pulau Nias dari Kota Medan (ibu kota Provinsi Sumatra Utara) dapat ditempuh melalui dua jalur perhubungan yakni perhubungan darat-laut dan perhubungan udara. Apabila memilih perjalanan darat-laut maka perjalanan dari Kota Medan menuju Pelabuhan Sibolga dapat ditempuh selama kurang lebih 10-12 jam menggunakan angkutan darat seperti mobil pribadi, bus umum, atau mobil travel. Di pelabuhan ini, perjalanan menuju Pulau Nias dapat menggunakan Kapal Ferry yang setiap hari berlayar dari dan menuju Pulau Nias. " +
                "Perjalanan laut ini dapat ditempuh selama 12 jam perjalanan. Apabila memilih perjalanan udara, penerbangan dari Kota Medan ke Gunungsitoli dapat ditempuh dari Bandar Udara Internasional Kualanamu dalam waktu kurang lebih 55 menit menuju ke Bandar Udara Binaka, dengan menggunakan maskapai Garuda Indonesia dan juga maskapai Lion Air Group yang dioperasikan oleh anak perusahaannya Wings Air.\n" +
                "\n" +
                "Pada pertengahan Juli 2016, penerbangan dari Kota Padang menuju Kota Gunungsitoli juga dioperasikan oleh Wings Air setiap hari. Meskipun sebelumnya di jalur ini sudah ada Susi Air yang melayani penerbangan dari Kota Padang, Sumatra Barat ke Pulau Nias tetapi penerbangan ini harus transit terlebih dahulu di Pulau Tello (Kepulauan Batu, Nias Selatan). dan pada tahun 2018 sudah ada penerbangan langsung dari bandra Soekarno - Hatta ( jakarta ) ke bandara binaka ( gunung sitoli ) dengan menggunakan pesawat Garuda Indonesia dan " +
                "menempuh perjalanan udara selama 2 - 3 jam..\n" +
                "Pulau Nias, satu dari 4 pulau yang direkomendasikan Skyscanner ketika berkunjung ke Sumatera Utara, kini bangkit kembali dan gencar mengembangkan pariwisatanya setelah gempa yang meluluhlantahkan pulau ini pada tahun 2004 dan 2005 lalu. Kepulauan Nias adalah salah satu surga bagi para surfer dunia karena ombaknya yang indah dan kebudayaan masa lalunya yang masih dapat kita saksikan sampai saat ini.Surfing di Pantai Lagundri, Pulau Nias\n" +
                "\n" +
                "Nias adalah sebuah kabupaten yang beribukota Gunungsitoli. Pulau ini berukuran 5.000 km2 dan terletak di bagian barat Sumatra. Bertetangga dengan Pulau Simeulue, Pulau Mentawai dan Pulau Enggano. Gunungsitoli sebagai pusat administratif kabupaten menjadikannya sebagai pintu gerbang wisata yang menyediakan beragam fasilitas bagi wisatawan, terutama penginapan dan transportasi ke pantai-pantai untuk surfing yang masih sulit dijangkau.\n" +
                "\n" +
                "Pantai Lagundri menjadi magnetnya surfer. Pantai ini pernah dijadikan sebagai tempat lomba surf tingkat dunia karena ombak yang dimilikinya pun tak kalah dengan yang di Hawaii. Pantai dengan ombak tenang pun menarik perhatian wisatawan dengan pasir putih yang landai, air laut hijau tosca, nyiur melambai, angin sepoi-sepoi dan sinar matahari hangat – paduan sempurna untuk menghilangkan stres.\n" +
                "Olahraga Lompat Batu, Fahombo\n" +
                "\n" +
                "Desa adat Bawomataluo terkenal dengan tradisi olahraga lompat batu-nya yang disebut Fahombo, tradisi ini pernah dicetak di mata uang seribu rupiah yang merupakan sebuah ujian bagi laki-laki yang ingin menikah. Hanya laki-laki yang berhasil melompati batu yang layak untuk menikahi gadis pujaannya dan dianggap dewasa.\n" +
                "\n" +
                "Desa Bawomataluo terletak di Nias Selatan. Di desa inilah kamu dapat menyaksikan rumah-rumah adat Nias yang tahan gempa dan masih berdiri kokoh. Di dekat desa ini terdapat sebuah pantai dengan pemandangan sunset yang indah, yaitu pantai Soroake. Pantai ini juga menjadi lokasi surfing populer bagi wisatawan mancanegara. Jaraknya dengan Pantai Lagundri hanya 2 kilometer. Dalam perjalanan pulang dari Soroake ke Gunungsitoli, kamu akan disuguhi pemandangan pantai yang menakjubkan. Salah satunya adalah Batu Geser yang bawahnya berlubang tergerus ombak." +
                "\n\" +\n" +
                "                \"\n\" +\n" +
                "                \n" );

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, deskripsi);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onComposeAction(MenuItem mi) {
        // pengecekannya di sini
        Intent tentang=new Intent(MainActivity.this,tentang.class);
        startActivity(tentang);
    }
}






















