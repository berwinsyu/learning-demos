import java.io.IOException;
import java.io.OutputStream;

public class CharactersGenerator {
    public static void fillWithPrintableCharacterLines(OutputStream outputStream) throws IOException {
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;

        int start = firstPrintableCharacter;
        while (true){
            for (int i = start; i < start + numberOfCharactersPerLine; i++){
                outputStream.write(
                        ((i-firstPrintableCharacter)%numberOfCharactersPerLine)+firstPrintableCharacter
                );
            }
            outputStream.write('\r');
            outputStream.write('\n');
            start = ((start + 1)-firstPrintableCharacter)%numberOfCharactersPerLine+firstPrintableCharacter;
        }
    }

    public static void fillWithPrintableCharacterLinesByByteArray(OutputStream outputStream) throws IOException {
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;
        byte[] line = new byte[numberOfCharactersPerLine+2];

        int start = firstPrintableCharacter;
        while (true){
            for (int i = start; i < start + numberOfCharactersPerLine; i++){
                line[i-start] = (byte)(((i-firstPrintableCharacter)%numberOfCharactersPerLine)+firstPrintableCharacter);
            }
            line[numberOfCharactersPerLine] = (byte)'\r';
            line[numberOfCharactersPerLine+1] = (byte)'\n';
            outputStream.write(line);
            start = ((start + 1)-firstPrintableCharacter)%numberOfCharactersPerLine+firstPrintableCharacter;
        }
    }
}
