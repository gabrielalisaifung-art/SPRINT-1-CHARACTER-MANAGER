TP10 — Character Manager Sprint #4
Pada sprint ini MainWindow naik dari v0.3 ke v0.4. Ditambahkan class AppTheme (package view) yang menjadi pusat warna, font, dan border, sehingga daftar karakter tampil sebagai kartu berwarna menurut role. Package model tidak berubah sama sekali.

Screenshot sebelum (v0.3) dan sesudah (v0.4)
Sebelum (v0.3):

c:\Users\TUF GAMING\OneDrive\Pictures\Screenshots\Screenshot 2026-11-03 175815.png

Sesudah (v0.4):

c:\Users\TUF GAMING\OneDrive\Pictures\Screenshots\Screenshot 2026-11-03 173146.png

Mengapa warna disimpan di AppTheme, bukan di Character
Warna adalah urusan tampilan, bukan data karakter, sehingga pemetaannya saya letakkan di AppTheme.colorFor(CharacterType) pada package view. Jika Character menyimpan java.awt.Color, class Model akan bergantung pada library GUI sehingga tidak bisa dipakai di aplikasi konsol atau unit test tanpa GUI, dan sulit dimigrasi ke JavaFX yang punya class Color sendiri. Dengan rancangan ini arah ketergantungan hanya satu arah (View mengenal Model lewat enum, Model tidak mengenal View), dan mengganti tema cukup dengan mengedit AppTheme.java. Bukti Model tidak berubah ada di bagian "Bukti git diff" di bawah.

Mini-Challenge: highlight level tinggi
Karakter dengan level ≥ 5 tampil dengan teks emas dan tebal. Batasnya disimpan sebagai konstanta bernama HIGH_LEVEL_THRESHOLD = 5 di AppTheme, bukan angka tertulis di dalam if. Saya menaruhnya di View karena "level tinggi" di sini hanya aturan tampilan (kapan sebuah kartu disorot), bukan aturan permainan, dan Model memang tidak boleh diubah.

Dua properti tambahan
Properti Komponen Tambahan
Properti	Penerapan	Alasan
Tooltip berisi detail HP/ATK	setToolTipText(describe(role) + " | HP .., ATK ..")	Detail statistik tersedia saat kursor diam di kartu tanpa membuat teks kartu terlalu panjang
setEnabled(false) untuk karakter level 1	Kartu Morgana tampil redup	Menandai karakter yang belum siap tanpa menyembunyikannya, sehingga pengguna tetap tahu karakternya ada
Batas level 1 juga disimpan sebagai konstanta bernama (DISABLED_LEVEL).

Bukti git diff: package model tidak berubah
git diff HEAD~1 HEAD --stat -- src/com/unpri/charactermanager/model
Output perintah di atas kosong, artinya tidak ada perubahan di Character.java, CharacterType.java, maupun CharacterManager.java.

Struktur folder
CharacterManager/
├── src/
│   ├── com/
│   │   └── unpri/
│   │       └── charactermanager/
│   │           ├── model/
│   │           │   ├── Character.java
│   │           │   ├── CharacterManager.java
│   │           │   └── CharacterType.java
│   │           └── view/
│   │               ├── AppTheme.java
│   │               └── MainWindow.java
│   └── Main.java
├── README.MD
├── c:\Users\TUF GAMING\OneDrive\Pictures\Screenshots\Screenshot 2026-11-03 175815.png
└── c:\Users\TUF GAMING\OneDrive\Pictures\Screenshots\Screenshot 2026-11-03 173146.png

4. Penjelasan Penggunaan AppTheme
Analisis Bagian D TP10 (Google Docs)
Nama : Tan Lisaifung Gambriela
Nim : 253303621288

https://docs.google.com/document/d/1Piq_q66mG50ctaRhsp02nXr72GeleWD7/edit?usp=drivesdk&ouid=115604189359564607117&rtpof=true&sd=true