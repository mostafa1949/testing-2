import java.io.*;
import java.util.*;

public class Watch{
    ArrayList<String> output = new ArrayList<String>();
    String inputString;

    public String getinputString() {
        return inputString;
    }

    public void setinputString(String myInput) {
        inputString = myInput;
    }

    public void States() throws IOException {
        String inputString = getinputString();
        if (inputString.length() == 0) {
            File f = new File("Output.txt");
            FileOutputStream fos = new FileOutputStream(f);
            PrintWriter pw = new PrintWriter(fos);
            output.add("Your Input is empty");
            pw.write(String.valueOf(output));
            pw.flush();
            fos.close();
            pw.close();
        } else {
            File f = new File("Output.txt");
            FileOutputStream st = new FileOutputStream(f);
            PrintWriter pw = new PrintWriter(st);

            String Currentstate = "Normal Display";
            String InnerState = "Time";
            int m = 0, h = 0, D = 1, M = 1, Y = 2000;
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                switch (Currentstate) {
                    case "Normal Display":
                        if (currentChar == 'c') {
                            Currentstate = "Update";
                            InnerState = "min";
                        }
                        if (currentChar == 'b') {
                            Currentstate = "Alarm";
                            InnerState = "Alarm";
                        }
                        if (currentChar == 'a') {
                            if (InnerState == "Time") {
                                InnerState = "Date";
                            } else {
                                InnerState = "Time";
                            }
                        }
                        if (currentChar == 'd') {
                            output.add("No action in this state with input d");
                        }
                        break;
                    case "Alarm":
                        if (currentChar == 'a') {
                            if (InnerState == "Alarm") {
                                InnerState = "Chime";
                            }
                        }
                        if (currentChar == 'b') {
                            output.add("No action in this state with input b");


                        }
                        if (currentChar == 'c') {
                            output.add("No action in this state with input c");
                        }
                        if (currentChar == 'd') {
                            Currentstate = "Normal Display";
                            InnerState = "Time";
                        }
                        break;
                    case "Update":
                        if (currentChar == 'a') {
                            switch (InnerState) {
                                case "min":
                                    InnerState = "hour";
                                    break;
                                case "hour":
                                    InnerState = "day";
                                    break;
                                case "day":
                                    InnerState = "month";
                                    break;
                                case "month":
                                    InnerState = "year";
                                    break;
                                case "year":
                                    Currentstate = "Normal Display";
                                    InnerState = "Time";
                                    break;
                            }
                        }
                        if (currentChar == 'b') {
                            switch (InnerState) {
                                case "min":
                                    m++;
                                    if (m == 60) {
                                        m = 0;
                                        h++;
                                        if (h == 24) {
                                            h = 0;
                                            D++;
                                            if (D == 31) {
                                                D = 1;
                                                M++;
                                                if (M == 13) {
                                                    M = 1;
                                                    Y++;
                                                }
                                            }

                                        }
                                    }
                                case "hour":
                                    h++;
                                    if (h == 24) {
                                        h = 0;
                                        D++;
                                        if (D == 31) {
                                            D = 1;
                                            M++;
                                            if (M == 13) {
                                                M = 1;
                                                Y++;
                                            }
                                        }

                                    }
                                case "day":
                                    D++;
                                    if (D == 31) {
                                        D = 1;
                                        M++;
                                        if (M == 13) {
                                            M = 1;
                                            Y++;
                                        }
                                    }
                                case "month":
                                    M++;
                                    if (M == 13) {
                                        M = 1;
                                        Y++;
                                    }
                                case "year":
                                    Y++;

                            }
                        }
                        if (currentChar == 'c') {
                            output.add("No action in this state with input c");

                        }
                        if (currentChar == 'd') {
                            Currentstate = "Normal Display";
                            InnerState = "Time";
                        }
                        break;

                }
                output.add("Current State is : " + Currentstate);
                output.add("Current innerState is : " + InnerState);
                output.add("DATE: " + Y + " - " + M + " - " + D);
                output.add("TIME: " + h + " : " + m);


            }
            System.out.println(output);
            pw.write(String.valueOf(output));
            pw.flush();
            st.close();
            pw.close();
        }
    }

    public static void main(String[] args) {
        Watch x = new Watch();
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your input string in lowercase: ");
        String n = inp.next();
        x.setinputString(n);
        try
        {
            x.States();
        }
       catch (IOException e) {
            e.printStackTrace();
        }
    }

}
