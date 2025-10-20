package no11;

public class main {
    
    public static void main(String[] args) {

        mahasiswa[] daftar = {
            new mahasiswa("King Zaki", 95),
            new mahasiswa("Prince Ardi", 85),
            new mahasiswa("Ajudan Farrash", 60)
        };

        for (mahasiswa mhs : daftar) {
            mhs.tampilData();
        }

        mahasiswa tertinggi = daftar[0];
        for (int i = 1; i < daftar.length; i++) {
            if (daftar[i].getNilai() > tertinggi.getNilai()) {
                tertinggi = daftar[i];
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi: " +
                           tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}

