import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya adı: ");
        String dosyaAdi = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new java.io.File(dosyaAdi))) {
            int sayac = 1;
            while (fileScanner.hasNextLine()) {
                String url = fileScanner.nextLine().trim();
                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();

                con.setRequestMethod("GET");
                con.setRequestProperty("User-Agent", "Mozilla/5.0");

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                String rawHTML = content.toString();
                Pattern pattern = Pattern.compile("<div id=\"icerik\" class=\"noselectt\">(.*?)</div>");
                Matcher matcher = pattern.matcher(rawHTML);

                if (matcher.find()) {
                    String textColor = "cyan"; // varsayılan metin rengi
                    String backgroundColor = "black"; // varsayılan arka plan rengi
                    String contentText = matcher.group(1);
                    FileWriter writer = new FileWriter("tlhp/bolum" + sayac + ".html");
                    writer.write(
                            "<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><style>body { color: "
                                    + textColor + "; background-color: " + backgroundColor + "; }</style></head><body>"
                                    + "<p><span><button onclick=\"changeTextColor()\">Metin Rengini Değiştir</button></span><span><button onclick=\"changeBackgroundColor()\">Arka Plan Rengini Değiştir</button></span></p><a href=\"bolum"
                                    + (sayac - 1) + ".html\">Önceki</a><br><a href=\"bolum" + (sayac + 1)
                                    + ".html\">Sonraki</a>"
                                    + contentText
                                    + "<script>function changeTextColor() { var newColor = prompt('Lütfen yeni metin rengini girin:', 'red'); document.body.style.color = newColor; } function changeBackgroundColor() { var newColor = prompt('Lütfen yeni arka plan rengini girin:', 'white'); document.body.style.backgroundColor = newColor; }</script></body></html>");
                    writer.close();
                    System.out.println(url + " adresinden veri başarıyla kaydedildi.");
                    sayac++;
                } else {
                    System.out.println(url + " adresinde içerik bulunamadı.");
                }
            }
        } catch (Exception e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}