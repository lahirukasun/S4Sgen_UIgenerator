package UI_Gen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class chnage_title_name {

    public static void main(String[] args) {

        rename_title("Student Management System");
    }

    public static void rename_title(String title) {

        String subSystem_title = "<title>" + title + "</title>";

        String content = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("G:\\S4Sgen\\system_resource\\ani-theme-master\\app\\index.html"));
            String str;
            while ((str = in.readLine()) != null) {
                content += str;

            }
            in.close();
            //System.out.println(content);

            if (subSystem_title.equals("<title>Student Management System</title>")) {
                System.out.println(subSystem_title);

                String text2 = content.replaceAll("Student Management System", "transport");

                System.out.println(text2);

                File file_r = new File("G:\\S4Sgen\\system_resource\\ani-theme-master\\app\\index.html");
                
                file_r.delete();

                FileWriter fWriter = null;
                BufferedWriter writer = null;
                try {
                    fWriter = new FileWriter("G:\\S4Sgen\\system_resource\\ani-theme-master\\app\\index.html");
                    writer = new BufferedWriter(fWriter);
                    writer.write(text2);
                    writer.close(); //close the writer object 
                } catch (Exception e) {

                }
            } else {
                System.out.println("no such a txt");
            }

        } catch (IOException e) {
        }
    }

}
