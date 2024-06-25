/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/tokokita";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = ""; // Sesuaikan dengan password MySQL Anda

    private static Connection connection = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("Koneksi Berhasil");
            
            while (true) {
                System.out.println("\n=== Menu Utama ===");
                System.out.println("1. Tambah Barang");
                System.out.println("2. Penjualan");
                System.out.println("3. Data Barang");
                System.out.println("4. Data Kasir");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();  // consume newline
                
                switch (pilihan) {
                    case 1:
                        tambahBarang();
                        break;
                    case 2:
                        penjualan();
                        break;
                    case 3:
                        tampilkanDataBarang();
                        break;
                    case 4:
                        tampilkanDataKasir();
                        break;
                    case 5:
                        System.out.println("Terima kasih!");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (scanner != null) {
                    scanner.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void tambahBarang() {
        try {
            System.out.print("ID Barang: ");
            int id_barang = scanner.nextInt();
            scanner.nextLine();  // consume newline
            System.out.print("Nama Barang: ");
            String nama_barang = scanner.nextLine();
            System.out.print("Harga Jual: ");
            double harga_jual = scanner.nextDouble();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            
            String sql = "INSERT INTO tabel_barang (id_barang, nama_barang, harga_jual, stok) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id_barang);
            statement.setString(2, nama_barang);
            statement.setDouble(3, harga_jual);
            statement.setInt(4, stok);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Barang berhasil ditambahkan!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void penjualan() {
        try {
            System.out.print("ID Barang: ");
            int id_barang = scanner.nextInt();
            scanner.nextLine();  // consume newline
            System.out.print("ID Kasir: ");
            int id_kasir = scanner.nextInt();
            System.out.print("Jumlah Beli: ");
            int jumlah_beli = scanner.nextInt();

            String sql = "INSERT INTO tabel_penjualan (tanggal, id_barang, id_kasir, jumlah_beli) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, getCurrentDate());
            statement.setInt(2, id_barang);
            statement.setInt(3, id_kasir);
            statement.setInt(4, jumlah_beli);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data penjualan berhasil ditambahkan!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void tampilkanDataBarang() {
        try {
            String sql = "SELECT * FROM tabel_barang";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            System.out.println("\n=== Data Barang ===");
            while (result.next()) {
                System.out.println("ID Barang: " + result.getInt("id_barang")
                        + ", Nama Barang: " + result.getString("nama_barang")
                        + ", Harga Jual: " + result.getDouble("harga_jual")
                        + ", Stok: " + result.getInt("stok"));
            }
            
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void tampilkanDataKasir() {
        try {
            String sql = "SELECT * FROM tabel_kasir";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            System.out.println("\n=== Data Kasir ===");
            while (result.next()) {
                System.out.println("ID Kasir: " + result.getInt("id_kasir")
                        + ", Nama Kasir: " + result.getString("nama_kasir")
                        + ", Alamat: " + result.getString("alamat")
                        + ", Telepon: " + result.getString("telepon"));
            }
            
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        return sdf.format(currentDate);
    }
}
