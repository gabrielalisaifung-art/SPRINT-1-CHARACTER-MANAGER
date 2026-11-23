TP14 — Implementasi Validasi Form Karakter
A. Dokumentasi Screenshot
Berikut adalah dokumentasi hasil pengujian validasi pada Character Manager.

1. Pengujian Nama Kosong

Ketika pengguna menekan tombol Simpan tanpa mengisi nama karakter, sistem menampilkan pesan kesalahan "Nama wajib diisi".

alt text

2. Pengujian Nama Duplikat

Ketika pengguna memasukkan nama karakter yang sudah terdaftar, sistem menolak penyimpanan dan menampilkan pesan "Nama sudah dipakai".

alt text

3. Pengujian Berhasil Menambahkan Karakter

Ketika pengguna memasukkan nama, memilih role, dan menentukan level yang valid, sistem berhasil menyimpan karakter dan menampilkan kartu karakter baru pada daftar.

alt text

B. Tabel Pengujian Validasi
No.	Skenario Pengujian	Hasil yang Diharapkan	Hasil Aktual	Keterangan
1	Nama dikosongkan	Muncul pesan "Nama wajib diisi"	Isi setelah pengujian	Berhasil / Perlu perbaikan
2	Nama kurang dari 3 karakter	Muncul pesan validasi panjang nama	Isi setelah pengujian	Berhasil / Perlu perbaikan
3	Nama lebih dari 20 karakter	Muncul pesan validasi panjang nama	Isi setelah pengujian	Berhasil / Perlu perbaikan
4	Nama menggunakan angka atau simbol	Muncul pesan "Nama hanya huruf dan spasi"	Isi setelah pengujian	Berhasil / Perlu perbaikan
5	Nama duplikat	Sistem menolak nama yang sudah digunakan	Isi setelah pengujian	Berhasil / Perlu perbaikan
6	Nama valid	Karakter berhasil ditambahkan	Isi setelah pengujian	Berhasil / Perlu perbaikan
7	Level tidak valid	Sistem menolak level yang tidak sesuai	Isi setelah pengujian	Berhasil / Perlu perbaikan
Catatan Perbedaan Hasil dan Tindakan Perbaikan:

Apabila hasil pengujian aktual berbeda dari hasil yang diharapkan, dilakukan pemeriksaan pada bagian validasi form dan aturan pada CharacterManager. Perbaikan dilakukan dengan menyesuaikan kondisi validasi, pesan kesalahan, serta proses penyimpanan data. Setelah perbaikan, pengujian dilakukan kembali untuk memastikan sistem berjalan sesuai ketentuan.

C. Kompromi Implementasi Sementara
Pada implementasi TP14 ini, penggunaan ActionListener masih dilakukan secara sederhana untuk menangani kejadian ketika tombol Simpan ditekan. Selain itu, CharacterFormPanel masih memanggil CharacterManager secara langsung untuk menambahkan karakter dan memeriksa nama duplikat. Pendekatan ini dipilih agar proses validasi dan penyimpanan dapat berjalan dengan lebih mudah dipahami pada tahap pembelajaran. Pada pengembangan selanjutnya, mekanisme event handling dan pemisahan tanggung jawab antarlapisan dapat disempurnakan agar struktur program menjadi lebih terorganisasi.

D. Dokumentasi Analisis Konseptual
Dokumen analisis Bagian D:

https://1drv.ms/w/c/f7e4b908e7214f1b/IQCT5bzZ4e8lT56wlvkn9QIdAXjcR8wp_zswJrJfqpSrtIg