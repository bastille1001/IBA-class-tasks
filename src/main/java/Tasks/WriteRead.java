package Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WriteRead {

    public static int rand() {
        return (int) (Math.random() * 60 - 30);
    }
    public static List<Integer> generate(){
        List<Integer> randoms = IntStream.range(0,100)
                .map(x-> rand())
                .boxed()
                .collect(Collectors.toList());
        return randoms;
    }

    private static void write(List<String> processed, String name) throws IOException {
        File ofile = new File(name);
        BufferedWriter bw = new BufferedWriter(new FileWriter(ofile));
        for (String line: processed) {
            bw.write(line);
            bw.write("\n");
        }
        bw.close();
    }

    private static List<String> read(String name) throws IOException {
        File ifile = new File(name);
        FileReader fr = new FileReader(ifile);
        BufferedReader br = new BufferedReader(fr);
        List<String> lines = br.lines().collect(Collectors.toList());
        br.close();
        return lines;
    }

    private static List<Integer> convert(List<String> origin){
        List<Integer> num = new ArrayList<>();
        for(String s : origin) num.add(Integer.valueOf(s));
        return num;
    }

    private static List<String> convertSI(List<Integer> origin){
        List<String> strings = origin.stream().map(Object::toString)
                .collect(Collectors.toList());
        return strings;
    }

    private static List<Integer> process(List<Integer> data) {
        return data.stream().sorted().collect(Collectors.toList());
    }

    private static List<String> read_CLASSIC(String name) throws IOException {
        File ifile = new File(name);
        BufferedReader br = new BufferedReader(new FileReader(ifile));
        String line;
        ArrayList<String> lines = new ArrayList<>();
        while ((line = br.readLine())!=null) {
            lines.add(line);
        }
        br.close();
        return lines;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> randoms = generate();
        List<String> randoms2 = convertSI(randoms);
        write(randoms2,"file1.txt");
        List<String> contents = read("file1.txt");
        List<Integer> randoms1 = convert(contents);
        List<Integer> sorted_randoms = process(randoms1);
        List<String> sorted_randomss = convertSI(sorted_randoms);
        write(sorted_randomss,"file2.txt");
    }
}
