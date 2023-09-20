
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.File;

public class ReadText {
  public static void main(String [] args) throws IOException {
    String textFileName = "input.txt";
    List<String> allLines = Files.readAllLines(new File(textFileName).toPath(), Charset.defaultCharset());

    int matala = 0;
    int test = 0;

    for(int i=0; i<allLines.size(); i++) 
    {
        int test = Integer.parseInt(allines.get(i));
        if(test < matala)
        {
          matala = test;
        }
    }

    if(matala < 0)
    {
      matala *= -1;
    }
    else
    {
      matala = 0;
    }

    for(int j=0; j<allLines.size(); j++) 
    {
        int num = Integer.parseInt(allLines.get(i));
        if(num < 0)
        {
          System.out.println((" "*(matala+num)) + "|");
        }
        else
        {
          System.out.println((" "*matala) + "|" + ("+")*num);
        }
    }
  }
}