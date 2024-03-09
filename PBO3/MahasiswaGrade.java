/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grade;

/**
 *
 * @author Lenovo
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MahasiswaGrade extends Mahasiswa {

    MahasiswaGrade(String nim, String nama, int nilai) {
        super(nim, nama, nilai);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Mahasiswa> mahasiswas = inputMahasiswa(scanner);

        // Menampilkan informasi mahasiswa
        infoMahasiswa(mahasiswas);
    }

    // Metode untuk mendapatkan data mahasiswa dari input
    public static List<Mahasiswa> inputMahasiswa(Scanner scanner) {
        List<Mahasiswa> mahasiswas = new ArrayList<>();

        // Input data mahasiswa
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan NIM mahasiswa ke-" + (i + 1) + ": ");
            String nim = scanner.nextLine();
            System.out.println("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // consume newline
            mahasiswas.add(new MahasiswaGrade(nim, nama, nilai));
        }

        return mahasiswas;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public static void infoMahasiswa(List<Mahasiswa> mahasiswas) {
        int jumlahMahasiswa = mahasiswas.size();
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int[] jumlahGrade = new int[5]; // A, B, C, D, E
        int totalNilai = 0;

        // Menampilkan informasi mahasiswa
        for (Mahasiswa mahasiswa : mahasiswas) {
            System.out.println("NIM : " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Nilai : " + mahasiswa.getNilai());
            System.out.println("Grade: " + mahasiswa.getGrade());
            System.out.println("=========================================================================");
        }

        // Menghitung jumlah mahasiswa yang lulus dan tidak lulus serta jumlah mahasiswa berdasarkan grade
        for (Mahasiswa mahasiswa : mahasiswas) {
            totalNilai += mahasiswa.getNilai();
            String grade = mahasiswa.getGrade();
            if (!grade.equals("D") && !grade.equals("E")) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
            switch (grade) {
                case "A":
                    jumlahGrade[0]++;
                    break;
                case "B":
                    jumlahGrade[1]++;
                    break;
                case "C":
                    jumlahGrade[2]++;
                    break;
                case "D":
                    jumlahGrade[3]++;
                    break;
                default:
                    jumlahGrade[4]++;
                    break;
            }
        }

        // Menampilkan jumlah mahasiswa yang lulus dan tidak lulus
        System.out.println("Jumlah Mahasiswa : " + jumlahMahasiswa);
        System.out.println("Jumlah Mahasiswa yg Lulus : " + jumlahLulus + " yaitu " + getMahasiswaByLulus(mahasiswas));
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus: " + jumlahTidakLulus + " yaitu " + getMahasiswaByTidakLulus(mahasiswas));

        // Menampilkan jumlah mahasiswa berdasarkan grade
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + jumlahGrade[0] + " yaitu " + getMahasiswaByGrade(mahasiswas, "A"));
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + jumlahGrade[1] + " yaitu " + getMahasiswaByGrade(mahasiswas, "B"));
        System.out.println("Jumlah Mahasiswa dengan Nilai C = " + jumlahGrade[2] + " yaitu " + getMahasiswaByGrade(mahasiswas, "C"));
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + jumlahGrade[3] + " yaitu " + getMahasiswaByGrade(mahasiswas, "D"));
        System.out.println("Jumlah Mahasiswa dengan Nilai E = " + jumlahGrade[4] + " yaitu " + getMahasiswaByGrade(mahasiswas, "E"));

        // Menampilkan rata-rata nilai mahasiswa
        double rataNilai = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataNilai);

    }

    // Metode untuk mendapatkan daftar nama mahasiswa berdasarkan grade
    private static String getMahasiswaByGrade(List<Mahasiswa> mahasiswas, String grade) {
        StringBuilder result = new StringBuilder();
        for (Mahasiswa m : mahasiswas) {
            if (m.getGrade().equals(grade)) {
                result.append(m.getNama()).append(", ");
            }
        }
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }
        return result.toString();
    }

    // Metode untuk mendapatkan daftar nama mahasiswa yang lulus
    private static String getMahasiswaByLulus(List<Mahasiswa> mahasiswas) {
        StringBuilder result = new StringBuilder();
        for (Mahasiswa m : mahasiswas) {
            if (!m.getGrade().equals("D") && !m.getGrade().equals("E")) {
                result.append(m.getNama()).append(", ");
            }
        }
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }
        return result.toString();
    }

    // Metode untuk mendapatkan daftar nama mahasiswa yang tidak lulus
    private static String getMahasiswaByTidakLulus(List<Mahasiswa> mahasiswas) {
        StringBuilder result = new StringBuilder();
        for (Mahasiswa m : mahasiswas) {
            if (m.getGrade().equals("D") || m.getGrade().equals("E")) {
                result.append(m.getNama()).append(", ");
            }
        }
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }
        return result.toString();
    }
}
