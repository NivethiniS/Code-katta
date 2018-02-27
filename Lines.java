import java.io.*;
 
 class Lines
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\Nive\\Desktop\\1.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int paragraphCount = 1;
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                paragraphCount++;
            }
            if(!(line.equals("")))
            {
                String[] wordList = line.split("\\s+");
                String[] sentenceList = line.split("[!?.:]+");
               sentenceCount += sentenceList.length;
            }
        }
        System.out.println("Number of paragraphs = " + paragraphCount);
    }
}
