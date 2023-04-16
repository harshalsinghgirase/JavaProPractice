import java.io.*;
//try making two objects of buffered reader
//take input from the first object
//close the connection of one of them using br.close();
//then try taking input from second object
class Program6
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Taking input from br1 : ");
        String s1 = br1.readLine();
        System.out.println("br1 input = "+s1);
        br1.close();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Taking input from br2 : ");
        String s2 = br2.readLine();
    }
}

//even if we make the two objects of the buffered reader and close one of them using .close method it directly cuts the
//connection with the keyboard so we cannot take input further

//C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\InputOutput>javac program6.java
//
//        C:\Users\HARSH\Desktop\DB_Harsh\Core2Web\InputOutput>java Program6
//        Taking input from br1 :
//        Harshal
//        br1 input = Harshal
//        Taking input from br2 :
//        Exception in thread "main" java.io.IOException: Stream closed
//        at java.io.BufferedInputStream.getBufIfOpen(Unknown Source)
//        at java.io.BufferedInputStream.read(Unknown Source)
//        at sun.nio.cs.StreamDecoder.readBytes(Unknown Source)
//        at sun.nio.cs.StreamDecoder.implRead(Unknown Source)
//        at sun.nio.cs.StreamDecoder.read(Unknown Source)
//        at java.io.InputStreamReader.read(Unknown Source)
//        at java.io.BufferedReader.fill(Unknown Source)
//        at java.io.BufferedReader.readLine(Unknown Source)
//        at java.io.BufferedReader.readLine(Unknown Source)
//        at Program6.main(program6.java:18)