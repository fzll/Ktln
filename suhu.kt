fun main() {
    print("Masukkan nama mahasiswa: ")
    val nama = readLine() ?: ""

    print("Masukkan nilai mata kuliah (0-100): ")
    val nilai = readLine()?.toIntOrNull() ?: 0

    val grade = when {
        nilai >= 81 -> "A"
        nilai >= 51 -> "B"
        else -> "C"
    }

    println("\n--- Hasil Akhir ---")
    println("Nama Mahasiswa : $nama")
    println("Nilai Akhir    : $nilai")
    println("Grade          : $grade")
}