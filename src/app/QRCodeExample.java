package app;

import com.google.zxing.*;
import com.google.zxing.Reader;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by gustavo.peiretti QR Example
 */
public class QRCodeExample {

    public static void main(String[] arg) {

        String pathname = "Maero.png";
        String textToQr = "La imaginación es más importante que el conocimiento";

        try {
            //writeQR(textToQr, pathname);
            String text = readQR(pathname);
            System.out.print(text);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeQR(String text, String pathname) throws WriterException, IOException {

        int width = 600;
        int height = 400;

        String imageFormat = "png"; // "jpeg" "gif" "tiff"

        BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height);
        FileOutputStream outputStream = new FileOutputStream(new File(pathname));
        MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, outputStream);

    }

    private static String readQR(String pathname) throws FormatException, ChecksumException, NotFoundException, IOException {

        InputStream qrInputStream = new FileInputStream(pathname);
        BufferedImage qrBufferedImage = ImageIO.read(qrInputStream);

        LuminanceSource source = new BufferedImageLuminanceSource(qrBufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Reader reader = new MultiFormatReader();
        Result stringBarCode = reader.decode(bitmap);

        return stringBarCode.getText();
    }

}
