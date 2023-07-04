import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        System.out.println("Lütfen klasör yolunu girin:");
        Scanner scanner = new Scanner(System.in);
        String folderPath = scanner.nextLine();

        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (File file : listOfFiles) {
            System.out.println(file.getName() + " tamamlandı... \n");
            if (file.isFile() && file.getName().endsWith(".html")) {
                executor.execute(() -> {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
                        StringBuilder stringBuilder = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            stringBuilder.append(line);
                            stringBuilder.append(System.lineSeparator());
                        }
                        String dosyaAdi = file.getName().replace(".html", "");
                        int bolumNo = Integer.valueOf(dosyaAdi.substring(6));
                        String content = stringBuilder.toString();
                        String textColor = "cyan"; // varsayılan metin rengi
                        String backgroundColor = "black"; // varsayılan arka plan rengi

                        // HTML dosyasının içeriği değiştiriliyor
                        content = "<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "  <head>\n" +
                                "    <meta charset=\"UTF-8\">\n" +
                                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                                "    <title>" + folder.getName() + " Bölüm: " + bolumNo + "</title>\n" +
                                "    <style>\n" +
                                "      body {\n" +
                                "        font-family: Arial, sans-serif;\n" +
                                "        color: " + textColor + ";\n" +
                                "        background-color: " + backgroundColor + ";\n" +
                                "      }\n" +
                                "      p {\n" +
                                "        font-size: 1.2em;\n" +
                                "      }\n" +
                                "      button {\n" +
                                "        background-color: #4CAF50;\n" +
                                "        color: white;\n" +
                                "        padding: 10px 20px;\n" +
                                "        border: none;\n" +
                                "        border-radius: 4px;\n" +
                                "        cursor: pointer;\n" +
                                "      }\n" +
                                "      a {\n" +
                                "        color: #4CAF50;\n" +
                                "        text-decoration: none;\n" +
                                "      }\n" +
                                "      a:hover {\n" +
                                "        text-decoration: underline;\n" +
                                "      }\n" +
                                "    </style>\n" +
                                "  </head>\n" +
                                "  <body>\n" +
                                "    <div class=\"container\">\n" +
                                "      <p>\n" +
                                "        <span>\n" +
                                "          <button onclick=\"changeTextColor()\">Metin Rengini Değiştir</button>\n" +
                                "        </span>\n" +
                                "        <span>\n" +
                                "          <button onclick=\"changeBackgroundColor()\">Arka Plan Rengini Değiştir</button>\n"
                                +
                                "        </span>\n" +
                                "      </p>\n" +
                                "      <a href=\"Bolum_" + (bolumNo - 1) + ".html\">Önceki</a><br>\n" +
                                "      <a href=\"Bolum_" + (bolumNo + 1) + ".html\">Sonraki</a>\n" +
                                content +
                                "    </div>\n" +
                                "    <script>\n" +
                                "      function changeTextColor() {\n" +
                                "        var newColor = prompt('Lütfen yeni metin rengini girin:', 'red');\n" +
                                "        document.body.style.color = newColor;\n" +
                                "      }\n" +
                                "      function changeBackgroundColor() {\n" +
                                "        var newColor = prompt('Lütfen yeni arka plan rengini girin:', 'white');\n" +
                                "        document.body.style.backgroundColor = newColor;\n" +
                                "      }\n" +
                                "    </script>\n" +
                                "  </body>\n" +
                                "</html>";
                        try (BufferedWriter writer = new BufferedWriter(
                                new OutputStreamWriter(new FileOutputStream(file)))) {
                            writer.write(content);
                        } catch (IOException e) {
                            System.err.println("Dosya yazma hatası: " + e.getMessage());
                        }
                    } catch (IOException e) {
                        System.err.println("Dosya okuma hatası: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.err.println("Bölüm numarası çıkarma hatası: " + e.getMessage());
                    }
                });
            }
        }
        executor.shutdown();
    }
}
