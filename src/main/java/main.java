import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.*;

import static java.lang.Thread.sleep;

//a tree flowers in twine winding
public class main {

    static String base = "C:/Users/Richard/Dropbox/Documents/stain/stain";
    public static void main(String[] args) {
//        linkPDFs();
//        following();
        channel();
    }
    public static void following(){
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.are.na");
            WebElement webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/a[1]"));
            webEl.click();
            sleep(8000);
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/input[1]"));
            webEl.sendKeys("rhizoming3@proton.me");
//            webEl.sendKeys("rhizoming0@proton.me");
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
            webEl.isSelected();
            webEl.sendKeys("scaredtick");
//            webEl.sendKeys("ObsidianSteap1666");
            sleep(1000);
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
            webEl.click();
            sleep(8000);
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]"));
            webEl.click();
            sleep(8000);
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]"));
            webEl.click();
            sleep(3000);


            WebElement parentElement = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/div"));
            List<WebElement> elementList = parentElement.findElements(By.xpath("/html/body/div/main/div/div[2]/div/div"));
            int linkCnt = elementList.size();
            int waitCnt = 0;
            while(waitCnt < 4){
                System.out.println("scrolling_" + elementList.size());
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,20000)");
                if(elementList.size() == linkCnt){
                    waitCnt++;
                } else {
                    waitCnt = 0;
                    linkCnt = elementList.size();
                }
                sleep(2000);
                elementList = parentElement.findElements(By.xpath("/html/body/div/main/div/div[2]/div/div"));
            }
            System.out.println(elementList.size());
            //C:\Users\Richard\Dropbox\Documents\tencil\compendium\dot.na hyperlinks
            for(WebElement n : elementList) {
                String url = n.findElement(By.cssSelector("a")).getAttribute("href");
                String title = n.getText().split("by")[0].replaceAll("\n", "").replaceAll("([\\?.\n:,/|<>*^])", "");
                while(title.charAt(title.length()-1)==' ' || title.charAt(title.length()-1)=='.'|| title.charAt(title.length()-1)==']'){
                    title = title.substring(0,title.length()-1);
                }
                while(title.charAt(0)==' ' || title.charAt(0)=='.' || title.charAt(title.length()-1)=='['){
                    title = title.substring(1,title.length());
                }
                //*"\/<>:?
                String author = n.getText().split("by")[1].split("\n")[0];
                System.out.println(url + ", " + title + ", " + author);
                PrintWriter writer = new PrintWriter(base + "/hyperlinks/hyperlinks/" + title + ".md", "UTF-8");
                writer.println("[" + title + "](" + url + ")");
                writer.println(author + "\n\n");
                writer.println("[[hyperlink]]" + "\n\n");
                writer.close();

            }
        } catch (InterruptedException | FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public static void channel(){
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        String downloadFilepath = base + "/hyperlinks/springs/blocks/";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--start-maximized");
//        options.addArguments("--headless");

        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(cap);

        try {
//            driver.get("https://www.are.na/sarah-walley");
//            sleep(1000);
            driver.get("https://www.are.na");
            WebElement webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/a[1]"));
            webEl.click();
            sleep(8000);
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/input[1]"));
            webEl.sendKeys("rhizoming3@proton.me");
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
            webEl.isSelected();
            webEl.sendKeys("scaredtick");
            sleep(1000);
            webEl = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
            webEl.click();
            sleep(8000);
            webEl = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div/div/div/div/div/div/div[2]/div/a[2]"));
            webEl.click();
            sleep(8000);
            sleep(3000);


            //collecting profile veins
            WebElement parentElement = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/div[2]"));
            List<WebElement> channelList = driver.findElements(By.xpath("/html/body/div/main/div/div[2]/div[2]/div"));
            int linkCnt = channelList.size();
            int waitCnt = 0;
            while(waitCnt < 4){
                System.out.println("collecting veins" + channelList.size());
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,20000)");
                if(channelList.size() == linkCnt){
                    waitCnt++;
                } else {
                    waitCnt = 0;
                    linkCnt = channelList.size();
                }
                sleep(4000);
                channelList = driver.findElements(By.xpath("/html/body/div/main/div/div[2]/div[2]/div"));
            }
            List<String> channelUrls = new ArrayList<>();
            for(WebElement c : channelList) {
                channelUrls.add(c.findElement(By.cssSelector("a")).getAttribute("href"));
            }

            //iterating streams
            System.out.println(channelList.size());
            //C:\Users\Richard\Dropbox\Documents\tencil\compendium\dot.na hyperlinks
            for(String url : channelUrls) {
                int flag = 1;
                driver.get(url);
                List<WebElement> blockList = driver.findElements(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div"));
                linkCnt = blockList.size();
                waitCnt = 0;
                WebElement title = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[1]/div[1]/div/div/div/div/div[3]/a/span"));
                createDir(title.getText());
                while (waitCnt < 4) {
                    System.out.println("collecting vein content_" + blockList.size());
                    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,20000)");
                    if (blockList.size() == linkCnt) {
                        waitCnt++;
                    } else {
                        waitCnt = 0;
                        linkCnt = blockList.size();
                    }
                    sleep(2000);
                    String blockXpath = "//*[@id=\"root\"]/main/div/div[3]/div";
                    blockList = driver.findElements(By.xpath("//div[@class='Box-sc-1m85pv6-0 GridItem__Container-sc-1ijucpc-0 ipyCkC']"));
//                    /
                }
                System.out.println(blockList.size() + "\n");
                System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[1]/div[1]/div/div/div/div[3]/a/span")).getText());
                String ctitle = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[1]/div[1]/div/div/div/div[3]/a/span")).getText().replaceAll("([\\?.\n:/|<>*^])", "");
                while (ctitle.charAt(ctitle.length() - 1) == ' ' || ctitle.charAt(ctitle.length() - 1) == '.' || ctitle.charAt(ctitle.length() - 1) == ']') {
                    ctitle = ctitle.substring(0, ctitle.length() - 1);
                }
                while (ctitle.charAt(0) == ' ' || ctitle.charAt(0) == '.' || ctitle.charAt(ctitle.length() - 1) == '[') {
                    ctitle = ctitle.substring(1, ctitle.length());
                }
                //*"\/<>:?
                PrintWriter writer = new PrintWriter(base + "/" + title.getText() + "/" + ctitle + ".md", "UTF-8");
                writer.println("[[streams]]");
                int divCnt = 0;

                List<String[]> blockContents = new ArrayList<>();
                for (WebElement b : blockList) {

                    divCnt++;
                    if (flag == 1) {
                        flag = 0;
                    } else {
                        //BLOCK TITLE
                        String btitle = b.findElement(By.xpath("./a/div[2]/div/div/span")).getText().replaceAll("([\\?.\n:/|<,>*^])", "");
                        if(btitle.length()<1){
                            Random random = new Random();
                            btitle = String.format("untitled%04d", random.nextInt(10000));
                        }
                        while (btitle.charAt(btitle.length() - 1) == ' ' || btitle.charAt(btitle.length() - 1) == '.' || btitle.charAt(btitle.length() - 1) == ']') {
                            btitle = btitle.substring(0, btitle.length() - 1);
                        }
                        while (btitle.charAt(0) == ' ' || btitle.charAt(0) == '.' || btitle.charAt(btitle.length() - 1) == '[') {
                            btitle = btitle.substring(1, btitle.length());
                        }
                        System.out.print(btitle + "_ newFile " + base + "/" + title.getText()+  "/hyperlinks/springs/blocks/" + btitle + ".md, ");
                        String[] contents = new String[]{btitle, b.findElement(By.cssSelector("a")).getAttribute("href")};
                        blockContents.add(contents);
                    }
                }
                System.out.println("MINNING BLOCKS--" + ctitle);
                for(String[] cur : blockContents){
                    System.out.println("\n" + cur[0]);
                    writer.println("[[" + cur[0] + "]");
                    driver.get(cur[1]);
                    sleep(3000);
                    //website
                    ///html/body/div/main/div/div[1]/div/div/div[2]/div/div[4]/div
                    String fullSource = driver.getPageSource();
                    System.out.println(fullSource);
                    String blockType = fullSource.split("class=\"Box-sc-1m85pv6-0 FullBlockLayout__ContentContainer-sc-17ad0o3-3 ikPvuC\"")[0];
                    if(blockType.length() == fullSource.length()){
                        blockType = fullSource.split("class=\"Box-sc-1m85pv6-0 FullBlockLayout__ContentContainer-sc-17ad0o3-3 kYsoCJ\"")[0];
                    }
                    System.out.println(blockType);
                    blockType = blockType.substring(blockType.length()-20).split("ype=")[1];
                    System.out.println(blockType);
                    String linkUrl;

                    //embed
                    if(fullSource.contains("class=\"instagram-media instagram-media-rendered\"")){
                        WebElement textb = driver.findElement(By.xpath("//iframe[@class='instagram-media instagram-media-rendered']"));
                        linkUrl = textb.getAttribute("src");

                        URL siteUrl = new URL(linkUrl);
                        try(
                                BufferedReader siteReader = new BufferedReader(new InputStreamReader(siteUrl.openStream()));
                                BufferedWriter siteWriter = new BufferedWriter(new FileWriter(base + "/hyperlinks/springs/blocks/" + cur[0] + ".html"));
                        ) {
                            String line;
                            while ((line = siteReader.readLine()) != null) {
                                siteWriter.write(line);
                            }
                            System.out.println("Page downloaded.");
                        }
                        writer.println("[["+ cur[0] + ".html]]");

                        //pdf
                    } else if(blockType.contains("Link") || (fullSource.contains("Something went wrong trying to save http"))){
                        if(fullSource.contains("Something went wrong trying to save")){
                            linkUrl = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div/div/div[2]/div/div[3]/div/a[2]")).getAttribute("href");
                        }else {
                            WebElement textb = driver.findElement(By.xpath("//div[@class='Box-sc-1m85pv6-0 FullBlockLinkScreenshot__Container-sc-1v8s5ou-3 iuIRYb']"));
                            linkUrl = textb.findElement(By.cssSelector("a")).getAttribute("href");
                        }
                        URL siteUrl = new URL(linkUrl);
                        try(
                                BufferedReader siteReader = new BufferedReader(new InputStreamReader(siteUrl.openStream()));
                                BufferedWriter siteWriter = new BufferedWriter(new FileWriter(base + "/hyperlinks/springs/blocks/" + cur[0] + ".html"));
                        ) {
                            String line;
                            while ((line = siteReader.readLine()) != null) {
                                siteWriter.write(line);
                            }
                            System.out.println("Page downloaded.");
                        }
                        writer.println("[["+ cur[0] + ".html]]");

                        //pdf
                    } else if (blockType.contains("Attachment")){
                        OkHttpClient client = new okhttp3.OkHttpClient().newBuilder().build();
                        System.out.println(driver.getPageSource());

                        String source = driver.getPageSource();
                        String src = source.split("cfCZbY\"><iframe src")[1].split("\"")[1];
                        Request request = new Request.Builder().url(src).build();
                        Response response = client.newCall(request).execute();

                        File downloadedLogo = new File(base + "/hyperlinks/springs/blocks/" + cur[0] + ".pdf");
                        BufferedSink sink = Okio.buffer(Okio.sink(downloadedLogo));
                        sink.writeAll(Objects.requireNonNull(response.body()).source());
                        sink.close();
                        writer.println("[["+ cur[0] + ".pdf]]");

                        //class="Box-sc-1m85pv6-0 FullBlockLayout__ContentContainer-sc-17ad0o3-3 ikPvuC"
                        //class="Box-sc-1m85pv6-0 FullBlockLayout__ContentContainer-sc-17ad0o3-3 ikPvuC"
                        ///html/body/div[3]/div/div/div/div[1]/div/div/div[1]/div
                        //image
                    } else if (blockType.contains("Image")){
                        System.out.println(driver.getPageSource());
                        String source = driver.getPageSource();
                        String src = source.split("display=\"flex\" href")[1].split("\"")[1];
                        System.out.println(src);

                        URL imageURL = new URL(src);
                        BufferedImage saveImage = ImageIO.read(imageURL);

                        ImageIO.write(saveImage, "png", new File(base + "/hyperlinks/springs/blocks/" + cur[0] + ".png"));
                        writer.println("[["+ cur[0] + ".png]]");


                        //text
                    } else if (blockType.contains("Text")){
                        WebElement textb = driver.findElement(By.xpath("//div[@class='Box-sc-1m85pv6-0 LOZkg']"));
                        textb.click();
                        textb = driver.findElement(By.xpath("//div[@class='SansSerifText-k3ls0d-0 fpEjbC']"));
                        String blockText = textb.findElement(By.cssSelector("p")).getText();
                        PrintWriter textWriter = new PrintWriter(base+ "/hyperlinks/springs/" + cur[0] + ".md", "UTF-8");
                        textWriter.println(blockText);
                        textWriter.close();
                        writer.println("[["+ cur[0] + "]]");
                    } else {
                        System.out.println("UNRECOGNIZED BLOCK TYPE" + blockType);
                        System.exit(1);
                    }
                }
                writer.close();
            }
        } catch (InterruptedException | FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    static void linkPDFs() {
        try {
            File directory = new File(base);
            PrintWriter writer = null;
            writer = new PrintWriter(base + "/fileTexts.md", "UTF-8");
            findPDF(directory, writer);
            writer.println("\n[[nexus]]");
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    private static void findPDF(File parentDirectory, PrintWriter writer) {
        File[] files = parentDirectory.listFiles();
        for (File file : files) {
            if (file.getAbsolutePath().contains(".pdf")) {
                System.out.println(file.getName());
                writer.println("[[" + file.getName() + "]]");
            }
            if(file.isDirectory()) {
                findPDF(file, writer);
            }
        }
    }

    public static void createDir(String name){
        String path = base + name;
        //Using Scanner class to get the folder name from the user
        System.out.println("Enter the name of the desired a directory: ");
        //Instantiate the File class
        File f1 = new File(path);
        //Creating a folder using mkdir() method
        boolean bool = f1.mkdir();
        if(bool){
            System.out.println("Folder is created successfully");
        }else{
            System.out.println("Error Found!");
        }
    }

    public static String getXpath(WebElement ele) {
        String str = ele.toString();
        String[] listString = new String[0];
        if (str.contains("xpath")){
            listString = str.split("xpath:");
        } else if(str.contains("id")) {
            listString = str.split("id:");
        }
        String last = listString[1].trim();
        return last.substring(0, last.length() - 1);
    }

}
