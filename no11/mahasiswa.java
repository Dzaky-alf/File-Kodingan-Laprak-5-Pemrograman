package no11;

public class mahasiswa {
    
    private String nama;
    private int nilai;

    public mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }
 
    public void tampilData() {
        System.out.println("Nama: " + nama + " - Nilai: " + nilai);
    }
}

