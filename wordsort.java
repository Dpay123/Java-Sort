import java.io.*;
import java.util.*;

public class wordsort {
    public static void main(String[] args) throws IOException {
        String inFile;
        String outFile;
        // runs if user specified input and output file only
        if(args.length == 2){
            // store user command input in variables
            inFile = args[0];
            outFile = args[1];
            // create file reader for input file
            FileReader fr = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fr);
            // we don't know input size so we make a dynamic array
            ArrayList<String> str = new ArrayList<>();
            String line = "";
            // iterate over every line until reach the end
            while((line=reader.readLine())!= null) {
                // add line to dynamic array
                str.add(line);
            }
            reader.close();
        
            // sort dynamic array by ascending order
            Collections.sort(str);

            // create file writer for output file        
            FileWriter writer = new FileWriter(outFile);
            for(String s: str){
                // write each line
                writer.write(s);
                // separate each line by newline
                writer.write("\r\n");
            }
            writer.close();
            return; //success
            }
        }
        // Command Line Syntax Error!
        // Issue appropriate error message
    }